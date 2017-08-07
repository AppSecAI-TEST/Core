package main.model;

import java.util.Comparator;

public class SkillComparator implements Comparator<Skill> {

    @Override
    public int compare(Skill s1, Skill s2) {
        return s2.getName().compareTo(s1.getName());
    }
}
