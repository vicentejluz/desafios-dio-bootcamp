/*
 * Desafio
 *  Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
 *  que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da
 *  população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
 *
 *  Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de
 *  Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a
 *  tabela abaixo.
 *
 * Link: https://github.com/vicentejluz/desafios-dio-bootcamp/tree/main/desafio-dio-algoritmos-intermediarios/Taxa%20de%20Imposto%20de%20Renda/image/imposto-de-renda.png
 * 
 *  Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a
 *  faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo
 *  fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36
 *  no total. O valor deve ser impresso com duas casas decimais.
 *
 *  Entrada
 *      A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 *
 *  Saída
 *      Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas
 *      casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a
 *      mensagem "Isento".
 *
 *  Exemplo 1
 *  | Entrada |  Saída   |
 *  | 3002.00 | R$ 80.36 |
 *   --------------------
 * 
 *  Exemplo 2
 *  | Entrada | Saída  |
 *  | 1701.12 | Isento |
 *   ------------------
 *
 *  Exemplo 3
 *  | Entrada |   Saída   |
 *  | 4520.00 | R$ 355.60 |
 *   ---------------------
*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double renda, valorSobra, valorTotal;

        renda = sc.nextDouble();

        // TODO: Agora utilizando estrutura condicional implemente em seu código as
        // condições necessárias para o cálculo da taxa de imposto de renda:
        if (renda >= 0.0 && renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda <= 3000) {
            valorTotal = (renda - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", valorTotal);
        } else if (renda <= 4500) {
            valorSobra = renda - 3000;
            valorTotal = ((valorSobra) * 0.18) + ((renda - valorSobra - 2000) * 0.08);
            System.out.printf("R$ %.2f\n", valorTotal);
        } else {
            valorSobra = renda - 4500;
            valorTotal = ((valorSobra) * 0.28) + ((renda - valorSobra - 3000) * 0.18)
                    + ((renda - valorSobra - 3500) * 0.08);
            System.out.printf("R$ %.2f\n", valorTotal);
        }

        sc.close();
    }

}