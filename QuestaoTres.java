package javaapplication1;

import java.util.Scanner;

public class QuestaoTres {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[(a.length - 1)];
        int aux = 0;
        int posicao = -1;

        //Popula o vetor a
        System.out.println("Vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            a[i] = leia.nextInt();
        }

        //Imprime os elementos do vetor a
        for (int i = 0; i < a.length; i++) {
            System.out.println("Indíce " + i + ": " + a[i]);
        }

        System.out.println("");

        //Solicita uma número para eliminar
        System.out.println("Informe o número que você deseja eliminar:");
        aux = leia.nextInt();

        System.out.println("");

        /*Localiza a posição do elemento 
        que se deseja Eliminar*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] == aux) {
                posicao = i;
                break;
            }
        }

        //Popula o vetor b
        int indiceAlternativo = 0;
        for (int i = 0; i < b.length; i++) {

            if (indiceAlternativo == posicao) {
                indiceAlternativo++;
            }

            b[i] = a[indiceAlternativo];
            indiceAlternativo++;
        }

        //Imprime o vetor b
        System.out.println("Vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Indíce " + i + ": " + b[i]);
        }

    }

}
