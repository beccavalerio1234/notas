package erinaldo;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo o nome da disciplina e a quantidade de aulas dadas
        System.out.println("Informe o nome da disciplina:");
        String disciplina = scanner.nextLine();

        System.out.println("Informe a quantidade de aulas dadas:");
        int aulasDadas = scanner.nextInt();

        // Inicializando variáveis para armazenar as notas e faltas
        double totalNotas = 0;
        int totalFaltas = 0;

        // Solicitando e somando as notas dos 4 bimestres
        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a nota do aluno no " + i + "º bimestre:");
            double nota = scanner.nextDouble();
            totalNotas += nota;
        }

        // Solicitando e somando o total de faltas
        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe o total de faltas do aluno no " + i + "º bimestre:");
            int faltas = scanner.nextInt();
            totalFaltas += faltas;
        }

        // Calculando a média do aluno
        double media = totalNotas / 4;

        // Calculando o total de aulas que o aluno poderia ter assistido
        int totalAulas = aulasDadas * 4;

        // Verificando se o aluno foi aprovado e se teve presença suficiente
        if (media >= 6.0 && ((totalAulas - totalFaltas) / (double) totalAulas) >= 0.75) {
            System.out.println("O aluno foi aprovado em " + disciplina + " com média " + media);
        } else {
            System.out.println("O aluno foi reprovado em " + disciplina + " com média " + media);
        }

        // Mostrando o total de faltas
        System.out.println("Total de faltas do aluno no ano letivo: " + totalFaltas);
    }
}