package Task3;

public class Euro implements Currency{
    private double amount;
    private double exchangeRate;
    public Euro(double amount, double exchangeRate){
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }
    @Override
    public double toUAN() {
        return amount * exchangeRate;
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
