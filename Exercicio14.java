
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
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer valorA, valorB, valorAtemp;

        System.out.print("Digite o valor de A: ");
        valorA = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        valorB = entrada.nextInt();

        valorAtemp = valorA;
        valorA = valorB;
        valorB = valorAtemp;

        System.out.println("Agora o valor A é de: " + valorA);
        System.out.println("Agora o valor B é de: " + valorB);
    }
}
