package Mes1.semana4;

import java.util.Scanner;

public class VerificadorNúmeroPrimo {
    public static void main(String[] args) {
        // 	•	Peça ao usuário um número inteiro.
        //	•	Verifique se ele é primo ou não.
        //	•	Mostre uma mensagem:
        //	•	“O número é primo”
        //	•	ou “O número não é primo”

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        boolean ehPrimo = true;

        if (num <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        scanner.close();
    }
}
