
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
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double quantCombustivel;
        Integer distanciaTotal;

        System.out.print("Digite a distância total percorrida: ");
        distanciaTotal = entrada.nextInt();

        System.out.print("Digite a quantidade de combustível consumida: ");
        quantCombustivel = entrada.nextDouble();

        System.out.println("Consumo médio de consumo é de: " + (distanciaTotal / quantCombustivel) + " litros");
    }
}
