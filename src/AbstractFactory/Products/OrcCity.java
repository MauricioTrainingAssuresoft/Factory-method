package AbstractFactory.Products;

public class OrcCity implements IRaceCity{
    @Override
    public IRaceHouse getOrcHouses() {
        return new OrcHouse();
    }
}
