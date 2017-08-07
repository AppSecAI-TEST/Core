package main.model;

import java.util.Set;

public abstract class BaseObject {
    Integer id;
    String name;
    private Integer salary;

    private Set<Skill> skills;


    public BaseObject(Integer id, String name, Integer salary, Set<Skill> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skills = skills;
    }

    public BaseObject() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
