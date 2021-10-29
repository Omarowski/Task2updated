package Tests;

import employee.Employee;
import employee.Manager;
import employee.Trainee;
import employee.Worker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import payroll.HumanResourcesStatistics;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class HumanResourcesStatisticsTest {

    // Creates HR structure which resembles the below one:
    //
    // Director (an instance of Manager class (Director does not have a manager)
    //   |- Manager01
    //        |- Worker
    //        |- Worker
    //        |- Trainee
    //        |- ...
    //   |- Manager02
    //        |- ...
    //   |- ...
    //   |- Worker
    //   |- Worker
    //   |- Trainee

    private List<Employee> employeeArrayList = new ArrayList<>(); // all employees ---  i.e. Workers, Trainees and their Managers and top Director (also an instance of Manager class)

    private Manager ceo = new Manager("Ciaran","Murphy",LocalDate.of(1971,1,15),null,
            new BigDecimal(30000),
            LocalDate.of(1994,3,14),
            new BigDecimal(10000));





    private Manager mainManager = new Manager("Diego","Atzori",LocalDate.of(1974,8,20),
            ceo,
            new BigDecimal(25000),
            LocalDate.of(2004,1,1),
            new BigDecimal(6000));


    private Worker e1 = new Worker("Chris","Cottis",LocalDate.of(1993,6,18),
            mainManager,
            new BigDecimal(1000),
            LocalDate.of(2003,6,1),
            new BigDecimal(400));
    private Worker e2 = new Worker("Adam","Cottis",LocalDate.of(1992,6,28),
            mainManager,
            new BigDecimal(1000),
            LocalDate.of(2003,6,1),
            new BigDecimal(400));
    private Worker e3 = new Worker("Sandra","Cottis",LocalDate.of(1990,6,19),
            mainManager,
            new BigDecimal(1200),
            LocalDate.of(2003,6,1),
            new BigDecimal(450));

    private Trainee t1 = new Trainee("Omar","Atzori",LocalDate.of(1993,6,8),
            mainManager,
            new BigDecimal(700),
            LocalDate.of(2016,6,1),
            6);
    private Trainee t2 = new Trainee("Sandro","Tonali",LocalDate.of(1993,6,8),
            mainManager,
            new BigDecimal(700),
            LocalDate.of(2003,6,1),
            6);


    private Manager hrManager = new Manager("Ugo","Foscolo",LocalDate.of(1986,5,7),
            ceo,
            new BigDecimal(9999),
            LocalDate.of(2002,4,1),
            new BigDecimal(14000));

    private Worker e4 = new Worker("Ugo","Foscolo",LocalDate.of(1993,6,8),
            hrManager,
            new BigDecimal(10000),
            LocalDate.of(2016,6,1),
            new BigDecimal(1300));
    private Worker e5 = new Worker("Artur","Arnautovic",LocalDate.of(1993,6,8),
            hrManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            new BigDecimal(1400));

    private Trainee t3 = new Trainee("Artur","Allegri",LocalDate.of(1993,6,8),
            hrManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            6);
    private Trainee t4 = new Trainee("Artur","Kowalski",LocalDate.of(1993,6,8),
            hrManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            6);



    private Manager itManager = new Manager("Davide","Calabria",LocalDate.of(1993,6,8),
            hrManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            new BigDecimal(700));

    private Worker e6 = new Worker("Davide","Calabria",LocalDate.of(1993,6,8),
            itManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            new BigDecimal(900));
    private Worker e7 = new Worker("Davide","Calabria",LocalDate.of(1993,6,8),
            itManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            new BigDecimal(900));
    private Worker e8 = new Worker("Adam","Siddi",LocalDate.of(1993,6,8),
            itManager,
            new BigDecimal(10000),
            LocalDate.of(2015,6,1),
            new BigDecimal(900));
    private Trainee t5 = new Trainee("Adam","Tulli",LocalDate.of(1993,6,8),
            itManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            6);




    private Manager manager = new Manager("Adam","Molley",LocalDate.of(1993,6,8),
            itManager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            new BigDecimal(700));




    private Worker e9 = new Worker("Adam","Molley",LocalDate.of(1993,6,8),
            ceo,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            new BigDecimal(700));
    private Trainee t6 = new Trainee("Adam","Molley",LocalDate.of(1993,6,8),
            ceo,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            10);



    private Worker e10 = new Worker("Adam","Molley",LocalDate.of(1993,6,8),
            manager,
            new BigDecimal(10000),
            LocalDate.of(2003,6,1),
            new BigDecimal(700));


    @Before
    public void setUp(){
        employeeArrayList.add(ceo);
        employeeArrayList.add(e9);
        employeeArrayList.add(t6);
        employeeArrayList.add(mainManager);
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(t1);
        employeeArrayList.add(t2);
        employeeArrayList.add(hrManager);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        employeeArrayList.add(t3);
        employeeArrayList.add(t4);
        employeeArrayList.add(itManager);
        employeeArrayList.add(e6);
        employeeArrayList.add(e7);
        employeeArrayList.add(e8);
        employeeArrayList.add(t5);
        employeeArrayList.add(manager);
        employeeArrayList.add(e10);
    }

    @Test
    public void payroll() {
        HumanResourcesStatistics.payroll(employeeArrayList);
    }
    @Test
    public void subordinatesPayroll() throws Exception {
        HumanResourcesStatistics.subordinatesPayroll(ceo);
    }
    @Test
    public void bonusTotal() throws Exception {
        BigDecimal total = HumanResourcesStatistics.totalBonus(employeeArrayList);
        Assert.assertEquals(new BigDecimal(39450), total);
    }
    @Test
    public void maxSal() throws Exception {
        BigDecimal maxSal = HumanResourcesStatistics.highestSalaryWithoutBonus(employeeArrayList);
        Assert.assertEquals(new BigDecimal(30000),maxSal);
    }

    @Test
    public void maxSalBonus() {
        BigDecimal maxSalBonus = HumanResourcesStatistics.highestSalaryIncludingBonus(employeeArrayList);
        Assert.assertEquals(new BigDecimal(40000),maxSalBonus);
    }

    @Test
    public void getLongestSen() {
        Assert.assertEquals(ceo,
                HumanResourcesStatistics.longestSeniority(employeeArrayList).get(0));
    }

    @Test
    public void getAllSubA() {
        List<Employee> assertE = new ArrayList<>();
        assertE.add(e5);
        assertE.add(t3);
        Assert.assertEquals(assertE,HumanResourcesStatistics.surnameBeginsWithA(hrManager));
    }

    @Test
    public void more1000() {
        Assert.assertEquals(employeeArrayList,HumanResourcesStatistics.earnMoreThan1000(employeeArrayList));

    }

}