package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightModeTest {
    Name name = new Name("Mauricio");
    @Test
    public void getNameReturnString() {
        LightMode lightMode = new LightMode(name);
        String result =  lightMode.getName();
        assertTrue(result.length() > 0);
    }
}