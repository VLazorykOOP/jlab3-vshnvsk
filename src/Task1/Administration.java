package Task1;
public class Administration extends Personnel {
    double bonus;
    double salaryWithBonus;
    public Administration(String firstname, String lastname, String surname,
                          int age, String position, double salary, double bonus, double salaryWithBonus){
        super(firstname, lastname, surname, age, position, salary);
        this.bonus = bonus;
        this.salaryWithBonus = salaryWithBonus;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Bonus: " + bonus + " UAN");
        System.out.println("Salary with bonus: " + salaryWithBonus + " UAN");
    }
}
