public class Main {

    public static void main(String[] args) {

        Student student = new Student(
            "Ram",
            "ST001",
            85,
            80,
            90
        );

        StudentService studentService = new StudentService();
        StudentFileRepository repository =
                new StudentFileRepository();

        System.out.println("=== ADD STUDENT ===");
        repository.saveStudent(student);

        System.out.println("\n=== STUDENT DETAILS ===");
        studentService.displayStudentDetails(student);

        System.out.println("\n=== ALL STUDENTS ===");
        repository.readStudents();
    }
}
