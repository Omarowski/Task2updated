package employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Trainee extends Employee {

  // attributes:
  // * apprenticeship start date
  // * apprenticeship length (in days)
  private final LocalDate startDateApprenticeship;
  private int length;

  public Trainee(
          String firstName,
          String surname,
          LocalDate dob,
          Manager manager,
          BigDecimal salary,
          LocalDate startDateApprenticeship, int length) {
    super(firstName, surname,dob, manager, salary);
    this.startDateApprenticeship = startDateApprenticeship;
    this.length = length;
    manager.addSubordinates(this);

  }

  public LocalDate getStartDateApprenticeship() {
    return startDateApprenticeship;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }
}