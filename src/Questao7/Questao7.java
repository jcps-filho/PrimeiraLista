package Questao7;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        int reprovados = 0, exame = 0, aprovados = 0;
        double nota1, nota2, media, mediaGlobal = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            System.out.printf("Informe a primeira nota: ");
            nota1 = leitor.nextDouble();
            System.out.printf("Informe a primeira nota: ");
            nota2 = leitor.nextDouble();

            media = (nota1 + nota2) / 2;
            mediaGlobal = mediaGlobal + media;

            if(media < 3){
                System.out.println("Você reprovou está reprovado, sua média final é: "+media);
                reprovados = reprovados + 1;
            }if(media >= 3 && media <= 7){
                System.out.println("Você presisara fazer o exame para ser aprovado, sua média final é: "+media);
                exame = exame + 1;
            }else {
                System.out.println("Você foi aprovado!, sua média final é: " + media);
                aprovados = aprovados + 1;
            }
        }

        mediaGlobal = mediaGlobal / 6;
        System.out.println("Total de alunos aprovados: "+ aprovados);
        System.out.println("Total de alunos no exame: "+ exame);
        System.out.println("Total de alunos reprovados: "+ reprovados);
        System.out.println("A média da classe é: "+ mediaGlobal);
    }
}
