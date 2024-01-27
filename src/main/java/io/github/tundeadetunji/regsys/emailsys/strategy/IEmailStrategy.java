package io.github.tundeadetunji.regsys.emailsys.strategy;

import io.github.tundeadetunji.regsys.user.UserEntity;

public interface IEmailStrategy {
    boolean sendMessage(UserEntity userEntity, String message);
}
