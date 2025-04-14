package Mes1.semana1;

import java.util.Scanner;

public class ClassificadorDeNotas {
    public static void main(String[] args) {
        // Requisitos:
        //	•	Peça 3 notas ao usuário (valores entre 0.0 e 10.0).
        //	•	Se a nota for inválida, peça de novo.
        //	•	Calcule a média e classifique:
        //	•	<5: “Reprovado”
        //	•	5 a 6.9: “Recuperação”
        //	•	≥7: “Aprovado”
        double nota1;
        double nota2;
        double nota3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a 1º Nota(0-10): ");
        nota1 = scanner.nextDouble();
        while (!(nota1 >=0 && nota1 <= 10)){
                System.out.print("Nota Inválida, favor digitar um número entre 0 - 10: ");
                nota1 = scanner.nextDouble();
        }

        System.out.print("Digite a 2º Nota(0-10): ");
        nota2 = scanner.nextDouble();
        while (!(nota2 >=0 && nota2 <= 10)){
            System.out.print("Nota Inválida, favor digitar um número entre 0 - 10: ");
            nota2 = scanner.nextDouble();
        }

        System.out.print("Digite a 3º Nota(0-10): ");
        nota3 = scanner.nextDouble();
        while (!(nota3 >=0 && nota3 <= 10)){
            System.out.print("Nota Inválida, favor digitar um número entre 0 - 10: ");
            nota3 = scanner.nextDouble();
        }

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("Você está aprovado!");
        }else if (media >= 5 && media <= 6.9){
            System.out.println("Recuperação!");
        }else {
            System.out.println("Reprovado");
        }

        System.out.println("Média: " + media);

        scanner.close();
    }
}
