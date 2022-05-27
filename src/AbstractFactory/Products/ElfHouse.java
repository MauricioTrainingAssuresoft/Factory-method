package AbstractFactory.Products;

public class ElfHouse implements IRaceHouse{
    @Override
    public IRace getAssignedOrcs() {
        return new Elf();
    }
}
