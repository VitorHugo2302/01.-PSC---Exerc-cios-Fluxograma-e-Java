/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;
import java.util.Scanner;

/**
 *
 * @author Vitor Hugo
 */
public class Atividade17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de canetas compradas : ");
        int numeroCanetas = entrada.nextInt();

        System.out.print("Digite o valor da nota : ");
        double valorNota = entrada.nextDouble();

        System.out.print("Digite o valor do troco : ");
        double troco = entrada.nextDouble();

        double custoPorCaneta = (valorNota - troco) / numeroCanetas;

        System.out.println("O custo de cada caneta é: " + custoPorCaneta + " reais");

        entrada.close();
    }
}
