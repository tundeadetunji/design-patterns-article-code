package io.github.tundeadetunji.regsys.entity;

import io.github.tundeadetunji.regsys.visitor.IEmployee;
import io.github.tundeadetunji.regsys.visitor.ITreasurer;

public class Treasurer implements ITreasurer {

    @Override
    public IEmployee pay(IEmployee employee) {
        System.out.println(((Employee)employee).getName() + " getting paid...");
        //pay up
        //save to db
        //other things
        return employee; //payment was successful
    }
}
