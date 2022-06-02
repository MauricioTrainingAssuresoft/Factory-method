package observer.susbscriber;

import observer.User;

public class EmailListener implements IListener{
    @Override
    public void notify(User user) {
        System.out.println("Event sending email captured " + user.getEmail());
    }
}
