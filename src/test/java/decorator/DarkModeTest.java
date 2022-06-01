package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DarkModeTest {
    Name name = new Name("Mauricio");
    @Test
    public void getNameReturnString() {
        DarkMode darkMode = new DarkMode(name);
        String result =  darkMode.getName();
        assertTrue(result.length() > 0);
    }
}