package Mes1.prova;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // 	•	O programa sorteia um número aleatório entre 1 e 100
        //	•	O usuário tenta adivinhar
        //	•	O programa dá dicas: “maior” ou “menor”
        //	•	Conte quantas tentativas foram feitas até acertar

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int adivinhacao = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=============================================");
            System.out.println("Digite um número: ");
            adivinhacao = scanner.nextInt();

            if (numeroAleatorio > adivinhacao){
                System.out.println("O número é maior");
            }else{
                System.out.println("O número é menor");
            }
            tentativas++;
        }

        while (adivinhacao != numeroAleatorio);

        if (adivinhacao == numeroAleatorio){
            System.out.println("=============================================");
            System.out.println("Parabéns você acertou o número.");
            System.out.println("O número é: " + numeroAleatorio);
            System.out.println("Total foram " + tentativas + " tentativas.");
            System.out.println("=============================================");

        }
    }
}
