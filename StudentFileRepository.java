import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileRepository {

    private static final String FILE_NAME = "students.txt";

    public void saveStudent(Student student) {

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            writer.write(student.toFileFormat());
            writer.write(System.lineSeparator());

            System.out.println("Student added successfully.");

        } catch (IOException e) {

            System.out.println(
                "Unable to save student: " + e.getMessage()
            );
        }
    }

    public void readStudents() {

        try (BufferedReader reader =
                 new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                if (parts.length == 5) {
                    System.out.println(
                        "Name: " + parts[0] +
                        ", ID: " + parts[1] +
                        ", Scores: " +
                        parts[2] + "," +
                        parts[3] + "," +
                        parts[4]
                    );
                }
            }

        } catch (IOException e) {

            System.out.println(
                "Unable to read students: " + e.getMessage()
            );
        }
    }
}
