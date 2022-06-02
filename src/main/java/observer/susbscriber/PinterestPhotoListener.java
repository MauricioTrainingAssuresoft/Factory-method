package observer.susbscriber;

import observer.User;

public class PinterestPhotoListener implements IListener{
    @Override
    public void notify(User user) {
        System.out.println("Event to get Pinterest image " + user.getUrlPinteresrPhoto());
    }
}
