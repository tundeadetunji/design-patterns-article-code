package io.github.tundeadetunji.regsys.entity;

import io.github.tundeadetunji.regsys.noun.Club;
import io.github.tundeadetunji.regsys.noun.Department;

public class Student {
    String fullName;

    public boolean isRegistered;
    public boolean hasPaid;
    public boolean isClubMember;

    public Student(String fullName) {
        this.fullName = fullName;
    }

    //other methods omitted

}
