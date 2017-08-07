package main.dao;

import main.model.Developer;

import java.io.*;
import java.util.List;

public class DeveloperMethods implements DeveloperDao {

    public static final String path = "Base.txt";

    public void create(Developer developer) throws IOException {
        String finalstring = developer.getId() + "," + developer.getName() + "," + developer.getSurname() + "," +
                developer.getSkills() + "," + developer.getExperience() + "," + developer.getSalary();
        BufferedReader in = new BufferedReader(new StringReader(finalstring));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
        while ((finalstring = in.readLine()) != null)
            out.println(finalstring);
        out.close();
    }
    public void update(Developer developer){

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Developer getById(int id) {
        return null;
    }
    public List<Developer> getAll(){

        return null;
    }

    public void getById(){

    }

}
