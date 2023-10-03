package exercice3.exo4;

public class exercice4 {
    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        int end = 10;

        for (int i = start; i <= end; i++){
            count = count + i*i;
        }
        System.out.print("La somme des carré des nombresz entre " + start + " et " + end + " est : " + count);
    }
}
