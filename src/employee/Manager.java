package employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Manager extends Worker {
  // attributes
  // * subordinates (a list of immediate subordinates)
  // * all subordinates (derived --- i.e. calculated on the fly --- a list of subordinates in all
  // hierarchy)
  private List<Employee> subordinates;
  protected Manager(
      String firstName,
      String dob,
      String surname,
      BigDecimal salary,
      Manager manager,
      Date dateOfEmployment,
      BigDecimal bonus,
      List<Employee> subordinates, List<Trainee> staff) {
    super(firstName, dob, surname, salary, manager, dateOfEmployment, bonus, staff);
    this.subordinates = subordinates;

  }

///todo get list of all subordinates
  public List<Employee> getSubordinates() {
    return subordinates;
  }



  @Override
    public String toString() {
        return "Manager{" +
                "dateOfEmployment=" + dateOfEmployment +
                ", bonus=" + bonus + ","+ getFirstName() + "," +
                getSurname() + "," + getDob() +
                '}';
    }
}
