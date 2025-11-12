import java.util.*;

public class ResumeScreeningDemo {
    static abstract class JobRole { private final String title; JobRole(String t){title=t;} public String getTitle(){return title;} }
    static class SoftwareEngineer extends JobRole { SoftwareEngineer(){ super("Software Engineer"); } }
    static class DataScientist extends JobRole { DataScientist(){ super("Data Scientist"); } }
    static class ProductManager extends JobRole { ProductManager(){ super("Product Manager"); } }

    public static class Resume<T extends JobRole> {
        private final String candidateName;
        private final T role;
        public Resume(String name, T role) { this.candidateName = name; this.role = role; }
        public T getRole() { return role; }
        public String getCandidateName() { return candidateName; }
        @Override public String toString(){ return candidateName + " for " + role.getTitle(); }
    }

    // wildcard method to process multiple roles
    public static void processResumes(List<? extends JobRole> roles) {
        System.out.println("Processing role types:");
        for (JobRole r : roles) System.out.println(" - " + r.getTitle());
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Bob", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Carol", new ProductManager());

        List<JobRole> roles = Arrays.asList(r1.getRole(), r2.getRole(), r3.getRole());
        System.out.println("Resumes:");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        processResumes(roles);
    }
}
