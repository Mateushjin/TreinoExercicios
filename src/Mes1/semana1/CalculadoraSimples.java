package Mes1.semana1;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        //Requisitos:
        //	•	Peça dois números ao usuário.
        //	•	Peça a operação a ser realizada (+, -, *, /).
        //	•	Use switch para realizar o cálculo.
        //	•	Exiba o resultado formatado.

        Scanner scanner = new Scanner(System.in);
        double resultado;

        System.out.println("1 - +");
        System.out.println("2 - -");
        System.out.println("3 - *");
        System.out.println("4 - /");
        System.out.print("Escolha a operação a ser ultilizado: ");
        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        switch (escolha){
            case 1: resultado = num1 + num2;
                System.out.println("O resultado " + resultado);
                break;
            case 2: resultado = num1 - num2;
                System.out.println("O resultado " + resultado);
                break;
            case 3: resultado = num1 * num2;
                System.out.println("O resultado " + resultado);
                break;
            case 4: resultado = num1 / num2;
                System.out.println("O resultado " + resultado);
                break;
            default:
                System.out.println("Opção Inválida!");
        }
        scanner.close();
    }
}

