package Questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1, num2;
        int x = 10;


        while (x > 0) {
            System.out.printf("Digite um número inteiro: ");
            num1 = leitor.nextInt();

            num2 = num1 % 2;

            if (num2 == 0) {
                System.out.println("O número " + num1 + " é par");
            } else {
                System.out.println("O número " + num1 + " é impar");
            }
            x--;
        }
    }
}
