package Task2;

public class Dollar extends Currency{
    public Dollar(double amount){
        super(amount);
    }
    public double toUAN(){
        return amount * 38.1;
    }
    public void print(){
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
