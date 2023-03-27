package Task1;
public class Worker extends Personnel {
    String specialization;
    public String getSpecialization(){ return specialization; }
    public Worker(String firstname, String lastname, String surname, int age, String position,
                  double salary, String specialization){
        super(firstname, lastname, surname, age, position, salary);
        this.specialization = specialization;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Bonus: " + specialization);
    }
}
