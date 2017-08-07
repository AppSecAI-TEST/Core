package main.dao;

import main.model.Skill;

import java.util.List;

public interface SkillDao{

    void create(Skill skill) ;

    Skill getById(int id) ;

    List<Skill> getAll() ;

    void update(Skill skill) ;

    void delete(int id) ;
}