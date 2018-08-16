package Questao9;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        Scanner leitor = new Scanner(System.in);
        int opcao = 1, qtdPacientes = 0, mediaHomens = 0, qtdMulheres = 0, qtdIdade = 0, maisVelho = 0;
        double maisBaixa = 0.0;
        String nomeVelho = "", nomeBaixa = "";

        while (opcao != 0) {
            System.out.printf("Informe o nome: ");
            p1.setNome(leitor.next());

            System.out.printf("Informe o sexo (M- Masculino / F- Feminino) ");
            p1.setSexo(leitor.next());

            System.out.printf("Informe o peso: ");
            p1.setPeso(leitor.nextDouble());

            System.out.printf("Informe a idade: ");
            p1.setIdade(leitor.nextInt());

            System.out.printf("Informe a altura: ");
            p1.setAltura(leitor.nextDouble());

            if(p1.getSexo() == "M" || p1.getSexo() == "m"){
                mediaHomens = mediaHomens + p1.getIdade();
            }

            if(p1.getSexo() == "F" || p1.getSexo() == "f"){
                if(p1.getAltura() >= 1.6 && p1.getAltura() <= 1.7 && p1.getPeso() > 70.0){
                    qtdMulheres++;
                }
            }

            if(p1.getIdade() >= 18 && p1.getIdade() <= 25){
                qtdIdade++;
            }

            if(p1.getIdade() > maisVelho){
                maisVelho = p1.getIdade();
                nomeVelho = p1.getNome();
            }

            if(p1.getAltura() < maisBaixa){
                maisBaixa = p1.getAltura();
                nomeBaixa = p1.getNome();
            }

            qtdPacientes++;

            System.out.printf("Deseja cadastrar outro paciente? (1- Sim / 0- Não) ");
            opcao = leitor.nextInt();

        }

        System.out.println("A quatidade de pacientes é: "+ qtdPacientes);
        System.out.println("Media da idade dos homens: "+ mediaHomens / 2);
        System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg é: "+ qtdMulheres);
        System.out.println("A quantidade de pacientes com idade entre 18 e 25 é: "+ qtdIdade);
        System.out.println("O nome do paciente mais velho é "+ nomeVelho);
        System.out.println("O nome da melher mais baixa é "+ nomeBaixa);
    }
}
