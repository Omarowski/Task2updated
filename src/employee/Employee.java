package employee;

import java.math.BigDecimal;
import java.util.List;

public class Employee extends Person {
    //
    // attributes:
    // * salary (use BigDecimal type for representing currency values)
    // * manager (empty if at top of hierarchy)
    private final BigDecimal salary;
    private final Manager manager;
    private final List<Trainee> staff;





    protected Employee(String firstName, String dob, String surname, BigDecimal salary, Manager manager, List<Trainee> staff) {
        super(firstName, dob, surname);
        this.salary = salary;
        this.manager = manager;
        this.staff = staff;
    }

    public List<Trainee> getStaff() {
        return staff;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Manager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", manager=" + manager + "," + getFirstName() +
                ","+ getDob() + "," + getSurname() +
                '}';
    }

}