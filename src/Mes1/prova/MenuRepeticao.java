package Mes1.prova;

import java.util.Scanner;

public class MenuRepeticao {
    // 	•	Use switch para as opções
    //	•	O menu deve se repetir até o usuário escolher a opção 3
    //   1 - Somar dois números
    //   2 - Subtrair dois números
    //   3 - Sair

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuOp = 0;
        do {
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção: ");

            menuOp = scanner.nextInt();

            switch (menuOp){
                case 1: {
                    double total = 0;
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Digite " + i + "º número: ");
                        double numero = scanner.nextDouble();
                        total += numero;
                    }
                    System.out.println("==========================");
                    System.out.println("Total: " + total);
                    System.out.println("==========================");
                    break;
                }
                case 2: {
                    System.out.println("Digite o 1º número: ");
                    double num1 = scanner.nextDouble();

                    System.out.println("Digite o 2º número: ");
                    double num2 = scanner.nextDouble();

                    double resultado = num1 - num2;

                    System.out.println("==========================");
                    System.out.println("Resultado: " + resultado);
                    System.out.println("==========================");
                    break;
                }
                default:
                    System.out.println("Saindo da Aplicação...");
            }


        }while (menuOp != 3);

        scanner.close();
    }
}
