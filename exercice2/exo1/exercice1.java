package exercice2.exo1;

import java.util.ArrayList;
import java.util.List;

public class exercice1 {

    public static void main(String[] args) {
        ArrayList<Integer> stock = new ArrayList<Integer>(List.of(14, 887, 58, 713, 179, 512, 786, 29));

        System.out.println("Contenu du stock: " + sum(stock));
    }

    private static Integer sum(ArrayList<Integer> alist){
        int result = 0;
        for(int value : alist){
            result = result + value;
        }
        return result;   
    }
}
