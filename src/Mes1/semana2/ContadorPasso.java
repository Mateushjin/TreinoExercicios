package Mes1.semana2;

import java.util.Scanner;

public class ContadorPasso {
    public static void main(String[] args) {
        // Requisitos:
        //	•	Peça um valor inicial, um valor final e um passo (todos int).
        //	•	Imprima os números do valor inicial até o final, pulando de acordo com o passo.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita o número inicial: ");
        int numInicial = scanner.nextInt();

        System.out.print("Digite o número final: ");
        int numFinal = scanner.nextInt();

        System.out.print("Digite o passo: ");
        int passo = scanner.nextInt();

        System.out.println("\nResultado de Contagem:");

        if (numInicial <= numFinal){
            for (int i = numInicial; i <= numFinal; i += passo) {
                System.out.print(i + " ");
            }
        }else {
            for (int i = numInicial; i >= numFinal; i -= passo) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
