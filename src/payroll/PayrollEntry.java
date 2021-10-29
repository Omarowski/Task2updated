package payroll;

import employee.Employee;

import java.math.BigDecimal;

public final class PayrollEntry {

    private final Employee employee;
    private final BigDecimal salaryPlusBonus;
    private final BigDecimal salary;

    public PayrollEntry(Employee employee, BigDecimal salary, BigDecimal bonus) {
        this.employee = employee;
        this.salary = salary;
        if(salary!=null && bonus !=null) {
            this.salaryPlusBonus = salary.add(bonus); // validate whether salary and bonus are not null
        }else if(salary!= null) {
            salaryPlusBonus = salary;
        }else
            salaryPlusBonus = null;

    }

    public Employee getEmployee() {
        return employee;
    }

    public BigDecimal getSalaryPlusBonus() {
        return salaryPlusBonus;
    }

    @Override
    public String toString() {
        return "PayrollEntry{" +
                "surname=" + employee.getSurname() +
                "first name="+ employee.getFirstName()+
                ", salaryPlusBonus=" + salaryPlusBonus +
                ", salary=" + salary +
                '}';
    }
}