package main.dao;

import main.model.Developer;

import java.io.IOException;
import java.util.List;

public interface DeveloperDao {

    void create(Developer developer) throws IOException;

    Developer getById(int id);

    List<Developer> getAll();

    void update(Developer developer);

    void delete(int id);

}
