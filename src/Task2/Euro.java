package Task2;

public class Euro extends Currency{
    public Euro(double amount, double exchangeRate){
        super(amount, exchangeRate);
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

    @Override
    public String toString() {
        return amount + " EUR";
    }

    @Override
    public boolean equals(Object c) {
        if(c instanceof Euro){
            return amount == ((Euro) c).amount;
        }else {
            return false;
        }
    }
}
