package main.model;

import java.util.Set;

public class Team extends BaseObject {

    private int cost = 1000;
    private Set<Developer> teamDevelopers;

    public Team(Integer id, String name, Integer salary, Set<Skill> skills) {
        super(id, name, salary, skills);
    }

    public Team() {

    }

    public int getCost(){
        return cost;
    }

    public Set<Developer> getTeamDevelopers() {
        return teamDevelopers;
    }

    public void setTeamDevelopers(Set<Developer> teamDevelopers) {
        this.teamDevelopers = teamDevelopers;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", developers:\n");
        for (Developer dev : teamDevelopers) {
            builder.append("Developer{id=");
            builder.append(dev.getId());
            builder.append(", name='");
            builder.append(dev.getName());
            builder.append("\'},\n");
        }
        return builder.substring(0, builder.length() - 2) + "}\n";
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37*result + id;
        result = 37*result + (name == null ? 0: name.hashCode());
        result = 37*result + cost;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Project project = (Project) obj;
        if (id != project.getId())
            return false;
        if (!name.equalsIgnoreCase(project.getName()))
            return false;
        if (cost != project.getCost())
            return false;

        return true;
    }
}
