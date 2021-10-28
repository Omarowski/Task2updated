package employee;

import java.math.BigDecimal;
import java.util.Date;

public class Trainee extends Employee {



    // attributes:
    // * apprenticeship start date
    // * apprenticeship length (in days)
    private final Date startDateApprenticeship;


    protected Trainee(String firstName, String age, String surname, BigDecimal salary, boolean manager, Date startDateApprenticeship) {
        super(firstName, age, surname, salary, manager);
        this.startDateApprenticeship = startDateApprenticeship;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "startDateApprenticeship=" + startDateApprenticeship +
                '}';
    }
}