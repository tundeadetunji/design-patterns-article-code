package io.github.tundeadetunji.regsys.domain;

import io.github.tundeadetunji.regsys.entity.Student;

public class ClubRegistrar extends Admin{

    public ClubRegistrar(Admin next) {
        super(next);
    }

    @Override
    public void mark(Student student) {
        //only concerned if the student is club member, otherwise
        //pass to next
        if (!student.isClubMember){
            student.isClubMember = true;
            //save to db
            //other things
        }
        else{
            super.mark(student);
        }
    }
}
