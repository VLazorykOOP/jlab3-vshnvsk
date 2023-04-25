package Task2;

public abstract class Currency {
    protected double amount;
    protected double exchangeRate;
    public Currency(double amount, double exchangeRate){
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }
    public abstract double toUAN();
    public abstract void print();
    public abstract String toString();
    public abstract boolean equals(Object c);
}
