package Mes1.semana1;

import java.util.Scanner;

public class TabuadaDeUmNumero {
    public static void main(String[] args) {
        // Objetivo: Laços e repetição estruturada.
        //
        //Requisitos:
        //	•	Peça um número ao usuário.
        //	•	Mostre a tabuada desse número (de 1 até 10).
        //	•	Ex: para 7 → 7 x 1 = 7, 7 x 2 = 14…

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
