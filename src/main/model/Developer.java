package main.model;

import java.util.Set;

public class Developer extends NameEntity {

    private String surname;
    private Integer experience;
    private Integer salary;

    private Set<Skill> skills;

    public Developer() {

    }

    public Developer(Integer id, String name) {
        super(id, name);
    }

    public String getSurname(){

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }
    public Integer getExperience(){

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

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                ", skills:\n");
        for (Skill skill : skills) {
            builder.append(skill.toString());
            builder.append(",\n");
        }
        return builder.substring(0, builder.length() - 2) + "}\n";
    }
}
