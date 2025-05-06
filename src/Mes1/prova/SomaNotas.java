package Mes1.prova;

import java.util.Scanner;

public class SomaNotas {
    public static void main(String[] args) {
        // Peça 3 notas (entre 0.0 e 10.0).
        //Calcule a média e classifique:
        //	•	Média ≥ 7.0 → Aprovado
        //	•	Média entre 5.0 e 6.9 → Recuperação
        //	•	Média < 5.0 → Reprovado

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas notas serão avaliados? ");
        int quantidadeNotas = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digita nota " + i + "(entre 0.0 e 10.0): ");
            double nota = scanner.nextDouble();

            while (nota < 0 || nota > 10){
                System.out.println("Nota Inválida!");
                System.out.print("Digita nota " + i + "(entre 0.0 e 10.0): ");
                nota = scanner.nextDouble();
            }

            total += nota;
        }

        double media = total / quantidadeNotas;
        System.out.printf("Média: %.2f\n", media);

        if (media >= 7){
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        }else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
