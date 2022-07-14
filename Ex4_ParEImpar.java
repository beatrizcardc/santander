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
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt(); //primeira parte do exercício - pedirá qtas vezes ingressaremos um número
        int count = 0; // inicia o contador
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();//solicita um número até que atinja a qtd informada.

            //Para definir se é par ou ímpar divide por 2 e verifa o resto da divisão
            if (numero % 2 == 0 ) qtdPares++; //qtdPares = qtdPares + 1 (incremento)
            else qtdImpares++;


            count ++; //incrementa o contador - senão ficaria sempre no zero e sempre o count zero seria menos que a qtd de números.

        } while(count < quantidadeNumeros); // a repetição acontecerá até atingir a qtd de nºs informada

    }
}
