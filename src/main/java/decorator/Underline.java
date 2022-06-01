package decorator;

public class Underline extends Decorator {
    public Underline(IProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName() {
        return  "\033[4;30m" + wrapee.getName() + "\033[0m";
    }
}
