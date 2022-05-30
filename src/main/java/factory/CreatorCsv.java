package factory;

public class CreatorCsv implements ICreator {
    @Override
    public IDataDriver createDatadriver() {
        return new CsvDriver();
    }
}
