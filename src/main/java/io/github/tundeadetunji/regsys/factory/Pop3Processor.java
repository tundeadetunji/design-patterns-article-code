package io.github.tundeadetunji.regsys.factory;

public class Pop3Processor implements IEmailProcessor{
    private static Pop3Processor instance;

    private Pop3Processor(){

    }

    public static Pop3Processor getInstance(){
        if(instance == null) instance = new Pop3Processor();
        return instance;
    }
    @Override
    public void processEmail(String email, String password) {
        //domain specific
        //specific to Pop3
    }
}
