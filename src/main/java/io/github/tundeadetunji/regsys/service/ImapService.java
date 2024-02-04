package io.github.tundeadetunji.regsys.service;

import io.github.tundeadetunji.regsys.factory.EmailProcessorAbstractFactory;
import io.github.tundeadetunji.regsys.noun.Protocol;

public class ImapService extends EmailProcessorAbstractFactory {

    private final Protocol PROTOCOL = Protocol.IMAP;
    private final String EMAIL;
    private final String PASSWORD;

    public ImapService(String EMAIL, String PASSWORD) {
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
    }

    public void process(){
        createProcessor(PROTOCOL).processEmail(EMAIL, PASSWORD);
    }
}
