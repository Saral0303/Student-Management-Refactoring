public class StudentService {

    public void displayStudentDetails(Student student) {

        double average = student.calculateAverage();
        String grade = student.calculateGrade();

        System.out.println("Student: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Grade: " + grade);
    }

    public void displayStudent(Student student) {

        System.out.println(
            "Name: " + student.getName() +
            ", ID: " + student.getId() +
            ", Scores: " +
            student.getMathScore() + "," +
            student.getScienceScore() + "," +
            student.getEnglishScore()
        );
    }
}
