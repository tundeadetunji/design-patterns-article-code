package io.github.tundeadetunji.regsys;

import io.github.tundeadetunji.regsys.template.EmailProcessorTemplate;
import io.github.tundeadetunji.regsys.noun.Protocol;

public class Start {
    public static void main(String[] args) {
        EmailProcessorTemplate fullGrid = new EmailProcessorTemplate.builder()
                .setProtocol(Protocol.IMAP)
                .setEmail("email@domain.com")
                .setPassword("@password")
                .setIncomingServer("imap.domain.com")
                .setIncomingPort(993)
                .setOutgoingServer("smtp.domain.com")
                .setOutgoingPort(587)
                .build();

        //without passing all parameters now, but will set the rest as needed:
        EmailProcessorTemplate whet = new EmailProcessorTemplate.builder()
                .setProtocol(Protocol.IMAP)
                .setEmail("email@domain.com")
                .setPassword("@password")
                .build();
    }
}
