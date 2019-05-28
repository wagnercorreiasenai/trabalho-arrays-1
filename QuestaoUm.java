package javaapplication1;

import java.util.Scanner;

public class QuestaoUm {

    public static void main(String[] args) {

        //Declaração de variáveis
        Scanner leia = new Scanner(System.in);
        String[] nomes = new String[10];
        String aux;
        boolean achei = false;

        //Realiza a leitura dos nomes
        //Popula o array
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º nome:");
            aux = leia.next();
            nomes[i] = aux;

        }//Termina o primeiro loop

        System.out.println("Informe o nome que você deseja buscar:");
        aux = leia.next();

        //Começa o segundo loop
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(aux)) {
                achei = true;
                break;
            }
        }

        //Informe se achou ou não achou o nome
        if (achei) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }

    }

}
