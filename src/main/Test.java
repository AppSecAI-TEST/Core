package main;

import main.dao.DeveloperMethods;
import main.model.Developer;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Developer developer = new Developer(1,"Ivan");
        DeveloperMethods methods = new DeveloperMethods();
        methods.create(developer);
    }
}
