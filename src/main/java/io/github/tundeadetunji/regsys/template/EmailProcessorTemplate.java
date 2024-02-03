package io.github.tundeadetunji.regsys.template;

import io.github.tundeadetunji.regsys.noun.Protocol;

public abstract class EmailProcessorTemplate {

    private final Protocol protocol = Protocol.IMAP;
    private final String incomingServer = "imap.domain.com";
    private final int incomingPort = 993;
    private final String outgoingServer = "smtp.domain.com";
    private final int outgoingPort = 587;

    public void configure(){
        //default implementation
        //work with protocol, incomingServer, ...
    }

    public abstract void processEmail(String email, String password);

}
