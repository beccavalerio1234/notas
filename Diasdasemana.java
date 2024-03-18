package erinaldo;

import java.util.Scanner;

public class Diasdasemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 7 para representar o dia da semana:");
        int numeroDia = scanner.nextInt();
        scanner.close();

        String diaSemana = obterDiaDaSemana(numeroDia);
        System.out.println("O dia correspondente é: " + diaSemana);
    }

    public static String obterDiaDaSemana(int numeroDia) {
        String diaSemana;
        switch (numeroDia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia inválido";
        }
        return diaSemana;
    }
}
