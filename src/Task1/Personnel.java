package Task1;
public class Personnel {
    String firstname;
    String lastname;
    String surname;
    int age;
    String position;
    double salary;
    public Personnel(String firstname, String lastname, String surname,
                     int age, String position, double salary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }
    public void show(){
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age + " y.o.");
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary + " UAN");
    }
}
