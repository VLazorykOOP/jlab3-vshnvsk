package Task3;

public class Dollar implements Currency{
    protected double amount;
    protected double exchangeRate;
    public Dollar(double amount, double exchangeRate){
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }
    @Override
    public double toUAN() {
        return amount * exchangeRate;
    }
    @Override
    public void print() {
        System.out.println("Currency: Dollar");
        System.out.print(amount + " USD: ");
        System.out.println(toUAN() + " UAN");
    }
    public String toString(){
        return amount + " USD";
    }
    public boolean equals(Object c){
        if(c instanceof Dollar){
            return amount == ((Dollar) c).amount;
        }else {
            return false;
        }
    }
}
