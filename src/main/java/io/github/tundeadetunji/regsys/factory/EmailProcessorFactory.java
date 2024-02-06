package io.github.tundeadetunji.regsys.factory;

import io.github.tundeadetunji.regsys.noun.Protocol;

public class EmailProcessorFactory {
    IEmailProcessor emailProcessor;

    public IEmailProcessor createProcessor(Protocol protocol){
        return switch (protocol){
            case IMAP -> emailProcessor = ImapProcessor.getInstance();
            case Pop3 -> emailProcessor = Pop3Processor.getInstance();
        };
    }
}
