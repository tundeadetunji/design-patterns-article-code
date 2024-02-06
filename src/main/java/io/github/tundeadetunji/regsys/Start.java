package io.github.tundeadetunji.regsys;

import io.github.tundeadetunji.regsys.chainofresponsibility.Admins;
import io.github.tundeadetunji.regsys.entity.Student;
import io.github.tundeadetunji.regsys.noun.Club;

public class Start {
    public static void main(String[] args) {

        Student amy = new Student("Amy");
        Admins official = new Admins();

        //time to register
        official.mark(amy);
        //amy.isRegistered returns true

        //time to join club
        official.mark(amy);
        //amy.isClubMember returns true

        //time to pay
        official.mark(amy);
        //amy.hasPaid returns true

    }
}