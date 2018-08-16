package Questao6;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Double salario, prestacao, porcento;

        System.out.printf("Informe o seu salario bruto: ");
        salario = leitor.nextDouble();
        System.out.printf("Informe o valor de prestação desejado: ");
        prestacao = leitor.nextDouble();

        porcento = salario * 0.3;

        if(prestacao <= porcento){
            System.out.println("Emprestimo aprovado com sucesso!");
        }else{
            System.out.println("O emprestimo não podê ser aprovado.");
        }
    }
}
