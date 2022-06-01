package decorator;

public class Cursive extends Decorator{

    public Cursive(IProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName() {
        return "\033[3m" + wrapee.getName() + "\033[0m";
    }
}
