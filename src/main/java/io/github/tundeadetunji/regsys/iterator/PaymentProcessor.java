package io.github.tundeadetunji.regsys.iterator;

import io.github.tundeadetunji.regsys.visitor.IEmployee;
import io.github.tundeadetunji.regsys.visitor.ITreasurer;

import java.util.Stack;

public class PaymentProcessor implements IPaymentIterator {
    Stack<IEmployee> employees;
    ITreasurer treasurer;

    public PaymentProcessor(Stack<IEmployee> employees, ITreasurer treasurer) {
        this.employees = employees;
        this.treasurer = treasurer;
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
        return employee.getPaid(treasurer);
    }

}
