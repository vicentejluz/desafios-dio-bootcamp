/*
 * Desafio
 *  Neste desafio, faça um programa que calcule o valor de H com N termos. 
 *  Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
 *
 * Entrada 
 *  A entrada consiste em um número inteiro positivo. 
 *
 * Saída
 *  Na saída será impresso o valor que representa a soma dos termos.
 *
 * | Entrada | Saída |
   | 4	     | 2     |
   |---------|-------|
   | 8	     | 3     |
   |---------|-------|
   | 3	     | 2     |
    -----------------   
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            // TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += (1.0 / i);
        }
        // TODO: Imprima a soma dos termos, considerando um resultado com duas casas
        // decimais:
        System.out.printf("%.0f\n", h);

        sc.close();
    }
}