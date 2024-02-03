package io.github.tundeadetunji.regsys;

import io.github.tundeadetunji.regsys.builder.EmailProcessor;
import io.github.tundeadetunji.regsys.noun.Protocol;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        EmailProcessor fullGrid = new EmailProcessor.builder()
                .setProtocol(Protocol.IMAP)
                .setEmail("")
                .setPassword("")
                .setIncomingServer("")
                .setIncomingPort(2)
                .setOutgoingServer("abc")
                .setOutgoingPort(2)
                .build();

        //without passing all parameters now, but will set the rest as needed:
        EmailProcessor whet = new EmailProcessor.builder()
                .setProtocol(Protocol.Pop3)
                .setEmail("")
                .setPassword("")
                .build();
    }
}