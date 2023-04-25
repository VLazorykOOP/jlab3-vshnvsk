package Task2;

public class Dollar extends Currency{
    public Dollar(double amount, double exchangeRate){
        super(amount, exchangeRate);
    }
    public double toUAN(){
        return amount * exchangeRate;
    }
    public void print(){
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
