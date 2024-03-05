
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
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer primeiraNota, segundaNota, terceiraNota;

        System.out.print("Digite a primeira nota: ");
        primeiraNota = entrada.nextInt();

        System.out.print("Digite a segunda nota: ");
        segundaNota = entrada.nextInt();

        System.out.print("Digite a terceira nota: ");
        terceiraNota = entrada.nextInt();

        System.out.println("A sua média é de " + (primeiraNota + segundaNota + terceiraNota) / 3);
    }
}
