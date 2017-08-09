package main;

import main.dao.DeveloperDaoImpl;
import main.dao.SkillDaoImpl;
import main.model.Developer;
import main.model.Skill;
import main.model.SkillByNameComparator;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        SkillDaoImpl skill = new SkillDaoImpl();
        skill.createSkill(1,"PHP");
        skill.createSkill(2,"JSP");
        skill.createSkill(3,"MVC");
        Developer developer = new Developer();
        developer.setId(1);
        developer.setName("Ivan");
        developer.setSurname("Ivanov");
        developer.addSkill(skill);
        developer.setExperience(2);
        developer.setSalary(4000);
        DeveloperDaoImpl methods = new DeveloperDaoImpl();
        methods.getAll();
    }
}
