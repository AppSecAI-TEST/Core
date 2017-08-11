package main;

import main.dao.DeveloperDaoImpl;
import main.dao.SkillDaoImpl;
import main.model.Developer;
import main.model.Skill;
import main.model.SkillByNameComparator;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws IOException {
        Set<Skill> skills = new HashSet<>();
        skills.add(new Skill(1,"PHP"));
        skills.add(new Skill(2,"Java"));
        skills.add(new Skill(3,"CSS"));
        Developer developer = new Developer();
        developer.setId(1);
        developer.setName("Ivan");
        developer.setSurname("Ivanov");
        developer.setSkill(skills);
        developer.setExperience(2);
        developer.setSalary(4000);
        DeveloperDaoImpl methods = new DeveloperDaoImpl();
        methods.create(developer);
    }
}
