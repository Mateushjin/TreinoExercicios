package Mes1.semana4;

import java.util.Scanner;

public class CalculadoraMediaNotas {
    public static void main(String[] args) {
        // 	•	Peça 3 notas (valores entre 0.0 e 10.0).
        //	•	Calcule a média aritmética das notas.
        //	•	Diga se o aluno foi:
        //	•	Aprovado (média ≥ 7.0)
        //	•	Recuperação (média entre 5.0 e 6.9)
        //	•	Reprovado (média < 5.0)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas provas: ");
        int quantidadeProva = scanner.nextInt();

        double notaTotal = 0;

        for (int i = 0; i < quantidadeProva; i++) {
            System.out.print("Digita a nota(valores entre 00 e 10): ");
            double nota = scanner.nextDouble();
            while (nota < 0 || nota > 10){
                System.out.println("Nota inválida, favor digitar novamente: ");
                nota = scanner.nextDouble();
            }
            notaTotal += nota;
        }

        double media = notaTotal / quantidadeProva;

        System.out.printf("\nSua média é: %.2f, ", media);

        if (media >= 7){
            System.out.print("Aprovado!");
        } else if (media >= 5 && media <= 6.9){
            System.out.print("Recuperação!");
        }else {
            System.out.print("Reprovado!");
        }

        scanner.close();
    }
}
