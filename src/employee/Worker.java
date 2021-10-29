package employee;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Worker extends Employee {

    // attributes
    // * employment date
    // * bonus
    public Date dateOfEmployment;
    public BigDecimal bonus;


    protected Worker(String firstName, String dob, String surname, BigDecimal salary, Manager manager,
                     Date dateOfEmployment, BigDecimal bonus, List<Trainee> trainees) {
        super(firstName, dob, surname, salary, manager, trainees);
        this.dateOfEmployment = dateOfEmployment;
        this.bonus = bonus;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

  public BigDecimal getBonus() {
    return bonus;
  }

  public void setBonus(BigDecimal bonus) {
    this.bonus = bonus;
  }

  @Override
    public String toString() {
        return "Worker{" +
                "dateOfEmployment=" + dateOfEmployment +
                ", bonus=" + bonus +
                ","+ getFirstName() + "," +
                getSurname() + "," + getDob() +
                '}';
    }

}