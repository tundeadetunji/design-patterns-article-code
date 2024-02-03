package io.github.tundeadetunji.regsys.builder;

import io.github.tundeadetunji.regsys.noun.Protocol;

public class EmailProcessor {

    private final Protocol protocol;
    private final String email;
    private final String password;
    private final String incomingServer;
    private final int incomingPort;
    private final String outgoingServer;
    private final int outgoingPort;

    private EmailProcessor(Protocol protocol, String email, String password, String incomingServer, int incomingPort, String outgoingServer, int outgoingPort) {
        //this constructor is made private to ensure the builder is used instead.
        this.protocol = protocol;
        this.email = email;
        this.password = password;
        this.incomingServer = incomingServer;
        this.incomingPort = incomingPort;
        this.outgoingServer = outgoingServer;
        this.outgoingPort = outgoingPort;
    }

    //getters and setters
    //other methods as required

    public static class builder{
        private Protocol protocol;
        private String email;
        private String password;
        private String incomingServer;
        private int incomingPort;
        private String outgoingServer;
        private int outgoingPort;

        //trick is, each setter returns this
        //as to names of the setters, follow what suits, convention or not

        public builder setProtocol(Protocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public builder setIncomingServer(String incomingServer) {
            this.incomingServer = incomingServer;
            return this;
        }

        public builder setIncomingPort(int incomingPort) {
            this.incomingPort = incomingPort;
            return this;
        }

        public builder setOutgoingServer(String outgoingServer) {
            this.outgoingServer = outgoingServer;
            return this;
        }

        public builder setOutgoingPort(int outgoingPort) {
            this.outgoingPort = outgoingPort;
            return this;
        }

        //finally, the build method, the one that converts the builder to the real object
        public EmailProcessor build(){
            return new EmailProcessor(
                    this.protocol,
                    this.email,
                    this.password,
                    this.incomingServer,
                    this.incomingPort,
                    this.outgoingServer,
                    this.outgoingPort
            );
        }
    }
}
