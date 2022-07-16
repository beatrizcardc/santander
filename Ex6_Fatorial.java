package br.com.dio.exercicios.Loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1; //não pode ser zero na multiplicação

        System.out.println(fatorial + "!= " );
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
