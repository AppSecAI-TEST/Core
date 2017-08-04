package main.model;

public abstract class BaseObject {
    int id;
    String name;

    public BaseObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseObject() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
