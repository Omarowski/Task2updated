package employee;

import payroll.HumanResourcesStatistics;

import java.time.LocalDate;
import java.util.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args) throws Exception {
        Manager ceo = new Manager("Omar", "1990-12-20", "Atzori", new BigDecimal(30000),
                null, new Date(), new BigDecimal(2000), new ArrayList<>(), new ArrayList<>());
        Manager mainManager = new Manager("Kuwaski","1990-12-20","Atzori", new BigDecimal(30000),
                ceo, new Date(), new BigDecimal(2000), new ArrayList<>(), new ArrayList<>());
        Employee emp = new Employee("Amar","1990-12-20","Atzori",BigDecimal.valueOf(2000),mainManager, new ArrayList<>());
        Employee emp1 = new Employee("Omar","2001-12-20","Atzori",BigDecimal.valueOf(2000),mainManager, new ArrayList<>());
        Employee emp2 = new Employee("Amar","1973-12-20","Atzori",BigDecimal.valueOf(2000),mainManager, new ArrayList<>());
        Employee emp3 = new Employee("Omar","2003-12-20","Atzori",BigDecimal.valueOf(1500),mainManager, new ArrayList<>());
        Employee emp4 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),mainManager, new ArrayList<>());
        mainManager.getSubordinates().addAll(Arrays.asList(emp, emp1, emp2, emp3, emp4));
        Manager hrManager = new Manager("Kuwaski","1990-12-20","Atzori", new BigDecimal(30000), mainManager,
                        new Date(), new BigDecimal(2000), new ArrayList<>(), new ArrayList<>());
        Employee hr1 = new Employee("Amar","1973-12-20","Atzori",BigDecimal.valueOf(2000),hrManager, new ArrayList<>());
        Employee hr2 = new Employee("Omar","2003-12-20","Atzori",BigDecimal.valueOf(1500),hrManager, new ArrayList<>());
        Employee hr3 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new ArrayList<>());
        hrManager.getSubordinates().addAll( Arrays.asList(mainManager, hr1, hr2, hr3));
        Manager itManager = new Manager("Kuwaski","1990-12-20","Atzori", new BigDecimal(30000), hrManager,
                new Date(), new BigDecimal(2000), new ArrayList<>(), new ArrayList<>());

        Employee it1 = new Employee("Amar","1973-12-20","Atzori",BigDecimal.valueOf(2000),hrManager, new ArrayList<>());
        Employee it2 = new Employee("Omar","2003-12-20","Atzori",BigDecimal.valueOf(1500),hrManager, new ArrayList<>());
        Employee it3 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new ArrayList<>());
        Employee it4 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new ArrayList<>());
        Employee it5 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new ArrayList<>());
        Employee it6 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new ArrayList<>());
        Employee it7 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new ArrayList<>());

        Trainee tr1 = new Trainee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new Date(), 30);
        Trainee tr2 = new Trainee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new Date(), 30);
        Trainee tr3 = new Trainee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new Date(), 30);
        Trainee tr4 = new Trainee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager, new Date(), 30);
        Employee it8 = new Employee("Omar","2004-12-20","Atzori",BigDecimal.valueOf(1.3),hrManager,
                Arrays.asList(tr1, tr2, tr3, tr4));

        itManager.getSubordinates().addAll( Arrays.asList(it1, it2, it3, it4, it5, it6, it7, it8));


        ceo.getSubordinates().addAll(Arrays.asList(mainManager, hrManager, itManager));
        List<Employee> employeesList = new ArrayList<>();




//        HumanResourcesStatistics.payroll(ceo.getAllSubordinates()).
//                forEach(e -> System.out.println(e.toString()));




//        System.out.println("Ages: " + HumanResourcesStatistics.getAges(person));
////        HumanResourcesStatistics.getAverageAgeInline(person);
//        System.out.println("Average Age: " + HumanResourcesStatistics.getAverageAgeMethodReference(person));
//        System.out.println("the max age in line is: " + HumanResourcesStatistics.getMaxAgeInline(person));
//        System.out.println("average age in line: "+HumanResourcesStatistics.getAverageAgeInline(person));
//        System.out.println("average : "+HumanResourcesStatistics.getMaxAgeMethodReference(person));
        //System.out.println("average : "+HumanResourcesStatistics.earnMoreThan1000(person));


    }
}
