package decorator;

public class DarkMode extends Decorator{
    public DarkMode(IProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName(){
        return wrapee.getName() + "(╯°□°)╯︵ ┻━┻";
    }
}
