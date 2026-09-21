package foundations;

//Statement algorithm: Largest element of a vector
//Encontre o maior valor sem ordenar o vetor.
//
//Exemplo:
//Entrada:
//        [4, 7, 1, 9, 3]
//Saída:
//        9

/*
 * FOR — estrutura de repetição
 *
 * Estrutura:
 * for (inicialização; condição; incremento(++)/decremento(--))
 *
 * 1. Inicialização → executada uma única vez no início.
 *    Em arrays, geralmente define o índice inicial (ex.: i = 0).
 *
 * 2. Condição → verificada antes de cada execução.
 *    Se for true, executa o bloco; se for false, encerra o for.
 *
 * 3. Incremento/decremento → executado após o bloco.
 *    Atualiza a variável de controle (ex.: i++).
 *
 * Fluxo:
 * inicializa → verifica → executa → incrementa → verifica → ...
 */

//length(comprimento) -> length != length()?. quantidade de elementos no vetor
//índice(i) > posição dos elementos dentro do vetor
//
public class LargestElementOfAvector {
    public static void main(String[] args){
         final int[] listOfNumbers = {11, 55, 0, 2, 4, 47, 155555};//vetor que contém elementos
//        int[] listOfNumbers = new init[4]; -> criar a variavel com tamanho determinado sem conter elementos na array

        int largest = listOfNumbers[0];

        for(int indice = 0; indice < listOfNumbers.length; indice++ ){
            if (listOfNumbers[indice] >  largest ){
                largest = listOfNumbers[indice];
            }
        }
        System.out.println("The largest number is: " + largest);

    }
}
