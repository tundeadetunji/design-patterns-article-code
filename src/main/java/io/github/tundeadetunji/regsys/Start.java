package io.github.tundeadetunji.regsys;

import io.github.tundeadetunji.regsys.builder.EmailProcessor;
import io.github.tundeadetunji.regsys.noun.Protocol;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        EmailProcessor fullGrid = new EmailProcessor.builder()
                .setProtocol(Protocol.IMAP)
                .setEmail("email@domain.com")
                .setPassword("@password")
                .setIncomingServer("imap.domain.com")
                .setIncomingPort(993)
                .setOutgoingServer("smtp.domain.com")
                .setOutgoingPort(587)
                .build();

        //without passing all parameters now, but will set the rest as needed:
        EmailProcessor whet = new EmailProcessor.builder()
                .setProtocol(Protocol.IMAP)
                .setEmail("email@domain.com")
                .setPassword("@password")
                .build();
    }
}
