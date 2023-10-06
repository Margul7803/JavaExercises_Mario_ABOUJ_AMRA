package exercice5.exo2;

import java.util.ArrayList;

import exercice5.CommonFunctions.GenerateArray;

public class exercice2 {
    public static void main(String[] args) {

        GenerateArray generateArray = new GenerateArray();

        int size = 10;
        int maxNumber = 100;
        generateArray.generate(size, maxNumber);
        ArrayList<Integer> unsortedList = generateArray.getList();

        System.out.println("Liste d'origine : " + unsortedList);

        bubbleSort(unsortedList);

        System.out.println("Liste triée : " + unsortedList);
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
