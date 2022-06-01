package decorator;

public class Decorator implements IProvider{
    IProvider wrapee;

    public Decorator(IProvider wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public String getName() {
        return wrapee.getName();
    }
}
