import factory.Creator;
import factory.CreatorCsv;
import factory.CreatorXml;

public class Main {
    public static void main(String[] args) {
        Creator csv = new CreatorCsv();
        Creator xml = new CreatorXml();

        UserFileParser parseCsv = new UserFileParser(csv);
        System.out.println(parseCsv.getUsers("/path/files/Csv/file.csv"));

        UserFileParser parseXml = new UserFileParser(xml);
        System.out.println(parseXml.getUsers("/path/files/Csv/file.xml"));
    }
}
