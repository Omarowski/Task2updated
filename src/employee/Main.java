//package employee;
//
//import payroll.HumanResourcesStatistics;
//
//import java.time.LocalDate;
//import java.util.*;
//
//import java.math.BigDecimal;
//
//public class Main {
//    public static void main(String [] args) throws Exception {
//        Manager ceo = new Manager("Omar", LocalDate.of(1990,12,20), "Atzori", new BigDecimal(30000),
//                null, LocalDate.now(), new BigDecimal(2000));
//        Manager mainManager = new Manager("Kuwaski",LocalDate.of(1990,12,20),"Atzori", new BigDecimal(30000),
//                ceo, LocalDate.of(1970,12,31),new BigDecimal(12000));
//        Employee emp = new Employee("Amar",LocalDate.of(1992,12,20),"Atzori",BigDecimal.valueOf(2000),mainManager);
//        Employee emp1 = new Employee("Omar",LocalDate.of(2001,12,20),"Atzori",BigDecimal.valueOf(2000),mainManager);
//        Employee emp2 = new Employee("Amar",LocalDate.of(1973,12,22),"Atzori",BigDecimal.valueOf(2000),mainManager);
//        Employee emp3 = new Employee("Omar",LocalDate.of(1990,12,20),"Atzori",BigDecimal.valueOf(1500),mainManager);
//        Employee emp4 = new Employee("Omar",LocalDate.of(2004,12,20),"Atzori",BigDecimal.valueOf(1.3),mainManager);
//        mainManager.getSubordinates().addAll(Arrays.asList(emp, emp1, emp2, emp3, emp4));
//        Manager hrManager = new Manager("Kuwaski",LocalDate.of(1992,12,20),"Cani", new BigDecimal(30000), mainManager,
//                        LocalDate.of(1970,12,31), new BigDecimal(2000));
//        Employee hr1 = new Employee("Amar",LocalDate.of(1973,12,20),"Secci",BigDecimal.valueOf(2000),hrManager);
//        Employee hr2 = new Employee("Omar",LocalDate.of(2003,12,20),"Soggiu",BigDecimal.valueOf(1500),hrManager);
//        Employee hr3 = new Employee("Omar",LocalDate.of(2004,12,20),"Zedde",BigDecimal.valueOf(1.3),hrManager);
//        hrManager.getSubordinates().addAll( Arrays.asList(mainManager, hr1, hr2, hr3));
//        Manager itManager = new Manager("Kuwaski",LocalDate.of(1990,12,20),"Atzori", new BigDecimal(30000), hrManager,
//                LocalDate.of(1970,12,31), new BigDecimal(2000));
//
//        Employee it1 = new Employee("Amar",LocalDate.of(1993,12,20),"Atzori",BigDecimal.valueOf(2000),hrManager);
//        Employee it2 = new Employee("Omar",LocalDate.of(2000,04,20),"Atzori",BigDecimal.valueOf(1500),hrManager);
//        Employee it3 = new Employee("Omar",LocalDate.of(1732,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager);
//        Employee it4 = new Employee("Omar",LocalDate.of(1945,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager);
//        Employee it5 = new Employee("Omar",LocalDate.of(1986,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager);
//        Employee it6 = new Employee("Omar",LocalDate.of(1984,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager);
//        Employee it7 = new Employee("Omar",LocalDate.of(1980,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager);
//
//        Trainee tr1 = new Trainee("Omar",LocalDate.of(1981,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager, LocalDate.now(), 30);
//        Trainee tr2 = new Trainee("Omar",LocalDate.of(1982,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager, LocalDate.now(), 30);
//        Trainee tr3 = new Trainee("Omar",LocalDate.of(1982,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager, LocalDate.now(), 30);
//        Trainee tr4 = new Trainee("Omar",LocalDate.of(1983,12,20),"Atzeni",BigDecimal.valueOf(1.3),hrManager, LocalDate.now(), 30);
//        Employee it8 = new Employee("Omar",LocalDate.of(1870,12,20),"Atzori",BigDecimal.valueOf(1.3),hrManager
//        );
//
//        itManager.getSubordinates().addAll( Arrays.asList(it1, it2, it3, it4, it5, it6, it7, it8));
//
//
//        ceo.getSubordinates().addAll(Arrays.asList(mainManager, hrManager, itManager));
//
//
////        System.out.println("Payroll" + HumanResourcesStatistics.payroll(ceo.getAllSubordinates()));
////        System.out.println("Payroll" + HumanResourcesStatistics.subordinatesPayroll(ceo));
////        System.out.println("Total Bonus " + HumanResourcesStatistics.bonusTotal(ceo.getAllSubordinates()));
////        System.out.println("Salary including Bonus " + HumanResourcesStatistics.highestSalaryIncludingBonus(ceo.getAllSubordinates()));
////        System.out.println("Salary without Bonus " + HumanResourcesStatistics.highestSalaryWithoutBonus(ceo.getAllSubordinates()));
////       System.out.println("Salary without Bonus " + HumanResourcesStatistics.longestSeniority(ceo.getAllSubordinates()));
//       System.out.println("Surname beginning with A " + HumanResourcesStatistics.surnameBeginsWithA(ceo));
////
////
////
////
////
////
////        System.out.println("Ages: " + HumanResourcesStatistics.getAges(ceo.getAllSubordinates()));
////       HumanResourcesStatistics.getAverageAgeInline(ceo.getAllSubordinates());
////        System.out.println("Average Age: " + HumanResourcesStatistics.getAverageAgeMethodReference(ceo.getAllSubordinates()));
////        System.out.println("the max age in line is: " + HumanResourcesStatistics.getMaxAgeInline(ceo.getAllSubordinates()));
////        System.out.println("average age in line: "+HumanResourcesStatistics.getAverageAgeInline(ceo.getAllSubordinates()));
////        System.out.println("average : "+HumanResourcesStatistics.getMaxAgeMethodReference(ceo.getAllSubordinates()));
////        System.out.println("Earn more then 1000 : "+HumanResourcesStatistics.earnMoreThan1000(ceo.getAllSubordinates()));
//
//
//    }
//}
