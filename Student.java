public class Student {

    private String name;
    private String id;
    private int mathScore;
    private int scienceScore;
    private int englishScore;

    public Student(String name, String id, int mathScore,
                   int scienceScore, int englishScore) {

        this.name = name;
        this.id = id;
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getScienceScore() {
        return scienceScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public double calculateAverage() {
        return (mathScore + scienceScore + englishScore) / 3.0;
    }

    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public String toFileFormat() {
        return name + "," + id + "," +
               mathScore + "," +
               scienceScore + "," +
               englishScore;
    }
}
