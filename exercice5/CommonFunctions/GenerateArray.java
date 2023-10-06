package exercice5.CommonFunctions;

import java.util.ArrayList;
import java.util.Random;

public class GenerateArray {
    private static ArrayList<Integer> list = new ArrayList<Integer>();
     
    public static void generate(int size, int maxNumber) {
        if (size <= 0 || maxNumber < 1) {
            System.out.println("Taille invalide ou nombre max invalide.");
            return;
        }
        list.clear();

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(maxNumber) + 1;
            } while (list.contains(randomNumber)); 
            list.add(randomNumber);
        }
    }

    public static void addItem(Integer item){
        list.add(item);
    }

    public static ArrayList<Integer> getList(){
        return list;
    }
}
