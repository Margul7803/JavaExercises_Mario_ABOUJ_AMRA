package exercice3.exo5;

import java.util.ArrayList;
import java.util.List;

public class exercice5 {
    public static void main(String[] args) {
        ArrayList<Integer> nbArray = new ArrayList<>(List.of(75, 80, 90, 95, 85));
        Number averageArray = averageCalc(nbArray);

        System.out.println("La moyenne de la list est : " + averageArray);
    }

    private static Number averageCalc(ArrayList<Integer> numbers){
        int sum = 0;
        int nbElement = numbers.size();
        for (int number : numbers){
            sum = sum + number; 
        }
        return sum/nbElement;
    }
}
