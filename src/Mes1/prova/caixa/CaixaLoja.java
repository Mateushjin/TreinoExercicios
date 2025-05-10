package Mes1.prova.caixa;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        // Você vai criar um sistema simples de caixa de loja, com um menu que permita:
        //	1.	Registrar compras de produtos (preço + quantidade)
        //	2.	Ver o total acumulado da compra
        //	3.	Encerrar a compra e mostrar o resumo
        //	4.	Sair do sistema
        Scanner scanner = new Scanner(System.in);

        int menuOp = 0;
        double totalCompra = 0;
        double totalProduto = 0;
        int quantidadeProduto = 0;
        int totalQuantidade = 0;
        double valorProduto = 0;

        do {
            System.out.println("====== Caixa Loja ======");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Ver total parcial");
            System.out.println("3 - Finalizar compra");
            System.out.println("4 - Sair");
            System.out.println("========================");
            System.out.print("Escolha uma opção: ");
            menuOp = scanner.nextInt();

            switch (menuOp){
                case 1: {
                    System.out.println("Quantidade: ");
                    quantidadeProduto = scanner.nextInt();

                    System.out.println("Valor(R$) :");
                    valorProduto = scanner.nextDouble();

                    totalProduto = quantidadeProduto * valorProduto;
                    totalQuantidade += quantidadeProduto;
                    totalCompra += totalProduto;
                    break;
                }
                case 2:{
                    System.out.printf("Total à pagar: %.2f\n", totalCompra);
                    break;
                }
                case 3:{
                    System.out.println("Quantidade total de produto: " + totalQuantidade);
                    System.out.println("Valor total à pagar: " + totalCompra);
                    break;
                }
                case 4:{
                    System.out.println("Saindo do sistema...");
                    break;
                }
                default:{
                    System.out.println("Opção Inválida!");
                }
            }
        }while (menuOp != 4);

        scanner.close();
    }
}
