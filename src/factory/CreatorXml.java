package factory;

public class CreatorXml extends Creator {
    @Override
    public IDataDriver createDatadriver() {
        return new XmlDriver();
    }
}
