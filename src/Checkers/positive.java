package Checkers;
import static Checkers.onlyNumbers.*;
public class positive {
    public static int getPositiveInteger(){
        int positive = -3;
        while(positive < 0){
            positive = getInt();
//            System.out.println("Just positive number!");
        }
        return positive;
    }
    public static double getPositiveDouble(){
        double positive = -3;
        while(positive < 0){
            positive = getDouble();
//            System.out.println("Just positive number!");
        }
        return positive;
    }
}
