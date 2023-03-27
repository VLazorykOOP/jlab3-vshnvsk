import java.util.*;
import java.lang.String;
import static Checkers.onlyNumbers.*;
import static Checkers.positive.*;
import static Checkers.onlyLetters.*;
import Task1.*;
public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter the number of personnel: ");
        int n = getPositiveInteger();
        Personnel[] personnels = new Personnel[n];

        int category = 1;

        for (int i = 0; i < n; i++){
            do{
                System.out.println("Select the personnel category:");
                System.out.println("1. Administration");
                System.out.println("2. Worker");
                System.out.println("3. Engineer");
                category = getPositiveInteger();
            } while (category < 1 || category > 3);

            switch (category){
                case 1:
                    System.out.println("Enter firstname: ");
                    String firstname = getString();

                    System.out.println("Enter lastname: ");
                    String lastname = getString();

                    System.out.println("Enter surname: ");
                    String surname = getString();

                    System.out.println("Enter age: ");
                    int age = getPositiveInteger();

                    System.out.println("Enter position: ");
                    String position = getString();

                    System.out.println("Enter salary: ");
                    double salary = getDouble();

                    System.out.println("Enter bonus:");
                    double bonus = getDouble();

                    double salaryWithBonus = salary + bonus;
                    personnels[i] = new Administration(firstname, lastname, surname,
                                        age, position, salary, bonus, salaryWithBonus);
                    break;
                case 2:
                    System.out.println("Enter firstname: ");
                    String firstname1 = getString();

                    System.out.println("Enter lastname: ");
                    String lastname1 = getString();

                    System.out.println("Enter surname: ");
                    String surname1 = getString();

                    System.out.println("Enter age: ");
                    int age1 = getPositiveInteger();

                    System.out.println("Enter position: ");
                    String position1 = getString();

                    System.out.println("Enter salary: ");
                    double salary1 = getDouble();

                    System.out.println("Enter specialization: ");
                    String specialization = getString();

                    personnels[i] = new Worker(firstname1, lastname1, surname1, age1, position1,
                            salary1, specialization);
                    break;
                case 3:
                    System.out.println("Enter firstname: ");
                    String firstname2 = getString();

                    System.out.println("Enter lastname: ");
                    String lastname2 = getString();

                    System.out.println("Enter surname: ");
                    String surname2 = getString();

                    System.out.println("Enter age: ");
                    int age2 = getPositiveInteger();

                    System.out.println("Enter position: ");
                    String position2 = getString();

                    System.out.println("Enter salary: ");
                    double salary2 = getDouble();

                    System.out.println("Enter specialization: ");
                    String specialization2 = getString();

                    int discharge;
                    do{
                        System.out.println("Enter discharge (1, 2, 3):");
                        discharge = getPositiveInteger();
                    }while (discharge < 1 || discharge > 3);

                    personnels[i] = new Engineer(firstname2, lastname2, surname2, age2,
                            position2, salary2, specialization2, discharge);
                    break;
                default:
                    System.out.println("No matches!");
            }
        }

        System.out.println(" ");
        System.out.println("Result:");
        for (int i = 0; i < n; i++){
            System.out.println("Information about " + (i + 1) + " personnel:");
            personnels[i].show();
            System.out.println(" ");
        }
    }
}