package factory;

public interface IDataDriver {
    String read(String fileName);
    void write(String fileName, String content);
}
