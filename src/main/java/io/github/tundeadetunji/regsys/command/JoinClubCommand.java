package io.github.tundeadetunji.regsys.command;

import io.github.tundeadetunji.regsys.entity.Student;
import io.github.tundeadetunji.regsys.noun.Club;

public class JoinClubCommand implements Command{
    private Student student;
    private Club club;

    public JoinClubCommand(Student student, Club club) {
        this.student = student;
        this.club = club;
    }

    @Override
    public void execute() {
        student.joinClub(club);
    }
}
