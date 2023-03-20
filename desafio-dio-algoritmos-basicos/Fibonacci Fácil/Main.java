/*
 * Desafio
 *  A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa
    sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um
    algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
 *
 * Entrada
 *  O arquivo de entrada contém um valor inteiro N (0 < N < 46).
 *
 * Saída
 *  Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver
    espaço após o último valor.
 *
 * | Exemplo de Entrada | Exemplo de Saída |
 * | 5                  | 0 1 1 2 3        |
 *  ---------------------------------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
            if (i == N)
                System.out.println(anterior);

            // TODO: Implemente a condição ideal para que possamos obter os valores
            // solicitados:
            else
                System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        leitor.close();
    }

}