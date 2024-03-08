
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
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer numero1, numero2;
        System.out.print("Digite o primeiro número: ");
        numero1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite o segundo número: ");
        numero2 = Integer.parseInt(entrada.nextLine());
        System.out.println("A soma é " + (numero1 + numero2));
    }
}
