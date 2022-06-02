package observer.publisher;

import observer.EventName;
import observer.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegisterTest {

    @Test
    public void register() {
        User user = new User("pepe", "user@mailito.com", "https://pinterest-img", "7653458");
        UserRegister userSusbcriber = new UserRegister(EventName.REGISTER);
        String result = userSusbcriber.register(user);
        assertTrue(result.length() > 0);
    }
}