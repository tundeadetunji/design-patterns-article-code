package io.github.tundeadetunji.regsys.iterator;

import io.github.tundeadetunji.regsys.visitor.IEmployee;
import io.github.tundeadetunji.regsys.visitor.Payroll;

import java.util.Stack;

public class PaymentProcessor implements IPaymentIterator {
    Stack<IEmployee> employees;
    Payroll hr;

    public PaymentProcessor(Stack<IEmployee> employees, Payroll hr) {
        this.employees = employees;
        this.hr = hr;
    }

    @Override
    public boolean hasNext() {
        return !employees.isEmpty();
    }

    @Override
    public IEmployee next() {
        return hasNext() ? payedThisEmployeeSalary(employees.pop()) : null;
    }

    private IEmployee payedThisEmployeeSalary(IEmployee employee){
        return employee.getPaid(hr);
    }

}
