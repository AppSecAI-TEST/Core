package main;

import main.dao.DeveloperDaoImpl;
import main.model.Developer;
import main.model.Skill;
import main.model.SkillByNameComparator;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Set<Skill> skills = new TreeSet<>(new SkillByNameComparator());
        skills.add(new Skill(1,"PHP"));
        skills.add(new Skill(2,"Java"));
        skills.add(new Skill(3,"CSS"));
        Developer developer = new Developer();
        developer.setId(1);
        developer.setName("Ivan");
        developer.setSkills(skills);
        developer.setExperience(2);
        developer.setSalary(4000);
        DeveloperDaoImpl methods = new DeveloperDaoImpl();
        methods.create(developer);
    }
}
