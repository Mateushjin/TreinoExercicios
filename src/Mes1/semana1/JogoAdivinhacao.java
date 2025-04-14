package Mes1.semana1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        //Requisitos:
        //	•	Gere um número aleatório entre 1 e 100.
        //	•	Peça para o usuário adivinhar até acertar.
        //	•	Dê dicas como “maior” ou “menor”.
        //	•	Mostre o número de tentativas ao final.
        Random random = new Random();
        int num = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);

        int resposta = 0;
        int tentativas = 0;

        while (resposta != num){
            System.out.print("Digite um número: ");
            resposta = scanner.nextInt();

            if (resposta > num){
                System.out.println("O número que você digitou e MAIOR");
            } else if (resposta < num){
                System.out.println("O número que você digitou e MENOR");
            }else {
                System.out.println("Parabéns você acertou! O número aleatório é " + num);
            }
            tentativas++;
            System.out.println("foram " + tentativas + " tentativas");
        }
        scanner.close();
    }
}
