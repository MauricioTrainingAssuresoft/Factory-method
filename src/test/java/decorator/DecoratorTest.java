package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {
    Name name = new Name("Mauricio");
    @Test
    public void getNameReturnString() {
        Decorator decorator = new Decorator(name);
        String result =  decorator.getName();
        assertTrue(result.length() > 0);
    }
}