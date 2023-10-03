package exerciceBonus;

public class exerciceBonus {
    public static void main(String[] args){
        if (args.length == 0) {
            System.err.println("Erreur : Aucun argument n'a été passé.");
            return;
        }

        int taille = Integer.parseInt(args[0]);

        affSapin(taille);

    }

    public static void affSapin(int taille){
        int incr = 2*(taille-1);
        for (int i = 0; i < taille; i++){

            for (int j = 0; j < 4+i ; j++){
                for (int l = 3+i-j+taille-i+incr; l > 0 ; l--){
                    System.out.print(" ");
                    
                }
                for (int l = j*2+1+i*4; l > 0 ; l--){
                    System.out.print("*");
                }
                System.out.println("");
            }
            incr = incr-2;
        }

        incr = 2*(taille-1);
        for (int i = 0; i < taille; i++){
            for (int l = 4+taille/2+incr; l > 0 ; l--){
                System.out.print(" ");
            }
            for (int j =0; j < taille; j++){
                System.out.print("|");
            }
                System.out.println("");
        }
    }
}
