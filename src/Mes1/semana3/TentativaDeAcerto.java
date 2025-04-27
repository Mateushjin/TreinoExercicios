package Mes1.semana3;

import java.util.Random;
import java.util.Scanner;

public class TentativaDeAcerto {
    public static void main(String[] args) {
        // Peça para o usuário adivinhar um número secreto (por exemplo, 7).
        //Conte quantas tentativas ele precisa para acertar.

        Random random = new Random();
        int numeroRandom = random.nextInt(11);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 0 - 10: ");
        int num = scanner.nextInt();
        int tentativas = 0;

        while (num < 0 && num > 10){
            System.out.print("Favor digiter um número entre 0 - 10: ");
            num = scanner.nextInt();
        }

        do {
            System.out.println("Você errou, tente novamente");
            num = scanner.nextInt();
            tentativas++;
        }while (num != numeroRandom);

        System.out.println("Parabéns acertou, " + tentativas + " tentativas.");
        System.out.println("O número secreto é " + numeroRandom + ".");

        scanner.close();
    }
}
