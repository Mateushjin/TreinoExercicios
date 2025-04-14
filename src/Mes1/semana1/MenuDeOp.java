package Mes1.semana1;

import java.util.Scanner;

public class MenuDeOp {
    public static void main(String[] args) {
        // Requisitos:
        //	•	Mostre um menu com 4 opções: somar, subtrair, multiplicar, dividir.
        //	•	Peça dois números e realize a operação escolhida.
        //	•	Após mostrar o resultado, pergunte se o usuário quer fazer outra operação.
        //	•	Use do-while para repetir até ele digitar “n” ou “sair”.

        Scanner scanner = new Scanner(System.in);
        String menuDeOp = """
                1 - Somar (+)
                2 - Subtrair (-)
                3 - Multiplicar (*)
                4 - Dividir (/)
                5 - SAIR
                """;
        double resultado;
        String sair;

        do {
            System.out.println(menuDeOp);
            System.out.print("Escolha uma opção: ");
            int opArit = scanner.nextInt();

            if (opArit == 5){
                System.out.println("Saindo da aplicação...");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            switch (opArit){
                case 1: resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2: resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3: resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4: resultado = num1 / num2;
                    System.out.println(num1 + " /" + num2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

            scanner.nextLine();
            System.out.println("Digite \"sair\" para finalizar, qualquer outra tecla pra continuar: ");
            sair = scanner.nextLine();

        }while (!sair.equalsIgnoreCase("sair"));

        scanner.close();
    }
}
