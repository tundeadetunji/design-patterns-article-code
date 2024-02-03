package io.github.tundeadetunji.regsys.command;

import io.github.tundeadetunji.regsys.entity.Student;
import io.github.tundeadetunji.regsys.noun.Department;

public class RegisterCommand implements Command{
    private Student student;
    private Department department;

    public RegisterCommand(Student student, Department department) {
        this.student = student;
        this.department = department;
    }

    @Override
    public void execute() {
        student.register(department);
    }
}
