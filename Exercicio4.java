
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
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, endereco;
        Integer telefone;

        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite o seu endereço: ");
        endereco = entrada.nextLine();

        System.out.print("Digite o seu telefone: ");
        telefone = entrada.nextInt();

        System.out.println("Nome " + nome);
        System.out.println("Endereço " + endereco);
        System.out.println("Telefone " + telefone);
    }
}
