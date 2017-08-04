package main.model;

public class Skill extends BaseObject{

    public Skill() {

    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", specialty='" + getName() + '\'' +
                '}';
    }
}
