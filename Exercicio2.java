
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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer numero1, numero2;

        System.out.print("Digite o número X: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o número Y: ");
        numero2 = entrada.nextInt();

        System.out.println("O resto da divisão é " + (numero1 % numero2));
    }
}
