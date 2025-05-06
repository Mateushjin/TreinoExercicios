package Mes1.prova;
import java.util.Scanner;

public class TabuadaComEscolha {
    // Peça um número entre 1 e 10
    //Mostre a tabuada desse número de 1 a 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int num = scanner.nextInt();

        while (num < 1 || num > 10){
            System.out.println("Valor inválido, favor digitar um número de 1 a 10: ");
            num = scanner.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            int resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }

        scanner.close();
    }
}
