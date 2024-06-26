package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + "" + lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        double newSal = ((percent / 100.0) + 1);
        setSalary((int) (newSal * salary));
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee[id= " + id + ",name= " + getName() + ",salary= " + salary + "]";
    }
}
