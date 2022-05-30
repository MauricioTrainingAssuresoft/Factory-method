package factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void getInstanceReturnLogger() {
        Logger logger = Logger.getInstance();
        assertNotNull(logger);
    }
}