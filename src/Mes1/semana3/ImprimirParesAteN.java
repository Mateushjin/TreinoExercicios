package Mes1.semana3;

import java.util.Scanner;

public class ImprimirParesAteN {
    public static void main(String[] args) {
        // Peça ao usuário um número N.
        //Imprima apenas os números pares de 1 até N.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
