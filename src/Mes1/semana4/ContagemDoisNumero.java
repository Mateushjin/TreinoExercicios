package Mes1.semana4;

import java.util.Scanner;

public class ContagemDoisNumero {
    public static void main(String[] args) {
        // 	Peça dois números inteiros ao usuário: A e B.
        //	•	Se A for menor que B, conte de A até B (ordem crescente).
        //	•	Se A for maior que B, conte de B até A (também em ordem crescente).
        //	•	Mostre todos os números nesse caminho, um por linha ou lado a lado.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 < num2){
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        }else if (num1 > num2){
            for (int i = num2; i <= num1; i++) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("Número são iguais!");
        }

        scanner.close();
    }
}
