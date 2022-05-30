package factory;

public class CreatorXml implements ICreator {
    @Override
    public IDataDriver createDatadriver() {
        return new XmlDriver();
    }
}
