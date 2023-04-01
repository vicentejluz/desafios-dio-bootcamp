/*
 * Desafio
 *  Seu Zé está vendendo frutas com a seguinte tabela de preços:
 *
 *            | Até 5 Kg	   | Acima de 5 Kg  |
 *  | Morango | R$ 2,50 por Kg | R$ 2,20 por Kg |
 *  | Maçã	  | R$ 1,80 por Kg | R$ 1,50 por Kg |
 *   -------------------------------------------
 * 
 *  Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
 *  receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em
 *  Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
 *  cliente.
 *
 *  Entrada
 *      Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.
 *
 *  Saída
 *      Será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.
 *
 * Exemplo 1
 * | Entrada | Saída |
 * | 3       | 11.1  |    
 * | 2	     |       |
 *  -----------------
 *
 * Exemplo 2
 * | Entrada | Saída |
 * | 1       | 4.3   |    
 * | 1	     |       |
 *  -----------------
 *
 * Exemplo 3
 * | Entrada | Saída |
 * | 5       | 19.35 |    
 * | 5	     |       |
 *  -----------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        int peso = morangos + macas;
        double soma, precoMorangos = 2.5, PrecoMacas = 2.2;

        if (macas <= 5)
            PrecoMacas = 1.8;
        else if (macas > 5)
            PrecoMacas = 1.5;

        soma = (precoMorangos * morangos) + PrecoMacas * macas;

        // TODO: Implemente as condições necessárias para retornar o preço a ser pago
        // pelo cliente, conforme a tabela de preços do seu Zé:
        if (peso > 8 || soma > 25.0) {
            soma -= (soma * 0.1);
            System.out.printf("%.2f", soma);
        } else {
            System.out.printf("%.1f", soma);
        }

        input.close();
    }
}