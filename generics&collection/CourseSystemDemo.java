import java.util.*;

public class CourseSystemDemo {
    static abstract class CourseType { String desc; CourseType(String d){desc=d;} @Override public String toString(){return desc;} }
    static class ExamCourse extends CourseType { ExamCourse(){ super("Exam-based"); } }
    static class AssignmentCourse extends CourseType { AssignmentCourse(){ super("Assignment-based"); } }
    static class ResearchCourse extends CourseType { ResearchCourse(){ super("Research-based"); } }

    public static class Course<T extends CourseType> {
        private final String code;
        private final T type;
        public Course(String code, T type){ this.code = code; this.type = type; }
        public String getCode(){ return code; }
        public T getType(){ return type; }
        @Override public String toString(){ return code + " [" + type + "]"; }
    }

    public static void showCourses(List<? extends CourseType> types) {
        System.out.println("Course types:");
        for (CourseType t : types) System.out.println(" - " + t);
    }

    public static void main(String[] args) {
        Course<ExamCourse> cs101 = new Course<>("CS101", new ExamCourse());
        Course<AssignmentCourse> cs102 = new Course<>("CS102", new AssignmentCourse());
        Course<ResearchCourse> cs201 = new Course<>("CS201", new ResearchCourse());

        List<Course<? extends CourseType>> all = Arrays.asList(cs101, cs102, cs201);
        System.out.println("Courses:");
        for (Course<? extends CourseType> c : all) System.out.println(" - " + c);
    }
}
