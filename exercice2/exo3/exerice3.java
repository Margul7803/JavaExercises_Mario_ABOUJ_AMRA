package exercice2.exo3;

import java.util.ArrayList;
import java.util.List;

public class exerice3 {
    public static void main(String[] args) {
        ArrayList<String> quotations = new ArrayList<String>(
            List.of(
                "Quand Paris s'enrhume, l'Europe a froid",
                "S'il y a un diamant dans la poitrine, il brille sur le visage",
                "La joie de vivre n'est pas un but, mais un devoir")
            );
        for (String phrase : quotations){
            System.out.println(phrase + " : " + countVowels(phrase));
        }
    }

    private static Integer countVowels(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'y':
                case 'Y':
                    sum = sum + 1;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }
}
