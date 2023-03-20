/*
 * Desafio
 *  Daenerys é a khaleesi dos Dothraki. Juntamente com Drogon, eles vão atrás do Tyrion, para tentar
    dominar Westeros. Ela possui, além do seu dragãozinho, um rastreador que mede o nível de energia de
    qualquer ser vivo. Todos os seres com o nível menor ou igual a 8000, ela considera como se fosse um
    inseto. Quando passa deste valor, que foi o caso do Drogon, ela se espanta e grita “Mais de 8000“
    Baseado nisso, utilize a mesma tecnologia e analise o nível de energia dos seres vivos.
 *
 * Entrada
 *  A primeira linha contém um número inteiro C relativo ao número de casos de teste. Em seguida,
    haverá C linhas, com um número inteiro N (100 <= N <= 100000) relativo ao nível de energia de um
    ser vivo.
 *
 * Saída
 *  Para cada valor lido, imprima o texto correspondente.
 * 
 * | Exemplo de Entrada | Exemplo de Saída |
 * | 3                  | Mais de 8000!    |
 * | 8001               | Inseto!          |
 * | 100                | Inseto!          |
 * | 200                |                  |
 *  ---------------------------------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for (int i = 0; i < casos; i++) {
            poderDeLuta = ler.nextInt();

            // TODO: Implemente a condição adequada para a impressão dos textos conforme o
            // solicitado no desafio:

            if (poderDeLuta <= 8000) {
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }

        ler.close();
    }
}