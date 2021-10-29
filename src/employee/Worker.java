package employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Worker extends Employee {

    // attributes
    // * employment date
    // * bonus
    public LocalDate dateOfEmployment;
    public BigDecimal bonus;


    public Worker(String firstName,String surname, LocalDate dob,  Manager manager , BigDecimal salary,
                  LocalDate dateOfEmployment, BigDecimal bonus) {
        super(firstName,surname, dob, manager,salary);
        this.dateOfEmployment = dateOfEmployment;
        this.bonus = bonus;
        if(manager!=null){
            manager.addSubordinates(this);
        }
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public BigDecimal getBonus() {
        return bonus;
    }


}