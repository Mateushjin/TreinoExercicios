package Mes1.semana3;

import java.util.Scanner;

public class Decremento2em2 {
    public static void main(String[] args) {
        // Peça um número inicial ao usuário.
        //Conte de forma decrescente até 0, pulando de 2 em 2.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = num; i >= 0; i -= 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
