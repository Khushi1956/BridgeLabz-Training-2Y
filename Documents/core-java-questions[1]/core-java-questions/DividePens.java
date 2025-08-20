public class DividePens {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        // Pens each student gets
        int pensPerStudent = totalPens / totalStudents;

        // Remaining pens (non-distributed)
        int remainingPens = totalPens % totalStudents;

        System.out.println("Each student will get: " + pensPerStudent + " pens");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
    }
}
