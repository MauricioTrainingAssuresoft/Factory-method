package strategy;

public class Student implements ISale{
    private double percentDiscount = 0.25;
    @Override
    public Boolean sell(double amount) {
        double discount = (percentDiscount * amount);
        System.out.println("book sold out to student with discount of 25% " + (amount - discount) + "$");
        return true;
    }
}
