package foundations;

//Statement algorithms: Average of the values
//
//Dado um vetor de notas, calcule a média.
//Depois informe quantos elementos estão acima da média.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AveragOfTheValues {
    public static void main(String[] args){
        final float[] grades = {1.25f, 9.9f, 7.9f, 10f};

        float sumGrades = 0;

        for(int i = 0; i < grades.length; i++){
            sumGrades += grades[i];
        }

        float average = sumGrades/grades.length;
        BigDecimal formatAverage=new BigDecimal(average).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Average grade is : "+ formatAverage );
    }
}
