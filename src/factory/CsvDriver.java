package factory;

public class CsvDriver implements IDataDriver{
    @Override
    public String read(String fileName) {
        return "Reading " + fileName;
    }

    @Override
    public void write(String fileName, String content) {
        System.out.println(fileName + " Wrote " + "in " + content);
    }
    @Override
    public String getUsers(String fileName) {
        return read(fileName);
    }
}
