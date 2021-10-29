package employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person {
    //
    // attributes:
    // * salary (use BigDecimal type for representing currency values)
    // * manager (empty if at top of hierarchy)
    private BigDecimal salary;
    private Manager manager;






    public Employee(String firstName, String surname, LocalDate dob, Manager manager, BigDecimal salary) {
        super(firstName,surname, dob );
        this.salary = salary;
        this.manager = manager;

    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Manager getManager() {
        return manager;
    }


    //setters?????
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}