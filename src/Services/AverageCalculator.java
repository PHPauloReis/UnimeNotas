package Services;

import Entities.Student;

public class AverageCalculator {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double calculateAverage() {
        return (this.student.getGrade1() + this.student.getGrade2() + this.student.getGrade3()) / 3;
    }

    public String getStatus() {
        double average = this.calculateAverage();

        if (average >= 7) {
            return "Aprovado!";
        } else if (average >= 4) {
            return "Em recuperação";
        }

        return "Reprovado!";
    }
}
