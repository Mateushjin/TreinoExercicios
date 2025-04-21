package Mes1.semana2;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // 	•	Peça um número inteiro positivo.
        //	•	Calcule o fatorial (ex: 5! = 5 × 4 × 3 × 2 × 1 = 120).
        //	•	Mostre o resultado.

        int resultado = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        while (num <= 0){
            System.out.println("Favor digitar um número maior que 0 (zero): ");
            num = scanner.nextInt();
        }

        for (int i = 1; i <= num; i++) {
            resultado  = resultado * i;
        }

        System.out.println("O fatorial de " + num + " é: " + resultado);

        scanner.close();

    }
}
