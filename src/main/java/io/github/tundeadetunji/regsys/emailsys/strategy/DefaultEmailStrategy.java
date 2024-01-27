package io.github.tundeadetunji.regsys.emailsys.strategy;

import io.github.tundeadetunji.regsys.emailsys.adapter.FirstEmailAdapter;
import io.github.tundeadetunji.regsys.emailsys.adapter.SecondEmailAdapter;
import io.github.tundeadetunji.regsys.user.UserEntity;

import java.util.List;

public class DefaultEmailStrategy implements IEmailStrategy {
    final FirstEmailAdapter firstEmailAdapter = new FirstEmailAdapter(); //all caps ignored for now
    final SecondEmailAdapter secondEmailAdapter = new SecondEmailAdapter(); //all caps ignored for now

    @Override
    public boolean sendMessage(UserEntity userEntity, String message) {
        //try sending emails using the providers through the adapter

        //this is a good place for the Chain of Responsibility pattern, but
        //for this example and for sake of simplicity, we'll just use a loop

        //Also, one of the Executor services might be useful (the one that executes the first of a list of commands)

        List<IEmailStrategy> services = List.of(firstEmailAdapter, secondEmailAdapter);
        boolean sent = false;

        for(IEmailStrategy adapter : services){
            sent = adapter.sendMessage(userEntity, message);
            if(sent){
                break;
            }
            else{
                //sent for analysis...
            }
        }
        return sent;
    }
}
