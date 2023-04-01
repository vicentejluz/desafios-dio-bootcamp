/*
 * Desafio
 *  Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo
 *  calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
 *
 *  Perimetro = XX.X
 *
 *  Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a
 *  mensagem:
 *
 *  Area = XX.X
 *
 *  Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
 *
 *  Entrada
 *      A entrada contém três valores reais.
 *
 *  Saída
 *      O resultado deve ser apresentado com uma casa decimal.
 *
 * Exemplo 1
 * | Entrada	 |    Saída    |
 * | 6.0 4.0 2.0 | Area = 10.0 |
 *  ---------------------------
 *
 * Exemplo 2
 * | Entrada	 |       Saída      |
 * | 6.0 4.0 2.1 | Perimetro = 12.1 |
 *  --------------------------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double per, ar;

        // TODO: Implemente a condição necessária para o cálculo do triângulo:
        // Dica: Você pode utilizar o String.format() na formatação do texto.
        if (((b - c) < a && a < (b + c)) && ((a - c) < b && b < (a + c)) && ((a - b) < c && c < (a + b))) {
            per = a + b + c;
            System.out.printf("Perimetro = %.1f%n", per);
        } else {
            ar = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", ar);
        }
        leitor.close();
    }
}