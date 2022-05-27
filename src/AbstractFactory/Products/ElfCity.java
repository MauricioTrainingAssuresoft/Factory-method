package AbstractFactory.Products;

public class ElfCity implements IRaceCity{
    @Override
    public IRaceHouse getOrcHouses() {
        return new ElfHouse();
    }
}
