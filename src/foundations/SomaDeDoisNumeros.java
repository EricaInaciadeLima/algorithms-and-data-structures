package foundations;

import java.util.Scanner;

//Descrição do algoritmo - Soma dois números
//
//Receba dois números inteiros e retorne a soma.
//
//Exemplo
//Entrada:
//        5 7
//Saída:
//        12
public class SomaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de somar dois números.");

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();

        int resultadoDaSoma = primeiroNumero + segundoNumero;
        System.out.println("Resultado da soma: " + resultadoDaSoma);

    }
}
