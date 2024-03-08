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
public class Atividade18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau (em metros): ");
        double alturaDegrau = entrada.nextDouble();

        System.out.print("Digite a altura desejada (em metros): ");
        double alturaDesejada = entrada.nextDouble();

        int numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);

        System.out.println("Voc? precisará subir " + numeroDegraus + " degraus");

        entrada.close();
    }
}
