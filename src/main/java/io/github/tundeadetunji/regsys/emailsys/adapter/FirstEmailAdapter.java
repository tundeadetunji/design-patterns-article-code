package io.github.tundeadetunji.regsys.emailsys.adapter;

import io.github.tundeadetunji.regsys.emailsys.lib.FirstEmailServiceProvider;
import io.github.tundeadetunji.regsys.emailsys.strategy.IEmailStrategy;
import io.github.tundeadetunji.regsys.user.UserEntity;

public class FirstEmailAdapter implements IEmailStrategy {
    final FirstEmailServiceProvider serviceProvider = new FirstEmailServiceProvider();

    @Override
    public boolean sendMessage(UserEntity userEntity, String message) {
        //try sending email, if it fails, notify caller
        try{
            return serviceProvider.sendTheMail(userEntity.getEmail(), message);
        }
        catch (Exception exception){ //say, whatever exception it normally throws
            return false;
        }
    }
}
