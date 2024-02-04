package io.github.tundeadetunji.regsys.domain;

import io.github.tundeadetunji.regsys.entity.Student;

public class Treasurer extends Admin{

    public Treasurer(Admin next) {
        super(next);
    }

    @Override
    public void mark(Student student) {
        //only concerned if the student is has paid, otherwise
        //pass to next
        if (!student.hasPaid){
            student.hasPaid = true;
            //save to db
            //other things
        }
        else{
            super.mark(student);
        }
    }
}
