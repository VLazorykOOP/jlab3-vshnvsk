package Task3;

public class Dollar implements Currency{
    protected double amount;
    public Dollar(double amount){
        this.amount = amount;
    }
    @Override
    public double toUAN() {
        return amount * 38.1;
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
