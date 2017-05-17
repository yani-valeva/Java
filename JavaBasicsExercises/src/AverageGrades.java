import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Student> students = new ArrayList<>();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            String[] input = scanner.nextLine().split(" ");

            Student student = new Student();
            student.name = input[0];
            List<Double> grades = new ArrayList<>();

            for (int j = 1; j < input.length; j++) {
                grades.add(Double.parseDouble(input[j]));
            }

            student.grades = grades;
            students.add(student);
        }

        Student[] filteredSortedStudents = students
                .stream()
                .filter(a -> a.getAverageGrade() >= 5)
                .sorted((a, b) -> {
                    if (a.getName().compareTo(b.getName()) == 0) {
                        return Double.compare(b.getAverageGrade(), a.getAverageGrade());
                    }
                    return a.getName().compareTo(b.getName());
                })
                .toArray(Student[]::new);

        for (Student student : filteredSortedStudents)
        {
            String name = student.getName();
            double average = student.getAverageGrade();

            System.out.println(String.format("%s -> %.2f", name, average));
        }
    }
}

class Student {
    public String name;
    public List<Double> grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0D;

        for (Double grade : grades) {
            sum += grade;
        }

        double averageGrade = sum / grades.size();
        return  averageGrade;
    }
}
