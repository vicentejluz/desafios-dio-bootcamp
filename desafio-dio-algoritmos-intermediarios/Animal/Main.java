/*
 * DESAFIO
 *  Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema
 *  abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido
 *  através das três palavras fornecidas.
 *
 * Link: https://github.com/vicentejluz/desafios-dio-bootcamp/tree/main/desafio-dio-algoritmos-intermediarios/Animal/image/animal.png
 * 
 * Entrada
 *  A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a
 *  figura acima, com todas as letras minúsculas.
 *
 * Saída
 *  Imprima o nome do animal correspondente à entrada fornecida.
 *
 * Exemplo 1
 * | Entrada	| Saída |
 * | vertebrado | homem |
 * | mamifero   |       |
 * | onivoro    |       |
 *  --------------------
 *
 * Exemplo 2
 * | Entrada	| Saída |
 * | vertebrado | aguia |
 * | ave        |       |
 * | carnivoro  |       |
 *  --------------------
 *
 * Exemplo 3
 * Entrada	      |  Saída  |
 * | invertebrado | minhoca |
 * | anelideo     |         |
 * | onivoro      |         |
 *  ------------------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a, b, c;

        a = sc.next();
        b = sc.next();
        c = sc.next();

        if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro"))
            System.out.println("aguia");
        else if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro"))
            System.out.println("pomba");
        else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro"))
            System.out.println("homem");
        else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro"))
            System.out.println("vaca");
        else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago"))
            System.out.println("pulga");
        else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro"))
            System.out.println("lagarta");
        else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago"))
            System.out.println("sanguessuga");
        else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro"))
            System.out.println("minhoca");

        sc.close();
    }
}