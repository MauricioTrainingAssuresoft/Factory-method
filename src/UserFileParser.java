import factory.CsvDriver;
import factory.XmlDriver;

public class UserFileParser {
    public UserFileParser(){};

    private CsvDriver createCsvDriver() {
        return new CsvDriver();
    }
    public String getUsersCsv(String path) {
        CsvDriver csv = createCsvDriver();
        return csv.read(path);
    }
    private XmlDriver createXmlDriver() {
        return new XmlDriver();
    }
    public String getUsersXml(String path) {
        XmlDriver xml = createXmlDriver();
        return xml.read(path);
    }
}
