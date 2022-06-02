package observer;

import observer.publisher.UserRegister;
import observer.susbscriber.EmailListener;
import observer.susbscriber.IListener;
import observer.susbscriber.PinterestPhotoListener;
import observer.susbscriber.SmsListener;

public class Demo {
    public static void main(String[] args) {
        User user = new User("pepe", "user@mailito.com", "https://pinterest-img", "7653458");
        IListener emailListener = new EmailListener();
        IListener smsListener = new SmsListener();
        IListener urlPhotoListener = new PinterestPhotoListener();

        UserRegister userSusbcriber = new UserRegister(EventName.REGISTER);
        userSusbcriber.subscribe(emailListener, EventName.REGISTER);
        userSusbcriber.subscribe(smsListener, EventName.REGISTER);
        userSusbcriber.subscribe(urlPhotoListener,EventName.REGISTER);

        userSusbcriber.register(user);
    }
}
