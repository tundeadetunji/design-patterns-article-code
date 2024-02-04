package io.github.tundeadetunji.regsys.template;

import io.github.tundeadetunji.regsys.noun.Protocol;

public abstract class EmailProcessorTemplate {

    private final Protocol PROTOCOL = Protocol.IMAP;
    private final String INCOMING_SERVER = "imap.domain.com";
    private final int INCOMING_PORT = 993;
    private final String OUTGOING_SERVER = "smtp.domain.com";
    private final int OUTGOING_PORT = 587;

    public void configure(){
        //default implementation
        //work with protocol, incomingServer, ...
    }

    public abstract void processEmail(String email, String password);

}
