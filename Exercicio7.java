
import java.text.DecimalFormat;
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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double salario;
        double percentual = 7.0 / 100.0;

        System.out.print("Digite o seu salário: ");
        salario = entrada.nextDouble();

        System.out.println("Seu salário reajustado em 7% é de R$" + new DecimalFormat("#,##0.00").format(salario + (percentual * salario)));
    }
}
