package factory;

import factory.IDataDriver;

public class XmlDriver implements IDataDriver {
    @Override
    public String read(String fileName) {
        return "Ana, Carlos, Juan ... Read from " + fileName;
    }

    @Override
    public void write(String fileName, String content) {
        System.out.println(fileName + " Wrote " + "in " + content);
    }
}
