package factory;

import factory.Creator;

public class CreatorCsv extends Creator {
    @Override
    public IDataDriver createDatadriver() {
        return new CsvDriver();
    }
}
