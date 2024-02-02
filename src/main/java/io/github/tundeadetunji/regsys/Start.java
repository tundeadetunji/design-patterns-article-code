package io.github.tundeadetunji.regsys;

import io.github.tundeadetunji.regsys.singleton.ConnectionManager;

import java.util.List;

public class Start {
    private static final String CONNECTION_STRING = "connection_string_here";
    private static final List<Entity> INITIAL_DATA = List.of(
            new Entity.builder().setValue("APPLE").build(),
            new Entity.builder().setValue("APRICOT").build(),
            new Entity.builder().setValue("ALMOND").build());

    public static void main(String[] args) {

        //this ensures it can be called only once...
        ConnectionManager con = ConnectionManager.getInstance(CONNECTION_STRING, INITIAL_DATA);

        //then, business as usual
        con.insert(new Entity.builder().setValue("Venezuela").build());
        con.insert(new Entity.builder().setValue("Vanuatu").build());

    }
}