package Questao8;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int dias = 2;

        double total;
        Scanner sc = new Scanner(System.in);
        while (dias != 0) {
            System.out.printf("Digite seu nome:");
            nome = leitor.next();
            System.out.printf("Bem Vindo(a)! "+ nome + ", informe quantos dias você ficara hospedado(a) (Para encerrar informe '0'): ");
            dias = leitor.nextInt();

            if (dias < 10) {
                total = (dias * 40) + (dias * 15);
                System.out.println("O valor da sua estadia é: " + total);
            } else {
                total = (dias * 40) + (dias * 8);
                System.out.println("O valor da sua estadia é: " + total);
            }
        }
    }
}