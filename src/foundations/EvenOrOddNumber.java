package foundations;

//Statement algothms: Even or odd number
//
//Determine se determinado número inteiro é par ou ímpar.

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(("The number is even: " + number));
        } else{
            System.out.println("The number is odd: " + number
            );
        }
    }
}
