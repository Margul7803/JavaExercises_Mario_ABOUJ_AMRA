package exercice2.exo2;

import java.util.ArrayList;
import java.util.List;

public class exercice2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Erreur : Aucun argument n'a été passé.");
            return;
        }

        ArrayList<String> tab = new ArrayList<String>(List.of("kiwi", "pomme", "poire", "litchi", "rhubarbe"));

        int findIndex = findFruit(tab, args[0]);

        if (findIndex != -1) {
            System.out.println("Le fruit " + args[0] + " se trouve à l'index " + findIndex + " dans la liste.");
        } else {
            System.out.println("Le fruit " + args[0] + " n'a pas été trouvé dans la liste.");
        }
    }

    private static Integer findFruit(ArrayList<String> tab, String str){
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }



}
