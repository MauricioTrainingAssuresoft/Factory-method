package factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreatorCsvTest {

    @Test
    public void createDatadriverReturnCsvDriver() {
        ICreator creatorCsv = new CreatorCsv();
        IDataDriver result = creatorCsv.createDatadriver();
        assertNotNull(result);
    }
}