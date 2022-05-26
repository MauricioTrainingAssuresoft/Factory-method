import factory.Creator;
import factory.CreatorCsv;
import factory.CreatorXml;
import factory.IDataDriver;

public class Main {
    public static void main(String[] args) {
        Creator creatorCsv = new CreatorCsv();
        IDataDriver csvFile = creatorCsv.createDatadriver();
        csvFile.write("Employees", "D://employees");
        System.out.println(csvFile.getUsers("Employees File"));
        System.out.println("============================================");

        Creator creatorXml = new CreatorCsv();
        IDataDriver xmlFile = creatorXml.createDatadriver();
        xmlFile.write("Managers", "D://managers");
        System.out.println(csvFile.getUsers("Manager File"));
    }
}
