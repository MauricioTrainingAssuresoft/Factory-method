import factory.Creator;
import factory.CreatorCsv;
import factory.CreatorXml;
import factory.IDataDriver;

public class Main {
    public static void main(String[] args) {
        Creator creatorCsv = new CreatorCsv();
        IDataDriver csvFile = creatorCsv.createDatadriver();
        System.out.println(csvFile.read("Employees File"));

        Creator creatorXml = new CreatorXml();
        IDataDriver xmlFile = creatorXml.createDatadriver();
        xmlFile.write("Taxes File", "content");
    }
}
