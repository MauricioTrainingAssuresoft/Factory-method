package observer.susbscriber;

import observer.User;

public interface IListener {
    void notify(User user);
}
