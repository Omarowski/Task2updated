package employee;

import java.math.BigDecimal;

public class Employee extends Person {
    //
    // attributes:
    // * salary (use BigDecimal type for representing currency values)
    // * manager (empty if at top of hierarchy)
    private final BigDecimal salary;
    private final boolean manager;




    protected Employee(String firstName, String age, String surname, BigDecimal salary, boolean manager) {
        super(firstName, age, surname);
        this.salary = salary;
        this.manager = manager;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public boolean isManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", manager=" + manager + "," + getFirstName() +
                ","+ getAge() + "," + getSurname() +
                '}';
    }

}