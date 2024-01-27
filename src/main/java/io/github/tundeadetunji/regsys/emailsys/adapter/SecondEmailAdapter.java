package io.github.tundeadetunji.regsys.emailsys.adapter;

import io.github.tundeadetunji.regsys.emailsys.lib.FirstEmailServiceProvider;
import io.github.tundeadetunji.regsys.emailsys.lib.SecondEmailServiceProvider;
import io.github.tundeadetunji.regsys.emailsys.strategy.IEmailStrategy;
import io.github.tundeadetunji.regsys.user.UserEntity;

public class SecondEmailAdapter implements IEmailStrategy {
    final SecondEmailServiceProvider serviceProvider = new SecondEmailServiceProvider();

    @Override
    public boolean sendMessage(UserEntity userEntity, String message) {
        //try sending email, if it fails, notify caller
        try{
            return serviceProvider.sendMail(userEntity.getEmail(), message);
        }
        catch (Exception exception){ //say, whatever exception it normally throws
            return false;
        }
    }
}
