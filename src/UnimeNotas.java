/*
 * União Metropolitana de Educação e Cultura (UNIME)
 * Curso: Bacharelado em Sistemas de Informação
 * Disciplina: Programação Orientada a Objetos II
 * Professor: Pablo Ricardo Roxo Silva
 * Aluno: Paulo Reis dos Santos
 */

import Entities.Student;
import Services.AverageCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UnimeNotas {
    public static void main(String[] args) {
        Student student = new Student();
        AverageCalculator averageCalculator = new AverageCalculator();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Bem-vindo ao Unime Notas =========================");
        System.out.println("Para calcular sua média informe suas notas abaixo");

        while (student.getGrade1() == null) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe a nota de sua primeira prova, exemplo: 9,5:");
                student.setGrade1(scanner.nextDouble());
            } catch (Exception e) {
                System.out.println("Aparentemente você informou uma nota inválida!");
                System.out.println("Vamos tentar novamete ;)");
            }
        }

        while (student.getGrade2() == null) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe a nota de sua segunda prova, exemplo: 9,5:");
                student.setGrade2(scanner.nextDouble());
            } catch (Exception e) {
                System.out.println("Aparentemente você informou uma nota inválida!");
                System.out.println("Vamos tentar novamete ;)");
            }
        }

        while (student.getGrade3() == null) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe a nota de sua terceira prova, exemplo: 9,5:");
                student.setGrade3(scanner.nextDouble());
            } catch (Exception e) {
                System.out.println("Aparentemente você informou uma nota inválida!");
                System.out.println("Vamos tentar novamete ;)");
            }
        }

        averageCalculator.setStudent(student);
        double average = averageCalculator.calculateAverage();

        System.out.println("Sua média é: " + decimalFormat.format(average));
        System.out.println("Seu status acadêmico é: " + averageCalculator.getStatus());

    }
}
