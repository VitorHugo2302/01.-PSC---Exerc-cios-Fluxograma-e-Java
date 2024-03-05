
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
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer numero;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        System.out.println("Seu antecessor é: " + (numero - 1));

        System.out.println("Seu sucessor é: " + (numero + 1));
    }
}
