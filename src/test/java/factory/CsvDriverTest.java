package factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CsvDriverTest {

    @Test
    public void readReturnString() {
        IDataDriver csvDrive = new CsvDriver();
        String result =  csvDrive.read("ok");
        assertTrue(result.length() > 0);
    }
}