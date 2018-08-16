package Questao5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double litros, total;

        System.out.printf("Informe a quantidade abastecida: ");
        litros = leitor.nextDouble();

        total = litros * 2.50;

        System.out.println("Gasolina R$ 2,50 L "+ litros +"L R$"+ total);
        System.out.println("2x Refrigerante R$ 3,00 UN R$6");

        System.out.println("O total da compra é: "+ (total + 6));

    }
}
