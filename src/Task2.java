import Task2.*;
import static Checkers.positive.*;
import java.lang.String;
public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter the number of currencies:");
        int n = getPositiveInteger();
        Currency[] currencies = new Currency[n];

        int type = 1;

        for (int i = 0; i < n; i++){
            do{
                System.out.println("Select:");
                System.out.println("1. Dollar");
                System.out.println("2. Euro");
                type = getPositiveInteger();
            } while (type < 1 || type > 2);

            switch (type){
                case 1:
                    System.out.println("Enter the amount of money: ");
                    double d = getPositiveDouble();
                    System.out.println("Enter the currency rate: ");
                    double cd = getPositiveDouble();
                    currencies[i] = new Dollar(d, cd);
                    break;
                case 2:
                    System.out.println("Enter the amount of money: ");
                    double e = getPositiveDouble();
                    System.out.println("Enter the currency rate: ");
                    double ce = getPositiveDouble();
                    currencies[i] = new Euro(e, ce);
                    break;

                default:
                    System.out.println("No matches!");
            }
        }

        System.out.println(" ");
        System.out.println("Result:");
        for (int i = 0; i < n; i++){
            System.out.println("Information about " + (i + 1) + " currency:");
            currencies[i].print();
            System.out.println(" ");
        }

        if(n >= 2){
            System.out.println(currencies[0].equals(currencies[1]));
        }else {
            System.out.println("Sorry, not enough elements!");
        }
    }
}

