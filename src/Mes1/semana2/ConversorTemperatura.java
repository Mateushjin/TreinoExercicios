package Mes1.semana2;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        //Requisitos:
        //	•	Peça ao usuário uma temperatura em Celsius.
        //	•	Converta para Fahrenheit usando a fórmula:
        //F = C * 1.8 + 32
        //	•	Exiba o resultado formatado.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em ºC: ");
        double tempCelsius = scanner.nextDouble();

        double tempF = tempCelsius * 1.8 + 32;

        System.out.println(tempCelsius + "ºC" + " em Celsius é igual: " + tempF + " ºF Fahrenheit");

        scanner.close();
    }
}
