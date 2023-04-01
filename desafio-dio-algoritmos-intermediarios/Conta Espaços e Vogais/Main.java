/*
 * Desafio
 *  Jorginho é professor do primário de uma determinada escola. Ele tem 100000 alunos e precisa criar
 *  um programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada
 *  string de entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes
 *  que o tempo para entrega-la no fim do semestre acabe!
 *
 *  Entrada
 *      A entrada será uma frase no formato de string. 
 *  Saída
 *      A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada
 *      string, conforme exemplo abaixo:
 *
 *  Exemplo 1
 *  | ENTRADA     |             SAÍDA              |
 *  | “Amo a DIO” | Espacos em branco: 2 Vogais: 5 |
 *   -----------------------------------------------
 *
 *  Exemplo 2
 *  | ENTRADA                  |              SAÍDA              |
 *  | “Esse desafio foi facil” | Espacos em branco: 3 Vogais: 10 |
 *   -------------------------------------------------------------
 * 
 *  Exemplo 3
 *  | ENTRADA                         |              SAÍDA               |
 *  | “Navegar nas aguas do teu mar”  | Espacos em branco: 5 Vogais: 11  |
 *   --------------------------------------------------------------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = { 'a', 'e', 'i', 'o', 'u' };
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arrVogais.length; j++) {
                if (str.toLowerCase().charAt(i) == arrVogais[j]) {
                    quantVogais++;
                }
            }
        }
        // TODO: Implemente condições (laços) adequados para que possamos contar os
        // espaços em brancos e as vogais que existem na string.
        // Dica: Você pode utilizar o Character.toLowerCase em sua condição:

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

        sc.close();
    }
}