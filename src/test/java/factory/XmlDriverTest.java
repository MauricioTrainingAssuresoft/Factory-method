package factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class XmlDriverTest {

    @Test
    public void readReturnString() {
        IDataDriver xmlDrive = new XmlDriver();
        String result =  xmlDrive.read("ok");
        assertTrue(result.length() > 0);
    }
}