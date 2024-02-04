package io.github.tundeadetunji.regsys.chainofresponsibility;

import io.github.tundeadetunji.regsys.domain.Admin;
import io.github.tundeadetunji.regsys.domain.ClubRegistrar;
import io.github.tundeadetunji.regsys.domain.SchoolRegistrar;
import io.github.tundeadetunji.regsys.domain.Treasurer;
import io.github.tundeadetunji.regsys.entity.Student;

public class Admins {
    Admin official;

    public Admins() {
        buildChain();
    }

    private void buildChain() {
        official = new SchoolRegistrar(
                new Treasurer(
                        new ClubRegistrar(
                                null
                        )
                )
        );
    }

    public void mark(Student student){
        official.mark(student);
    }
}
