package Task3;

public class Euro implements Currency{
    private double amount;
    public Euro(double amount){
        this.amount = amount;
    }
    @Override
    public double toUAN() {
        return amount * 40.5;
    }
    @Override
    public void print() {
        System.out.println("Currency: Euro");
        System.out.print(amount + " EUR: ");
        System.out.println(toUAN() + " UAN");
    }
    public String toString() {
        return amount + " EUR";
    }
    public boolean equals(Object c) {
        if(c instanceof Euro){
            return amount == ((Euro) c).amount;
        }else {
            return false;
        }
    }
}
