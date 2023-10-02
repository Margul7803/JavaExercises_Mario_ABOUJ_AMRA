package exo5;
public class exercice5 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Integer i = 0;
        
        while(i < str.length()){
            if (i % 2 == 1){
                System.out.print(str.charAt(i));
            }
            i=i+1;
        }
    }
}