package factory;

import factory.IDataDriver;

public class XmlDriver implements IDataDriver {
    Logger loger = Logger.getInstance();
    @Override
    public String read(String fileName) {
        loger.info();
        return "Ana, Carlos, Juan ... Read from " + fileName;
    }

    @Override
    public void write(String fileName, String content) {
        System.out.println(fileName + " Wrote " + "in " + content);
    }
}
