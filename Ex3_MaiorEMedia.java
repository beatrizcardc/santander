package br.com.dio.exercicios.Loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    /*Exercício Solicitado:
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maiorNumero = 0;
        int mediaNumero = 0;

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            count = count + 1;
        } while(count < 5);//realização da primeira parte do exercício
    }
}
