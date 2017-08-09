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
    public void createSkill(Integer id, String skill) throws IOException {
        String skillline = id + "," + skill;
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
        List<Skill> skilList = new ArrayList<>();
        Skill skill = null;

        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            List<String> skillData = new ArrayList<>(Arrays.asList(line.split(",")));
            int skillId = Integer.parseInt(skillData.get(0));
            String skillName = skillData.get(1);
            skill = new Skill();
            skill.setId(skillId);
            skill.setName(skillName);
            skilList.add(skill);
            }
        System.out.println(skilList);
        return skilList;
    }

    @Override
    public void update(Skill skill) throws IOException {
        Scanner sc = new Scanner(new File(path));
        List<String> resultList = new ArrayList<>();
        String finalstring = skill.getId() + "," + skill.getName();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String pID = String.valueOf(skill.getId());
            List<String> skilList = new ArrayList<>(Arrays.asList(line.split("\\n")));
            for (int i = 0; i < skilList.size(); i++) {
                String[] dev = skilList.get(i).split(",");
                if (dev[0].equals(pID)) {
                    skilList.remove(i);
                } else {
                    resultList.add(skilList.get(i));
                }
            }
        }

        try (PrintWriter writer = new PrintWriter(path)) {
            for (String string : resultList) {
                writer.write(string);
                System.out.println(string);
                writer.write("\n");
            }
        }
        BufferedReader in = new BufferedReader(new StringReader(finalstring));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
        while ((finalstring = in.readLine()) != null)
            out.println(finalstring);
        out.close();
    }

    @Override
    public void delete(Integer id) throws IOException {
        Scanner sc = new Scanner(new File(path));
        List<String> resultList = new ArrayList<>();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            List<String> skilList = new ArrayList<>(Arrays.asList(line.split("\\n")));
            for (int i = 0; i < skilList.size(); i++) {
                String[] dev = skilList.get(i).split(",");
                if (dev[0].equals(id.toString())) {
                    skilList.remove(i);
                } else {
                    resultList.add(skilList.get(i));
                }
                System.out.println(skilList);
            }
        }

        try (PrintWriter writer = new PrintWriter(path)) {
            for (String string : resultList) {
                writer.write(string);
                System.out.println(string);
                writer.write("\n");
            }
        }

    }
}
