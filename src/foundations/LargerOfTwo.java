package foundations;

//Statement algorithms - Larger of two
//
//Receba dois números e informe qual é o maior.
//
//Não utilize:
//        Math.max()

import java.util.Scanner;

public class LargerOfTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("The larger number is first enter: "+ firstNumber);
        } else  if (secondNumber > firstNumber) {
            System.out.println("The larger number is second enter: " + secondNumber);
        } else if (firstNumber == secondNumber){
            System.out.println("The two entered numbers are equal: " + firstNumber);
        }
    }
}
