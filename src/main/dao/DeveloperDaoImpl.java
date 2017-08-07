package main.dao;

import main.model.Developer;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeveloperDaoImpl implements DeveloperDao {

    public static final String path = "Developers.txt";

    public void create(Developer developer) throws IOException {
        String finalstring = developer.getId() + "," + developer.getName() + "," + developer.getSurname() + "," +
                developer.getSkills() + "," + developer.getExperience() + "," + developer.getSalary();
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

    public Developer getById(Integer id)  {
        Developer developer = new Developer();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                List<String> devList = new ArrayList<>(Arrays.asList(line.split(",")));
                if (devList.get(0).equals(id.toString())) {
                    developer.setName(devList.get(1));
                    developer.setSurname(devList.get(2));
                    developer.setSkills(null);
                    developer.setExperience(Integer.parseInt(devList.get(4)));
                    developer.setSalary(Integer.parseInt(devList.get(5)));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return developer;
    }

    public List<Developer> getAll(){
//        List<Developer> developers = (List<Developer>);
        return null;
    }

}
