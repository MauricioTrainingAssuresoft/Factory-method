package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    @Test
    public void getNameReturnString() {
        Name name = new Name("mauricio");
        String result =  name.getName();
        assertTrue(result.length() > 0);
    }
}