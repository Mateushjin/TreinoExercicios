package Mes1.semana3;

import java.util.Scanner;

public class SomaImpar {
    public static void main(String[] args) {
        // Peça um número N.
        //Some apenas os números ímpares entre 1 e N.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1){
                soma = soma + i;
            }
        }

        System.out.println(soma);

        scanner.close();
    }
}
