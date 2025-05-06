package Mes1.semana4;

import java.util.Scanner;

public class CaixaRegistradora {
    // 	•	Peça ao usuário quantos produtos ele comprou.
    //	•	Depois, peça o valor de cada produto (um por vez).
    //	•	Ao final, mostre o valor total da compra.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos tipos de produto você comprou? ");
        int qntTotalProdutos = scanner.nextInt(); // Solicitando quantidade de tipo de produtos
        double valorTotal = 0; // Valor total da compra

        for (int i = 1; i <= qntTotalProdutos; i++) {
            System.out.println("Produto " + i);
            System.out.print("Quantidade: ");
            int qntProduto = scanner.nextInt(); // Solicitando quantidade de um produto especifico

            System.out.print("Valor do Produto " + i + " R$: ");
            double valorProduto = scanner.nextDouble(); // solicitando valor de um produto
            double valorTotalProduto = qntProduto * valorProduto;
            valorTotal += valorTotalProduto;
        }

        System.out.printf("Total da compra R$%.2f", valorTotal);

        scanner.close();
    }
}
