package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe a nota: ");
        double nota = entrada.nextDouble();
        entrada.close();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 7.1) {
            System.out.println("Conceito B");
        } else if (nota >= 6.1) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Sem conceito...");
        }

    }
}
