package AbstractFactory.Products;

public class OrcHouse implements IRaceHouse{
    @Override
    public IRace getAssignedOrcs() {
        return new Orc();
    }
}
