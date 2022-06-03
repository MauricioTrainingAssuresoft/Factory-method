package chainOfResponsability;

import java.util.HashMap;

import static org.junit.Assert.*;

public class DataEntryTest {

    @org.junit.Test
    public void replaceData() {
        HashMap<String,String > dataEntrace = new HashMap<>();
        DataEntry dataEntry = new DataEntry(dataEntrace);
        String result = dataEntry.replaceData("replace", "ok");
        assertTrue(result.length() > 0);
    }
}