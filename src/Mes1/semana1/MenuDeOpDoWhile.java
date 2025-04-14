package Mes1.semana1;

import java.util.Scanner;

public class MenuDeOpDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String novaOp;

        do {
            String menuDeOp = """
                    ==== MENU DE OPERAÇÕES ===="
                    1 - Soma (+)
                    2 - Subtração (-)
                    3 - Multiplicação (*)
                    4 - Divisão (/)
                    5 - Sair
                    """;
            System.out.println(menuDeOp);
            System.out.print("Escolha uma opção: ");
            int opAritm = scanner.nextInt();

            if(opAritm == 5){
                System.out.println("Finalizando a aplicação.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado;

            switch (opAritm) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, resultado);
                }
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("❌ Erro: divisão por zero!");
                    } else {
                        resultado = num1 / num2;
                        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, resultado);
                    }
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }

                scanner.nextLine(); // limpar buffer
                System.out.print("Deseja fazer outra operação? (Digite \"sair\" para sair / qualquer tecla para cotinuar): ");
                novaOp = scanner.nextLine();

        }while (!novaOp.equalsIgnoreCase("sair"));

        scanner.close();
    }
}