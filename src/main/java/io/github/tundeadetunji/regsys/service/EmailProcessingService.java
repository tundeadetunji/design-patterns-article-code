package io.github.tundeadetunji.regsys.service;

import io.github.tundeadetunji.regsys.factory.EmailProcessorFactory;
import io.github.tundeadetunji.regsys.noun.Protocol;

public class EmailProcessingService {
    private final EmailProcessorFactory factory = new EmailProcessorFactory();

    void processImapEmail(String email, String password){
        factory.createProcessor(Protocol.IMAP)
                .processEmail(email, password);
    }

    void processPop3Email(String email, String password){
        factory.createProcessor(Protocol.Pop3)
                .processEmail(email, password);
    }

}
