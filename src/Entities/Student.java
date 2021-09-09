package Entities;

public class Student {

    private Double grade1;
    private Double grade2;
    private Double grade3;

    public Double getGrade1() {
        return grade1;
    }

    public void setGrade1(Double grade1) throws Exception {
        if (grade1 < 0 || grade1 > 10) {
            throw new Exception("A nota informada deve estar em um intervalo entre 0 e 10!");
        }

        this.grade1 = grade1;
    }

    public Double getGrade2() {
        return grade2;
    }

    public void setGrade2(Double grade2) throws Exception {
        if (grade2 < 0 || grade2 > 10) {
            throw new Exception("A nota informada deve estar em um intervalo entre 0 e 10!");
        }

        this.grade2 = grade2;
    }

    public Double getGrade3() {
        return grade3;
    }

    public void setGrade3(Double grade3) throws Exception {
        if (grade3 < 0 || grade3 > 10) {
            throw new Exception("A nota informada deve estar em um intervalo entre 0 e 10!");
        }

        this.grade3 = grade3;
    }
}
