package MethodPattern.Treinamento;

import java.util.Scanner;


public class Program {
    public static void main(String[] args){

        Treinamento teste = null;

        Scanner scan = new Scanner(System.in);

        System.out.println("Que tipo de Treinamento Você Gostaria de Fazer? (1):Treino Diario | (2):Inicio de Temporada | (3):Treino Pré Jogo: ");
        String Treino = scan.nextLine();
        System.out.println(Treino);

        if(Treino.indexOf("1")>=0){
            teste = new Treino_Diario();
            scan.close();
        }
        else if(Treino.indexOf("2")>=0){
            teste = new Inicio_de_Temporada();
            scan.close();
        }
        else if(Treino.indexOf("3")>=0){
            teste = new Treino_Prejogo();
            scan.close();
        }
        else{
            System.out.println("Error #404");
            scan.close();
        };

        teste.iniciarTreinamento();
    }
}
