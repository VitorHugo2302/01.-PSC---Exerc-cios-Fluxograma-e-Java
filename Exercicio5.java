
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valorDolar;

        System.out.print("Digite o valor em dólar: ");
        valorDolar = entrada.nextDouble();

        System.out.println("Valor em reais: " + new DecimalFormat("#,##0.00").format(valorDolar * 4.95));
    }
}
