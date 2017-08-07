package main.model;

public class NameEntity extends BaseEntity {
    String name;

    public NameEntity() {

    }

    public NameEntity(Integer id,String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
