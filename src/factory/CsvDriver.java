package factory;

public class CsvDriver implements IDataDriver{
    @Override
    public String read(String fileName) {
        return "Jose, Mauricio, Alex,Jonathan, Melissa... Read from " + fileName;
    }

    @Override
    public void write(String fileName, String content) {
        System.out.println(fileName + " Wrote " + "in " + content);
    }
}
