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
public class Atividade20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double porcentagemIPI = entrada.nextDouble();

        System.out.print("Digite o c�digo da pe�a 1: ");
        int codigoPeca1 = entrada.nextInt();
        System.out.print("Digite o valor unit�rio da pe�a 1: ");
        double valorUnitarioPeca1 = entrada.nextDouble();
        System.out.print("Digite a quantidade de pe�as 1: ");
        int quantidadePeca1 = entrada.nextInt();

        System.out.print("Digite o c�digo da pe�a 2: ");
        int codigoPeca2 = entrada.nextInt();
        System.out.print("Digite o valor unit�rio da pe�a 2: ");
        double valorUnitarioPeca2 = entrada.nextDouble();
        System.out.print("Digite a quantidade de pe�as 2: ");
        int quantidadePeca2 = entrada.nextInt();

        double totalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
        double totalPeca1ComIpi = totalPeca1 + (totalPeca1 * (porcentagemIPI / 100));
        
        double totalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
        double totalPeca2ComIpi = totalPeca2 + (totalPeca2 * (porcentagemIPI / 100));
        
        double totalComIPI = totalPeca1ComIpi + totalPeca2ComIpi;

        System.out.println("C�digo da Pe�a 1: " + codigoPeca1);
        System.out.println("Total Pe�a 1: R$ " + totalPeca1ComIpi);
        System.out.println("C�digo da Pe�a 2: " + codigoPeca2);
        System.out.println("Total Pe�a 2: R$ " + totalPeca2ComIpi);
        System.out.println("Total a ser pago: R$ " + totalComIPI);

        entrada.close();
    }
}
