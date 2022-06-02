package observer.susbscriber;

import observer.User;

public class SmsListener implements IListener{
    @Override
    public void notify(User user) {
        System.out.println("Event sending sms to " + user.getPhone());
    }
}
