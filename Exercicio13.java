
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
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valorHora, percentualInss;
        Integer horasTrabalhadas;

        System.out.print("Digite o valor da hora do seu trabalho: ");
        valorHora = entrada.nextDouble();

        System.out.print("Digite suas horas trabalhadas no mês: ");
        horasTrabalhadas = entrada.nextInt();

        System.out.print("Digite percentual de desconto do INSS: ");
        percentualInss = entrada.nextDouble();
        
        Double salarioBruto = valorHora * horasTrabalhadas;
        Double percentual = percentualInss / 100;

        System.out.println("Seu salário líquido é de R$: " + (salarioBruto - (percentual * salarioBruto)));
    }
}
