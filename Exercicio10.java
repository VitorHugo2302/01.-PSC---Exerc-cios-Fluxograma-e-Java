
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer tempFahrenheit;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        tempFahrenheit = entrada.nextInt();

        System.out.println("Temperatura em Celsius é " + (tempFahrenheit - 32) * 5 / 9 + " °C");
    }
}
