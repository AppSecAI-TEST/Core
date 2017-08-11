package main.model;

import main.dao.SkillDaoImpl;

import java.io.IOException;

public class TestSkill {
    public static void main(String[] args) throws IOException {
        SkillDaoImpl dao = new SkillDaoImpl();
        Skill skill = new Skill(2,"Angular");
        dao.getAll();


    }
}
