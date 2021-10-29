package employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Manager extends Worker {
  // attributes
  // * subordinates (a list of immediate subordinates)
  // * all subordinates (derived --- i.e. calculated on the fly --- a list of subordinates in all
  // hierarchy)
   List<Employee> subordinates = new ArrayList<>() ;


  public Manager(
          String firstName,
          String surname,
          LocalDate dob,
          Manager manager,
          BigDecimal salary,
          LocalDate dateOfEmployment,
          BigDecimal bonus
          ) {
    super(firstName, surname,dob, manager, salary, dateOfEmployment, bonus);

  }

///todo get list of all subordinates
    public List<Employee> getAllSubordinates() {
      List<Employee> allSubordinates = new ArrayList<>();
      allSubordinates.addAll(subordinates);
      allSubordinates.addAll(
              subordinates
                      .stream() //
                      .filter(emp -> emp instanceof Manager) //
                      .map(emp -> (Manager) emp)
                      .flatMap(emp -> emp.getAllSubordinates().stream()) //
                      .collect(Collectors.toList())
      );
      return allSubordinates;
}

  public void setSubordinates(List<Employee> subordinates) {
    this.subordinates = subordinates;
  }

  public List<Employee> getSubordinates() {
    return subordinates;
  }

  public void addSubordinates(Employee employee){ subordinates.add(employee);}


}
