package main.model;

import java.io.IOException;
import java.util.Set;

public class Developer extends BaseEntity {

        private String name;
        private String surname;
        private Integer experience;
        private Integer salary;

        private Set<Skill> skills;

        public Developer() {

        }

        public Developer(Integer id) {
            super(id);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {

            return surname;
        }

        public void setSurname(String surname) {

            this.surname = surname;
        }

        public Integer getExperience() {

            return experience;
        }

        public void setExperience(Integer experience) {

            this.experience = experience;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        public Set<Skill> getSkills() {
            return skills;
        }

        public void setSkill(Set<Skill> skills) throws IOException {
            this.skills = skills;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", skills=" + skills +
                    ", experience=" + experience +
                    ", salary=" + salary +
                    '}';
        }
}
