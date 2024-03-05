
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
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double raio;

        System.out.print("Digite o raio do círculo: ");
        raio = entrada.nextDouble();

        System.out.println("A área do circulo é " + 3.14 * Math.pow(raio, 2));
    }
}
