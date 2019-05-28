package javaapplication1;

import java.util.Scanner;

public class QuestaoDois {

    public static void main(String[] args) {

        //Declaração de variáveis
        Scanner leia = new Scanner(System.in);
        int[] a = new int[10];
        int[] m = new int[10];
        int x = 0;

        //Popula o vetor a
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número :");
            a[i] = leia.nextInt();
        }

        //Solicita o valor de X
        System.out.println("Informe o valor de X:");
        x = leia.nextInt();

        //Popula o vetor M
        for (int i = 0; i < m.length; i++) {
            m[i] = x * a[i];
        }

        //Percorre o vetor M
        System.out.println("Vetor M:");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }

    }

}
