/*
 * Desafio
 *  O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
    distribuidor e dos impostos (aplicados ao custo de fábrica). O gerente de uma loja de carros
    gostaria de um programa para calcular o preço de um carro novo para os clientes. Você receberá o
    custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e deverá escrever
    programa para ler esses valores e imprimir o valor final do carro.
 *
 * Entrada
 *  Você recebera três valores inteiros que representam o custo de fábrica, as porcentagens do
    distribuidor e os impostos.
 *
 * Saída
 *  Como saída, teremos o valor final do preço de um carro novo.
 * 
 * Exemplo 1
 * | Entrada | Saída |
 * | 20000   | 34600 |
 * | 28      |       |
 * | 45      |       |
 *  -----------------
 * 
 * Exemplo 2
 * | Entrada | Saída |
 * | 30000   | 36000 |
 * | 10      |       |
 * | 10      |       |
 *  -----------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;

        int Distribuidor;
        int ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos
        // impostos:

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;

        System.out.println(custoConsumidor);

        scan.close();
    }
}