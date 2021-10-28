package employee;

import payroll.HumanResourcesStatistics;

import java.util.List;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        Employee emp = new Employee("Amar","1990-12-20","Atzori",BigDecimal.valueOf(2000),Boolean.FALSE);
        Employee emp1 = new Employee("Omar","2001-12-20","Atzori",BigDecimal.valueOf(2000),Boolean.FALSE);
        Employee emp2 = new Employee("Amar","1973-12-20","Atzori",BigDecimal.valueOf(2000),Boolean.FALSE);
        Employee emp3 = new Employee("Omar","2003-12-20","Atzori",BigDecimal.valueOf(1500),Boolean.FALSE);
        Employee emp4 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),Boolean.FALSE);
        List<Employee> person = new ArrayList<>();
        person.add(emp);
        person.add(emp1);
        person.add(emp2);
        person.add(emp3);
        person.add(emp4);


        HumanResourcesStatistics.printAges(person);

//        System.out.println("Ages: " + HumanResourcesStatistics.getAges(person));
////        HumanResourcesStatistics.getAverageAgeInline(person);
//        System.out.println("Average Age: " + HumanResourcesStatistics.getAverageAgeMethodReference(person));
//        System.out.println("the max age in line is: " + HumanResourcesStatistics.getMaxAgeInline(person));
//        System.out.println("average age in line: "+HumanResourcesStatistics.getAverageAgeInline(person));
//        System.out.println("average : "+HumanResourcesStatistics.getMaxAgeMethodReference(person));
        //System.out.println("average : "+HumanResourcesStatistics.earnMoreThan1000(person));


    }
}
