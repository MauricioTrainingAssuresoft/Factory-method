package observer.publisher;

import observer.EventName;
import observer.User;
import observer.susbscriber.IListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserRegister implements IUserRegister {

    private HashMap<EventName, List<IListener>> subscribers = new HashMap<>();

    public UserRegister(EventName... operations) {
        for (EventName operation : operations){
            this.subscribers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(IListener susbcribe, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.add(susbcribe);
    }

    public void unsubscribe(IListener unsusbcribe, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.remove(unsusbcribe);
    }

    @Override
    public String register(User user){
        System.out.println(user.getName() + " was register");
        this.trigger(EventName.REGISTER, user);
        return "successful";
    }

    private void trigger(EventName eventName, User event){
        List<IListener> currentList = subscribers.get(eventName);
        for (IListener listener : currentList){
            listener.notify(event);
        }
    }
}
