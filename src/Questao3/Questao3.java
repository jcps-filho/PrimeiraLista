package Questao3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int tabuada;

        System.out.printf("Informe qual tabuada deseja vizualizar: ");
        tabuada = leitor.nextInt();

        for(int i = 0; i <= 10; i++){

            System.out.println(tabuada+" x "+ i +" = "+ tabuada * i);
        }
    }
}
