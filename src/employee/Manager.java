package employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public final class Manager extends Worker {
    // attributes
    // * subordinates (a list of immediate subordinates)
    // * all subordinates (derived --- i.e. calculated on the fly --- a list of subordinates in all hierarchy)


    protected Manager(String firstName, String age, String surname, BigDecimal salary, boolean manager, Date dateOfEmployment, int bonus) {
        super(firstName, age, surname, salary, manager, dateOfEmployment, bonus);
    }


    @Override
    public String toString() {
        return "Manager{" +
                "dateOfEmployment=" + dateOfEmployment +
                ", bonus=" + bonus + ","+ getFirstName() + "," +
                getSurname() + "," + getAge() +
                '}';
    }
}