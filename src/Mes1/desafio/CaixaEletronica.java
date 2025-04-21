package Mes1.desafio;

import java.util.Scanner;

public class CaixaEletronica {
    public static void main(String[] args) {
        // Objetivo: Simular um sistema de saque com regras de notas.
        // Você deve criar um programa que simule um caixa eletrônico. Ele deve:
        //	v/ 1.	Pedir ao usuário para digitar um valor para saque (entre R$ 10 e R$ 1000).
        //	v/ 2.	Validar se o valor está dentro desse intervalo.
        //	3.	Calcular o menor número de notas para entregar o valor, usando as seguintes cédulas:
        //	•	R$100, R$50, R$20, R$10, R$5, R$2, R$1
        //	4.	Mostrar quantas notas de cada valor serão entregues.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para saque (entre R$ 10 e R$ 1000): ");
        int valorSaque = scanner.nextInt();

        while(valorSaque <= 10 || valorSaque >= 1000){
            System.out.print("Valor Inválido, Por favor, digite um valor entre R$ 10 e R$ 1000): ");
            valorSaque = scanner.nextInt();
        }

        int resultado = valorSaque;

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;

        if (valorSaque >= 100){
            nota100 = resultado / 100;
            resultado = resultado % 100;
        }

        if (valorSaque >= 50){
            nota50 = resultado / 50;
            resultado = resultado % 50;
        }

        if (valorSaque >= 20){
            nota20 = resultado / 20;
            resultado = resultado % 20;
        }

        if (valorSaque >= 10){
            nota10 = resultado / 10;
            resultado = resultado % 10;
        }

        if (valorSaque >= 5){
            nota5 = resultado / 5;
            resultado = resultado % 5;
        }

        if (valorSaque >= 2){
            nota2 = resultado / 2;
            resultado = resultado % 2;
        }

        if (valorSaque >= 1){
            nota1 = resultado;
        }

        System.out.println("Para Sacar R$" + valorSaque + ", você recebe: ");
        System.out.println(nota100 + " nota(s) de R$ 100");
        System.out.println(nota50 + " nota(s) de R$ 50");
        System.out.println(nota20 + " nota(s) de R$ 20");
        System.out.println(nota10 + " nota(s) de R$ 10");
        System.out.println(nota5 + " nota(s) de R$ 5");
        System.out.println(nota2 + " nota(s) de R$ 2");
        System.out.println(nota1 + " nota(s) de R$ 1");

        scanner.close();
    }
}
