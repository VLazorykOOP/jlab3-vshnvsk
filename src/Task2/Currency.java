package Task2;

public abstract class Currency {
    protected double amount;
    public Currency(double amount){
        this.amount = amount;
    }
    public abstract double toUAN();
    public abstract void print();
    public abstract String toString();
    public abstract boolean equals(Object c);
}
