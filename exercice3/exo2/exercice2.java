package exercice3.exo2;

public class exercice2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Erreur : Aucun argument n'a été passé.");
            return;
        }
        if (args.length == 1) {
            System.err.println("Erreur : Argument définissant le maximum manquant.");
            return;
        }
        if (args.length > 2) {
            System.err.println("Erreur : Trop d'arguments ont été passés.");
            return;
        }
        if (Integer.valueOf(args[0]) > Integer.valueOf(args[1])) {
            System.err.println("Erreur : Minimum plus grand que le maximum.");
            return;
        }

        int start = Integer.valueOf(args[0]);
        int end = Integer.valueOf(args[1]);

        for (int i = start; i <= end; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz");
            }
            else if (i % 5 == 0){
                System.out.print("Buzz");
            }
            else if (i % 3 == 0){
                System.out.print("Fizz");
            }
            else{
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
