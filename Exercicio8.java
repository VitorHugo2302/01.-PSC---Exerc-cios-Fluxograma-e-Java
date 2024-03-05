
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
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer metros;

        System.out.print("Digite a quantidade de metros: ");
        metros = entrada.nextInt();

        System.out.println("A quantidade de centimetros é de " + metros * 100);
    }
}
