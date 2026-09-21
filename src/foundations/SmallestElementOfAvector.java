package foundations;

//Statement algoritmhs: Smallest element of a numbers

public class SmallestElementOfAvector {
    public static void main(String[] args){
        int[] myList = {11, 55, 0, -2, 2, 4, 47, 155555};

        int smallest = 0;

        for(int i = 0; i < myList.length; i++){
            if(myList[i] < smallest){
                smallest = myList[i];
            }
        }
        System.out.println("The smallest element is: "+ smallest);
    }
}
