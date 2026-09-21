package foundations;

//Statement algorithms:
//Dado um vetor:
//        [3, 7, 2, 9, 4]
//retorne:
//        25
//Obs.: Dar para aplicar essa abreviação com todos os operadores matemáticos
// operador de atribuição de subtração -> +=
// operador de atribuição de subtração -> -=
// sum += listOfNumbers[i] -> 'sum +=' está dizendo pega o valor atual e soma o valor do elemento que repesenta tal i

public class SumOfTheElements {
    public static void main(String[] args){
        final int[] listOfNumbers = {3, 7, 2, 9, 4};

        int sum = 0;

        for(int i = 0; i < listOfNumbers.length; i++){
            sum = sum + listOfNumbers[i]; //atribuir um novo valor para variável 'sum' + o valor do elemento na posição i
        }
        System.out.println("The sum is "+ sum);
    }
}
