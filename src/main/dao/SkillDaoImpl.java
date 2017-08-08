package main.dao;

import main.model.Skill;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SkillDaoImpl implements SkillDao {

    public static final String path = "Skills.txt";

    @Override
    public void addSkill(Integer id, String skill) throws IOException {
        String skillline = id + " , " + skill;
        BufferedReader in = new BufferedReader(new StringReader(skillline));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
        while ((skillline = in.readLine()) != null)
            out.println(skillline);
        out.close();
    }

    @Override
    public Skill getById(Integer id) {
        Skill skill = new Skill();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                List<String> skillList = new ArrayList<>(Arrays.asList(line.split(",")));
                if (skillList.get(0).contains(id.toString())) {
                    skill.setName(skillList.get(1));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(skill);
        return skill;
    }

    @Override
    public List<Skill> getAll() throws IOException {
        List<Skill> list = new ArrayList<>();

        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            List<String> skillList = new ArrayList<>(Arrays.asList(line.split(",")));
            list.add(skillList.get(2));
            }

        return list;
    }

    @Override
    public void update(Skill skill) {

    }

    @Override
    public void delete(Integer id) {

    }
}
