package main.model;

public abstract class BaseObject {
    private Integer id;
    private String name;
    private String surname;
    private String skills;
    private Integer experience;
    private Integer salary;


    public BaseObject(Integer id, String name, String surname, String skills, Integer experience, Integer salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.skills = skills;
        this.experience = experience;
        this.salary = salary;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
