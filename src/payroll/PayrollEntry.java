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
        this.salaryPlusBonus = salary.add(bonus); // validate whether salary and bonus are not null
    }

    @Override
    public String toString() {
        return "PayrollEntry{" +
                "employee=" + employee +
                ", salaryPlusBonus=" + salaryPlusBonus +
                ", salary=" + salary +
                '}';
    }
}