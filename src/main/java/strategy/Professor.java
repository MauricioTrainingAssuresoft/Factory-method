package strategy;

public class Professor implements ISale{
    @Override
    public Boolean sell(double amount) {
        System.out.println("book sold out to professor " + amount);
        return true;
    }
}
