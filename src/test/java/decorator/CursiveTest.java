package decorator;

import static org.junit.Assert.*;

public class CursiveTest {
    Name name = new Name("Mauricio");
    @org.junit.Test
    public void getNameReturnString() {
        Cursive cursive = new Cursive(name);
        String result =  cursive.getName();
        assertTrue(result.length() > 0);
    }
}