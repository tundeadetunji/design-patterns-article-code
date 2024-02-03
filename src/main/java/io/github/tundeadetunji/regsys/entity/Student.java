package io.github.tundeadetunji.regsys.entity;

import io.github.tundeadetunji.regsys.noun.Club;
import io.github.tundeadetunji.regsys.noun.Department;

public class Student {
    String fullName;
    Department department;
    Club club;
    boolean hasPaid;

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public void register(Department department){
        this.department = department;
        //domain specific
    }

    public void payTuition(double amount){
        hasPaid = true;
        //domain specific
    }

    public void joinClub(Club club){
        this.club = club;
        //domain specific
    }

}
