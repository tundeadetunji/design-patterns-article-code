package io.github.tundeadetunji.regsys.singleton;


import io.github.tundeadetunji.regsys.Entity;

import java.util.List;

public class ConnectionManager {
    private String connectionString;
    private List<Entity> initialData;

    private static ConnectionManager instance;

    private ConnectionManager(String connectionString, List<Entity> initialData){
        this.connectionString = connectionString;
        this.initialData = initialData;

        //good place for intensive processing that potentially
        // would affect performance if computed on every instance
    }

    public static ConnectionManager getInstance(String connectionString, List<Entity> initialData){
        if(instance == null){
            instance = new ConnectionManager(connectionString, initialData);
        }
        return instance;
    }

    public void insert(Entity entity){
        //
    }

    //other methods follow...
}
