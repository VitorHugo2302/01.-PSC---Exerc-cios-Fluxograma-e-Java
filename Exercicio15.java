
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
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A:");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de B:");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de C:");
        double c = entrada.nextDouble();

        double delta = b * b - 4 * a * c;

        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("As raízes da equação são:");
        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);
        
        entrada.close();
    }
}
