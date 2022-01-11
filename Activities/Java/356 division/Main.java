
public class Main{
    public static void main(String[] args){
        
        for (int i=200; i<2000; i++){
            if (i%3 == 0){
                if(i%5 == 0){
                    if (i%6 == 0){
                        System.out.println(i);
                    }
                }
            }
            
        }
        
    }
}