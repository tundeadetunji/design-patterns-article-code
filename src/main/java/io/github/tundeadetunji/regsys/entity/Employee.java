package io.github.tundeadetunji.regsys.entity;

import io.github.tundeadetunji.regsys.visitor.IEmployee;
import io.github.tundeadetunji.regsys.visitor.ITreasurer;

public class Employee implements IEmployee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IEmployee getPaid(ITreasurer treasurer) {
        return treasurer.pay(this);
    }
}
