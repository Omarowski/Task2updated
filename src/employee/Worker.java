package employee;

import java.math.BigDecimal;
import java.util.Date;

public class Worker extends Employee {

    // attributes
    // * employment date
    // * bonus
    public final Date dateOfEmployment;
    public final int bonus;


    protected Worker(String firstName, String age, String surname, BigDecimal salary, boolean manager, Date dateOfEmployment, int bonus) {
        super(firstName, age, surname, salary, manager);
        this.dateOfEmployment = dateOfEmployment;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "dateOfEmployment=" + dateOfEmployment +
                ", bonus=" + bonus +
                ","+ getFirstName() + "," +
                getSurname() + "," + getAge() +
                '}';
    }
}