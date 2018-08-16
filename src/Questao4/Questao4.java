package Questao4;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        int opcao =2;

        while (opcao != 0) {

            System.out.printf("Informe seu salário atual: ");
            salario = leitor.nextDouble();

            if (salario < 500) {
                salario = salario + (salario * 0.2);
                System.out.println("Seu novo salário será: "+salario);
            } else {
                System.out.println("Você não está elegivel para receber o aumento");
            }

            System.out.printf("Deseja realizar uma nova verificação? (1 - sim / 0 - não)");
            opcao = leitor.nextInt();
        }
    }
}