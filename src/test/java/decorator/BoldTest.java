package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoldTest {
    Name name = new Name("Mauricio");
    @Test
    public void getNameReturnString() {
        Bold bold = new Bold(name);
        String result =  bold.getName();
        assertTrue(result.length() > 0);
    }
}