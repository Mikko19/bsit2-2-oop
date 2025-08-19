public class  GradeCalculator {
    public double calculateAverage(double... grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayResult(String studentName, double average) {
        System.out.println("Student: " + studentName);
        System.out.printf("Average: %.2f\n", average);
    }

    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.println("Student: " + studentName);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Letter Grade: " + letterGrade);
    }

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        String studentName = "John Smith";
        double average = calculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = calculator.getLetterGrade(average);

        calculator.displayResult(studentName, average);
        System.out.println();
        calculator.displayResult(studentName, average, letterGrade);
    }
}
