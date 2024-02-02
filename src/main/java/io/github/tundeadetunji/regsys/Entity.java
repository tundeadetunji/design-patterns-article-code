package io.github.tundeadetunji.regsys;

public class Entity {
    //just a placeholder for this example
    private final String value;

    private Entity(String value){
        this.value = value;
    }

    public static class builder {
        private String value;

        public builder setValue(String value){
            this.value = value;
            return this;
        }

        public Entity build(){
            return new Entity(this.value);
        }
    }
}
