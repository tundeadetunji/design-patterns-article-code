package io.github.tundeadetunji.regsys;

import io.github.tundeadetunji.regsys.entity.Employee;
import io.github.tundeadetunji.regsys.entity.HR;
import io.github.tundeadetunji.regsys.iterator.IPaymentIterator;
import io.github.tundeadetunji.regsys.iterator.PaymentProcessor;
import io.github.tundeadetunji.regsys.visitor.IEmployee;

import java.util.List;
import java.util.Stack;

public class Start {
    public static void main(String[] args) {
        Stack<IEmployee> payroll = new Stack<>();

        List<IEmployee> employees = List.of(new Employee("Amy"),
                new Employee("Bree"),
                new Employee("Carla"),
                new Employee("Daniella"),
                new Employee("Eva"));

        employees.forEach(employee -> payroll.push(employee));

        IPaymentIterator paymentProcessor = new PaymentProcessor(payroll, new HR());
        while (paymentProcessor.hasNext()){
            paymentProcessor.next(); //no need to do anything else, because of the way we implemented the Iterator
        }
    }

}
