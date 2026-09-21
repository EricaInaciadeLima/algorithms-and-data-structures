package foundations;

//Statemet algorithm: Larger of three
//
//Receba três números inteiros e retorne o maior deles.

import java.util.Scanner;

public class LargerOfThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println("The larger number of three numbers is: " + firstNumber );
        } else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println("The larger number of three numbers is: " + secondNumber);
        } else{
            System.out.println("The larger number of three numbers is: " + thirdNumber);
        }

    }
}
