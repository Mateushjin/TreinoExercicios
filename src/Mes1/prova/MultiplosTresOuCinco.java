package Mes1.prova;

import java.util.Scanner;

public class MultiplosTresOuCinco {
    // Peça um número inteiro positivo N
    //Mostre todos os números entre 1 e N que sejam múltiplos de 3 ou de 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
