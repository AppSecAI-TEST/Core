package main.dao;

import main.model.Skill;
import main.model.SkillComparator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SkillDaoImpl implements SkillDao {

//    public static final String path = "Skills.txt";

    @Override
    public void addSkill(Integer id, String name) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write id: ");
        id = in.read();
        System.out.println("Write skill: ");
        name = in.toString();
        Set<Skill> skill = new TreeSet<>();
        skill.add(new Skill(id,name));
    }

    @Override
    public Skill getById(Integer id) {
        return null;
    }

    @Override
    public List<Skill> getAll() throws IOException {
//        List<Skill> list = new ArrayList<>();
//
//            Skill skill;
//            while (resultSet.next()) {
//                int skillId = resultSet.getInt("id");
//                String specialty = resultSet.getString("specialty");
//                skill = new Skill();
//                skill.setId(skillId);
//                skill.setName(specialty);
//                list.add(skill);
//            }
//            return list;

        return null;
    }

    @Override
    public void update(Skill skill) {

    }

    @Override
    public void delete(Integer id) {

    }
}
