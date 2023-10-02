package exo9;
public class exercice9 {
    public static void main(String[] args) {
        Integer[] numbers = {21565 , 3412 , 180 , 1556 , 182 , 84 , 15};
        Boolean first = true;
        
        for(Integer value : numbers){
            if (value % 3 != 0){
                if (first){
                    System.out.print(value);
                    first = false;
                }else{
                  System.out.print(", " + value);  
                }
            }
        }
    }
}