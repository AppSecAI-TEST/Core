package main.model;

public abstract class BaseEntity {
    Integer id;

    public BaseEntity(Integer id) {
        this.id = id;
    }

    public BaseEntity() {

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }
}
