package Mes1.desafio;

import java.util.Scanner;

public class CaixaEletronicoSimples {
    public static void main(String[] args) {
        // Objetivo: Simular um sistema de saque com regras de notas.
        // Você deve criar um programa que simule um caixa eletrônico. Ele deve:
        //	v/ 1.	Pedir ao usuário para digitar um valor para saque (entre R$ 10 e R$ 1000).
        //	v/ 2.	Validar se o valor está dentro desse intervalo.
        //	3.	Calcular o menor número de notas para entregar o valor, usando as seguintes cédulas:
        //	•	R$100, R$50, R$20, R$10, R$5, R$2, R$1
        //	4.	Mostrar quantas notas de cada valor serão entregues.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para saque (entre 10 e 1000): ");
        int valorSaque = scanner.nextInt();

        while (!(valorSaque >= 10 && valorSaque <= 1000)){
            System.out.print("Por favor, digite um valor entre 10 e 1000: ");
            valorSaque = scanner.nextInt();
        }

        int resultado = valorSaque;

        while (resultado != 0){
            if (resultado >= 100){
                int nota100 = valorSaque / 100;// print 3 * 100 300
                System.out.println(nota100 + " nota(s) de R$100");
                resultado = resultado - nota100 * 100;
            } else {
                System.out.println("0 nota(s) de R$100");
            }

            if (resultado <= 99 && resultado >= 50){
                int nota50 = (valorSaque % 100) / 50; // 1 * 50
                System.out.println(nota50 + " nota(s) de R$50");
                resultado = resultado - nota50 * 50; // 26
            }else {
                System.out.println("0 nota(s) de R$50");
            }

            if (resultado <= 49 && resultado >= 20) {
                int nota20 = resultado / 20; // 1 * 20
                System.out.println(nota20 + " nota(s) de R$20");
                resultado = resultado - nota20 * 20;
            }else {
                System.out.println("0 nota(s) de R$20");
            }

            if (resultado <= 19 && resultado >= 10){
                int nota10 = resultado / 10;
                System.out.println(nota10 + " nota(s) de R$10");
                resultado = resultado - nota10 * 10;
            }else {
                System.out.println("0 nota(s) de R$10");
            }

            if (resultado <= 9 && resultado >= 5) {
                int nota5 = resultado / 5;
                System.out.println(nota5 + " nota(s) de R$5");
                resultado = resultado - nota5 * 5;
            }else {
                System.out.println("0 nota(s) de R$5");
            }

            if (resultado <= 5 && resultado >= 2) {
                int nota2 = resultado / 2;
                System.out.println(nota2 + " nota(s) de R$2");
                resultado = resultado - nota2 * 2;
            }else {
                System.out.println("0 nota(s) de R$2");
            }

            if (resultado == 1){
                int nota1 = resultado / 1;
                System.out.println(nota1 + " nota(s) de R$1");
                resultado = resultado - nota1 * 1;
            }else {
                System.out.println("0 nota(s) de R$1");
            }
        }
        scanner.close();
    }
}
