package main.dao;

import main.model.Developer;
import main.model.Skill;

import java.io.*;
import java.util.*;

public class DeveloperDaoImpl implements DeveloperDao {

    public static final String path = "Developers.txt";
    public static final String pathSkill = "Skills.txt";

    public void create(Developer developer) throws IOException {
        String finalstring = developer.getId() + "," + developer.getName() + "," + developer.getSurname() + "," +
                developer.getSkills() +  "," + developer.getExperience() + "," + developer.getSalary();
        BufferedReader in = new BufferedReader(new StringReader(finalstring));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
        while ((finalstring = in.readLine()) != null)
            out.println(finalstring);
        out.close();
    }

    public void update(Developer developer) throws IOException {
        Scanner sc = new Scanner(new File(path));
        List<String> resultList = new ArrayList<>();
        String finalstring = developer.getId() + "," + developer.getName() + "," + developer.getSurname() + "," +
                developer.getSkills() + "," + developer.getExperience() + "," + developer.getSalary();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String pID = String.valueOf(developer.getId());
            List<String> devList = new ArrayList<>(Arrays.asList(line.split("\\n")));
            for (int i = 0; i < devList.size(); i++) {
                String[] dev = devList.get(i).split(",");
                if (dev[0].equals(pID)) {
                    devList.remove(i);
                } else {
                    resultList.add(devList.get(i));
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
    }

    public void delete(Integer id) throws IOException {
        Scanner sc = new Scanner(new File(path));
        List<String> resultList = new ArrayList<>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            List<String> devList = new ArrayList<>(Arrays.asList(line.split("\\n")));
            for (int i = 0; i < devList.size(); i++) {
                String[] dev = devList.get(i).split(",");
                if (dev[0].equals(id.toString())) {
                    devList.remove(i);
                } else {
                    resultList.add(devList.get(i));
                }
                System.out.println(devList);
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

    public Developer getById(Integer id) {
        Developer developer = new Developer();
//        try {
//            Scanner scanner = new Scanner(new File(path));
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                List<String> devList = new ArrayList<>(Arrays.asList(line.split(",")));
//                if (devList.get(0).equals(id.toString())) {
//                    developer.setName(devList.get(1));
//                    developer.setSurname(devList.get(2));
//                    developer.setSkill(devList.get(3));
//                    developer.setExperience(Integer.parseInt(devList.get(4)));
//                    developer.setSalary(Integer.parseInt(devList.get(5)));
//                }
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(developer);
        return developer;
    }

    public List<Developer> getAll() throws IOException {
        List<Developer> devList = new ArrayList<>();
//        Developer developer = null;
//
//        Scanner scanner = new Scanner(new File(path));
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            List<String> devData = new ArrayList<>(Arrays.asList(line.split(",")));
//            developer = new Developer();
//
//            int devId = Integer.parseInt(devData.get(0));
//            String devName = devData.get(1);
//            String devSurname = devData.get(2);
//            String devSkill = devData.get(3);
//            int devExp = Integer.parseInt(devData.get(4));
//            int devSalaty = Integer.parseInt(devData.get(5));
//
//            developer.setId(devId);
//            developer.setName(devName);
//            developer.setSurname(devSurname);
//            developer.setSkill(devSkill);
//            developer.setExperience(devExp);
//            developer.setSalary(devSalaty);
//            devList.add(developer);
//        }
//        System.out.println(devList);
        return devList;
    }

    public String getIdSkills(){
        StringBuilder builder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(pathSkill));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                List<String> skillIdList = new ArrayList<>(Arrays.asList(line.split(",")));
                builder.append(skillIdList.get(0));
                builder.append(";");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return builder.substring(0, builder.length() - 3);
    }
}

