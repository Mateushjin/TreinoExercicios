package Mes1.semana2;

import java.util.Scanner;

public class SomaDeNumero {
    public static void main(String[] args) {
        // 	•	Peça um número inteiro positivo N.
        //	•	Some todos os números ímpares entre 1 e N.
        //	•	Mostre o resultado.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        while (num <= 0){
            System.out.println("Favor digitar um número maior que 0 (zero): ");
            num = scanner.nextInt();
        }

        int resultado = 0;

        for (int i = 1; i <= num; i++) {
           if(i % 2 == 1){
               resultado= resultado + i;
           }
        }

        System.out.println("A soma dos números ímpares de 1 até " + num + " é: " + resultado);

        scanner.close();
    }
}
