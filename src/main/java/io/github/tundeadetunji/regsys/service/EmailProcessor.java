package io.github.tundeadetunji.regsys.service;

import io.github.tundeadetunji.regsys.noun.Protocol;
import io.github.tundeadetunji.regsys.template.EmailProcessorTemplate;

public class EmailProcessor extends EmailProcessorTemplate {

    private EmailProcessor() {
        configure();
    }

    @Override
    public void configure() {
        //extend or override
    }

    @Override
    public void processEmail(String email, String password) {
        //domain specific
    }
}
