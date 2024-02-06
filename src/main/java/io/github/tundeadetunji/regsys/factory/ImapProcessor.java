package io.github.tundeadetunji.regsys.factory;

public class ImapProcessor implements IEmailProcessor{
    private static ImapProcessor instance;

    private ImapProcessor(){

    }

    public static ImapProcessor getInstance(){
        if(instance == null) instance = new ImapProcessor();
        return instance;
    }

    @Override
    public void processEmail(String email, String password) {
        //domain specific
        //specific to IMAP
    }
}
