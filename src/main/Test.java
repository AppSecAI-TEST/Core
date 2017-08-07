package main;

import main.dao.DeveloperMethods;
import main.model.Developer;
import main.model.Skill;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Set<Skill> skills = new TreeSet<>();
        Developer developer = new Developer();
        DeveloperMethods methods = new DeveloperMethods();
        methods.create(developer);
    }
}
