package Constructor;

public class Employee {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Employee(String first, String last, int year){
        firstName = first;
        lastName = last;
        birthYear = year;
    }
    void Details(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.birthYear);
    }
    public static void main ( String [] args){
        Employee employee = new Employee("Jack ", "Daniel ", 1972);
        employee.Details();
    }

}
