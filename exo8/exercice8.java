package exo8;
public class exercice8 {
    public static void main(String[] args) {
        String[] colors = {"bleu" , "rouge" , "jaune"};
        
        for(String value : colors){
            switch(value){
                case "bleu":
                    System.out.println("La couleurs préférée de Louis est le " + value);
                break;
                case "rouge":
                    System.out.println("Pour sa peinture, Andrée a utilisé du " + value);
                break;
                case "jaune":
                    System.out.println("Anis n'a pas de chemise " + value);
                break;
            }
        }
    }
}