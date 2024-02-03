package io.github.tundeadetunji.regsys.entity;

public class Applicant {
    String fullName;

    private Applicant fullName(String fullName){
        this.fullName = fullName;
        return this;
    }

    public Student beginProcessing(){
        return new Student(this.fullName);
    }
}
