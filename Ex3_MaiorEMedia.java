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
        int somaNumero = 0; //faremos a soma dos nºs inseridos

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            somaNumero = somaNumero + numero;

            if (numero > maiorNumero) maiorNumero = numero;

            count = count + 1;
        } while(count < 5);//realização da primeira parte do exercício

        System.out.println("Maior: " + maiorNumero);//realização da segunda parte do exercício -
        //deixamos o sysout fora do laço, senão mostraria o maior vez por vez, e só queremos ao final dos 5 números.
        System.out.println("A média dos números é: " + somaNumero/5);//esse sysout também precisa ficar fora do laço de repetição, para mostrar o resultado uma única vez

    }


}
