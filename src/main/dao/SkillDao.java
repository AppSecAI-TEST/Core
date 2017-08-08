package main.dao;

import main.model.Skill;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface SkillDao {

    void addSkill(Integer id, String skill) throws IOException;

    Skill getById(Integer id) ;

    List<Skill> getAll() throws IOException;

    void update(Skill skill) ;

    void delete(Integer id) ;
}