//package main.model;
//
//import java.util.Set;
//
//public class Customer extends BaseEntity {
//
//    private Set<Project> customerProjects;
//
//    public Customer() {
//
//    }
//
//    public Customer(Integer id, String name, Set<Skill> skills, Integer experience, Integer salary) {
//        super(id, name, salary, skills);
//    }
//
//    public Set<Project> getCustomerProjects() {
//        return customerProjects;
//    }
//
//    public void setCustomerProjects(Set<Project> customerProjects) {
//        this.customerProjects = customerProjects;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder("Customer{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", projects:\n");
//        for (Project project : customerProjects) {
//            builder.append("Project{id=");
//            builder.append(project.getId());
//            builder.append(", name='");
//            builder.append(project.getName());
//            builder.append("\'},\n");
//        }
//        return builder.substring(0, builder.length() - 2) + "}\n";
//    }
//}
