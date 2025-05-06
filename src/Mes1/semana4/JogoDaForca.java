package Mes1.semana4;

import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        String palavra = "java";

        System.out.println("A palavra tem " + palavra.length() + " letras.");
        Scanner scanner = new Scanner(System.in);
        // Início do jogo da forca
        int letrasAcertadas = 0;
        int tentativas = 0;

        while (letrasAcertadas < palavra.length()) {
            System.out.print("Digite uma letra: ");
            String tentativa = scanner.nextLine().toLowerCase();

            boolean acertou = false;

            for (int i = 0; i < palavra.length(); i++) {
                if (tentativa.equals(String.valueOf(palavra.charAt(i)))) {
                    acertou = true;
                    letrasAcertadas++;
                    break; // Conta apenas uma vez por tentativa
                }
            }

            if (acertou) {
                System.out.println("Correto!");
            } else {
                System.out.println("Errado!");
            }

            tentativas++;
        }
        System.out.println("Parabéns! Você acertou a palavra '" + palavra + "' em " + tentativas + " tentativas!");
        scanner.close();
    }
}
