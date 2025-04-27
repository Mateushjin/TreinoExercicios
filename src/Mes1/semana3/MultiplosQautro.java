package Mes1.semana3;

import java.util.Scanner;

public class MultiplosQautro {
    public static void main(String[] args) {
        // Peça um número N.
        //Conte quantos números múltiplos de 4 existem entre 1 e N.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite num número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
