package decorator;

public class Bold extends Decorator{
    public Bold(IProvider wrapee) {
        super(wrapee);
    }

    @Override
    public String getName() {
        return "\033[0;1m" + wrapee.getName();
    }
}
