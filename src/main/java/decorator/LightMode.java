package decorator;

public class LightMode extends Decorator{
    public LightMode(IProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName() {
        return wrapee.getName() + "┬─┬ノ( º _ ºノ)";
    }
}
