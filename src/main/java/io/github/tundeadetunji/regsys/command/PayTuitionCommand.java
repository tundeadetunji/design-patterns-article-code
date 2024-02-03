package io.github.tundeadetunji.regsys.command;

import io.github.tundeadetunji.regsys.entity.Student;

public class PayTuitionCommand implements Command{
    private Student student;
    private double amount;

    public PayTuitionCommand(Student student, double amount) {
        this.student = student;
        this.amount = amount;
    }

    @Override
    public void execute() {
        student.payTuition(amount);
    }
}
