package Questao1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double salario, aumento, novoSalario, percentual;

        System.out.printf("Informe seu salário: ");
        salario = leitor.nextDouble();

        System.out.printf("Informe o percentual de aumento: ");
        percentual = leitor.nextInt();

        aumento = percentual / 100;

        novoSalario = salario + (salario * aumento);

        System.out.println("Seu novo salário com um aumento de "+ percentual +"% será igual á: "+ novoSalario);

    }
}
