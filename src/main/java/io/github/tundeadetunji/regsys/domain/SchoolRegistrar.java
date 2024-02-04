package io.github.tundeadetunji.regsys.domain;

import io.github.tundeadetunji.regsys.entity.Student;

public class SchoolRegistrar extends Admin{

    public SchoolRegistrar(Admin next) {
        super(next);
    }

    @Override
    public void mark(Student student) {
        //only concerned if the student is registered, otherwise
        //pass to next
        if (!student.isRegistered){
            student.isRegistered = true;
            //save to db
            //other things
        }
        else{
            super.mark(student);
        }
    }
}
