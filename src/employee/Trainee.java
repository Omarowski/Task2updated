package employee;

import java.math.BigDecimal;
import java.util.Date;

public class Trainee extends Employee {

  // attributes:
  // * apprenticeship start date
  // * apprenticeship length (in days)
  private final Date startDateApprenticeship;
  private int length;

  protected Trainee(
      String firstName,
      String dob,
      String surname,
      BigDecimal salary,
      Manager manager,
      Date startDateApprenticeship, int length) {
    super(firstName, dob, surname, salary, manager, null);
    this.startDateApprenticeship = startDateApprenticeship;
    this.length = length;
  }

    @Override
    public String toString() {
        return "Trainee{" +
                "startDateApprenticeship=" + startDateApprenticeship +
                '}';
    }
}