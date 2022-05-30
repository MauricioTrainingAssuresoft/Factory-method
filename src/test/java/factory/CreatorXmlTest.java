package factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreatorXmlTest {

    @Test
    public void createDatadriverReturnCsvDriver() {
        ICreator creatorXml = new CreatorXml();
        IDataDriver result = creatorXml.createDatadriver();
        assertNotNull(result);
    }
}