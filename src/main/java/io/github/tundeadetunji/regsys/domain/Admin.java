package io.github.tundeadetunji.regsys.domain;

import io.github.tundeadetunji.regsys.entity.Student;

public abstract class Admin {
    private Admin next;

    public Admin(Admin next) {
        this.next = next;
    }

    public void mark(Student student){
        if(this.next != null) this.next.mark(student);
    }
}
