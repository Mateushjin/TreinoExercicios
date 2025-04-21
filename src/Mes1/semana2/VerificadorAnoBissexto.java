package Mes1.semana2;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class VerificadorAnoBissexto {
    public static void main(String[] args) {
        // Regras:
        //	•	Um ano é bissexto se:
        //	•	é divisível por 4 e
        //	•	não é divisível por 100 ou
        //	•	é divisível por 400
        //Requisitos:
        //	•	Peça ao usuário um ano (int).
        //	•	Verifique se é bissexto ou não.
        //	•	Imprima a resposta: “Ano bissexto” ou “Ano comum”.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0 && ano % 100 !=0 || ano % 400 == 0){
            System.out.println(ano + " É ano bissexto");
        } else {
            System.out.println(ano + " Não é ano bissexto");
        }

        scanner.close();
    }
}
