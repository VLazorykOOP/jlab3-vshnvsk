package Task2;

public class Euro extends Currency{
    public Euro(double amount){
        super(amount);
    }
    @Override
    public double toUAN() {
        return amount * 40.5;
    }

    @Override
    public void print() {
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
