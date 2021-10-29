package payroll;


import employee.Employee;
import employee.Manager;
import employee.Trainee;
import employee.Worker;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class HumanResourcesStatistics {
    private static Predicate<Employee> isWorker = e -> e instanceof Worker;
    private static Predicate<Employee> isTrainee = e -> e instanceof Trainee;

    public static List<PayrollEntry> payroll(List<Employee> employees) {
        return employees.stream().map(HumanResourcesStatistics::payrollEntry).collect(Collectors.toList());
    }

    private static PayrollEntry payrollEntry(Employee e) {
        if (e instanceof Worker) {
            return new PayrollEntry(e, e.getSalary(), ((Worker) e).getBonus());
        } else {
            return new PayrollEntry(e, e.getSalary(), null);
        }
    }


    // payroll for all subordinates
    public static List<PayrollEntry> subordinatesPayroll(Manager manager) throws Exception {
        if (manager == null) {
            throw new Exception("No Employess");
        }
        List<PayrollEntry> allPayRoll = new ArrayList<>();
        manager.getAllSubordinates().stream().forEach(
                e -> allPayRoll.add(
                        new PayrollEntry(e, e.getSalary(),
                                new BigDecimal(0))));
        return allPayRoll;

    }

    public static BigDecimal totalBonus(List<Employee> employees) throws Exception {
        return employees.stream()
                .filter(e -> e instanceof Worker)
                .map(w -> ((Worker) w).getBonus())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

    }

    public static List<Employee>  longestSeniority( List<Employee> employees) {
        return  employees
                .stream().filter(e -> HumanResourcesStatistics.getSeniority(e).equals(employees.stream()
                        .map(emp -> HumanResourcesStatistics.getSeniority(emp)) //
                        .reduce(Period.ZERO, (partialResult, next) -> {
                            if (partialResult.toTotalMonths() * 30 + partialResult.getDays() > next.toTotalMonths() * 30 + next.getDays()) {
                                return partialResult;
                            } else {
                                return  next;
                            }
                        }))).collect(Collectors.toList());

    }

    private static Period getSeniority(Employee emp){

        if (emp instanceof Worker)
            return Period.between(((Worker) emp).getDateOfEmployment(),LocalDate.now());
        else
        if (emp instanceof Trainee)
            if(((Trainee) emp).getStartDateApprenticeship()
                    .plusMonths(((Trainee) emp).getLength()).isBefore(LocalDate.now()))
                return Period.between(((Trainee) emp).getStartDateApprenticeship(),((Trainee) emp).getStartDateApprenticeship()
                        .plusMonths(((Trainee) emp).getLength()));
            else
                return Period.between(((Trainee) emp).getStartDateApprenticeship(),LocalDate.now());
        else
            return null;
    }

    public static BigDecimal highestSalaryWithoutBonus(List<Employee> employees) throws Exception {
        if (employees == null) {
            throw new Exception("No Employees");

        }
        return employees
                .stream()
                .map(emp -> emp.getSalary())
                .reduce(BigDecimal.ZERO, (partialResult, next) -> {
                    if (partialResult.compareTo(next) > 0) {
                        return partialResult;
                    } else {
                        return next;
                    }
                });

    }

    public static BigDecimal highestSalaryIncludingBonus(List<Employee> employees) {
        return employees //
                .stream() //
                .map(e -> e.getSalary().add(HumanResourcesStatistics.getBonus(e))) //
                .reduce(BigDecimal.ZERO, (partialResult, next) -> {
                    if (partialResult.compareTo(next) > 0) {
                        return partialResult;
                    } else {
                        return next;
                    }
                });
    }

    private static BigDecimal getBonus(Employee e) {
        if (e instanceof Worker) {
            return ((Worker) e).getBonus();
        } else return new BigDecimal(0);
    }

    public static List<Employee> surnameBeginsWithA(Manager manager){
        List<Employee> allSurnames = manager.getAllSubordinates();
        return allSurnames
                .stream()
                .filter(employee -> employee.getSurname().startsWith(String.valueOf('A')))
                .collect(Collectors.toList());

    }

    public static List<Employee> earnMoreThan1000(List<Employee> employees) {
        employees
                .stream()
                .filter(emp -> compareTo1000(emp))
                .collect(Collectors.toList());

        return employees;
    }

    private static BigDecimal getSalPlusBonus(Employee e) {
        if (e instanceof Worker)
            return e.getSalary().add(((Worker) e).getBonus());
        else return e.getSalary();
    }

    private static boolean compareTo1000(Employee e) {
        return HumanResourcesStatistics.getSalPlusBonus(e).compareTo(new BigDecimal(1000)) > 0;
    }

    // ...
    // rest of the methods specified in the assignment description


    /**
     * samples for functional processing in Java
     */
    public static List<Short> getAges(List<Employee> employees) {
        if (employees == null) {
            return null;
        }
        List<Short> ages = employees //
                .stream() //
                .map(emp -> emp.getAgeOfPerson()) //
                .collect(Collectors.toList());
        return ages;
    }

    public static void printAges(List<Employee> employees) {
        if (employees == null) {
            return;
        }
        employees //
                .stream() //
                .map(emp -> (int) emp.getAgeOfPerson()) //
                .forEach(age -> System.out.print(age + ", "));
        System.out.println();
    }

    //
    // average age for the Employees whose first name starts with 'A' and they are older than 20
    public static short getAverageAgeInline(List<Employee> employees) {
        if (employees == null) {
            return 0;
        }
        int employeeTotalAge = employees //
                .stream() //
                .filter(emp -> emp.getFirstName().startsWith("A") && emp.getAgeOfPerson() > 20) //
                .map(emp -> (int) emp.getAgeOfPerson()) //
                .reduce(0, //
                        (total, age) -> total + age);

        long filteredEmployeesCount = employees //
                .stream() //
                .filter(emp -> emp.getFirstName().startsWith("A") && emp.getAgeOfPerson() > 20) //
                .count();

        return (short) (employeeTotalAge / filteredEmployeesCount);
    }

    public static short getAverageAgeMethodReference(List<Employee> employees) {
        if (employees == null) {
            return 0;
        }
        int employeeTotalAge = employees //
                .stream() //
                .map(emp -> (int) emp.getAgeOfPerson()) //
                .reduce(0, HumanResourcesStatistics::totalAge);
        return (short) (employeeTotalAge / employees.size());
    }

    public static short getMaxAgeInline(List<Employee> employees) {
        short employeeMaxAge = employees //
                .stream() //
                .map(emp -> emp.getAgeOfPerson()) //
                .reduce((short) 0, //
                        (maxAge, age) -> {
                            if (maxAge < age) {
                                return age;
                            } else {
                                return maxAge;
                            }
                        });
        return employeeMaxAge;
    }

    public static short getMaxAgeMethodReference(List<Employee> employees) {
        short employeeMaxAge = employees //
                .stream() //
                .map(emp -> emp.getAgeOfPerson()) //
                .reduce((short) 0, HumanResourcesStatistics::maxAge);
        return employeeMaxAge;
    }

    private static int totalAge(int totalAge, int age) {
        //
        return totalAge + age;
    }

    private static short maxAge(short maxAge, short age) {
        if (maxAge < age) {
            return age;
        } else {
            return maxAge;
        }
    }

}