package exercice3.exo3;

public class exercice3 {
    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        int end = 50;

        for (int i = start; i <= end; i++){
            if (i % 2 == 0 ){
                count = count + i;
            }
        }
        System.out.print("La somme des nombre pairs entre " + start + " et " + end + " est : " + count);
    }
}
