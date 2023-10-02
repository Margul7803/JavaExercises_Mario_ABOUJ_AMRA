package exo4;
public class exercice4 {
    public static void main(String[] args) {
        String str = "Hello World !";
        Integer i = 0;
        
        while(i < str.length()){
            System.out.print(str.charAt(i));
            if (i < str.length()-1){
                System.out.print(" ");
            }
            i=i+1;
        }
    }
}