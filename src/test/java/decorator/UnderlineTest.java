package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnderlineTest {
    Name name = new Name("Mauricio");
    @Test
    public void getNameReturnString() {
        Underline underline = new Underline(name);
        String result =  underline.getName();
        assertTrue(result.length() > 0);
    }
}