package main.model;

public class Skill extends NameEntity {

    public Skill() {

    }

    public Skill(Integer id, String name) {
        super(id, name);
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Skill{" +
                "specialty = " + getName() + '\'' +
                '}';
    }
}
