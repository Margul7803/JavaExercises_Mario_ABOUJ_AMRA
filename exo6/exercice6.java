package exo6;
public class exercice6 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Integer i = str.length();
        
        while(i > 0){
            System.out.print(str.charAt(i-1));
            i=i-1;
        }
    }
}