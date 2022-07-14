package br.com.dio.exercicios.Loops;

import java.util.Scanner;
/*4º Exercício Do While
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt(); //primeira parte do exercício - pedirá qtas vezes ingressaremos um número
        int count = 0; // inicia o contador
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();//solicita um número até que atinja a qtd informada.
            count ++; //incrementa o contador - senão ficaria sempre no zero e sempre o count zero seria menos que a qtd de números.

        } while(count < quantidadeNumeros); // a repetição acontecerá até atingir a qtd de nºs informada

    }
}
