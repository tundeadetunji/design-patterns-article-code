package io.github.tundeadetunji.regsys.factory;

import io.github.tundeadetunji.regsys.noun.Protocol;

public abstract class EmailProcessorAbstractFactory {
    IEmailProcessor emailProcessor;

    public IEmailProcessor createProcessor(Protocol protocol){
        return switch (protocol){
            case IMAP -> emailProcessor = new ImapProcessor();
            case Pop3 -> emailProcessor = new Pop3Processor();
        };
    }
}
