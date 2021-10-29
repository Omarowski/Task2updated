package payroll;

import employee.Employee;
import employee.Manager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class HumanResourcesStatistics {

    public static List<PayrollEntry> payroll(List<Employee> employees) throws Exception {
		if (employees == null) {
			throw new Exception("No Employess");
		}
		List<PayrollEntry> preparingPayroll = new ArrayList<>();
		employees.stream().forEach(
		        e-> preparingPayroll.add(
		                new PayrollEntry(e, e.getSalary(),
                                new BigDecimal(0))));
        return preparingPayroll;
    }


    // payroll for all subordinates
    public static List<PayrollEntry> subordinatesPayroll(Manager manager) {
        //
        return null;
    }


    public static BigDecimal bonusTotal(List<Employee> employees) {
        //
        return null;
    }

    public static Employee longestSeniority(List<Employee> employees) {
        //
        return null;
    }

    public static BigDecimal highestSalaryWithoutBonus(List<Employee> employees) {
        //
        return null;
    }

    public static BigDecimal highestSalaryIncludingBonus(List<Employee> employees) {
        //
        return null;
    }

    public static List<Employee> surnameBeginsWithA(Manager manager) {
//		if(manager == null) {
//			return null;
//		}
//		List<Employee> surnameBeginning =  manager
//				.stream()
//				.filter(emp -> emp.getFirstName.startsWith('A'))
//				.count();
//
        return null;

    }

    public static List<Employee> earnMoreThan1000(List<Employee> employees) {
//        if (employees == null) {
//            return null;
//        }
//        List<Employee>  searchEmployees = employees //
//                .stream() //
//                .filter(emp-> emp.getSalary()>1000)
//                .count();
        return null;
    }


    // ...
    // rest of the methods specified in the assignment description


    /**
     * samples for functional processing in Java
     *
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