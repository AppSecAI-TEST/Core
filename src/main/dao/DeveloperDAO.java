package main.dao;

import main.model.Developer;

import java.io.IOException;
import java.util.List;

public interface DeveloperDao {

    void create(Developer developer) throws IOException;

    Developer getById(Integer id) ;

    List<Developer> getAll() throws IOException;

    void update(Developer developer) throws IOException;

    void delete(Integer id) throws IOException;

}
