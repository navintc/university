import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tot =0;
        System.out.println("Enter 20 numbers:");
        for (int i=0; i<20; i++){
            tot += in.nextInt();
        }
        System.out.println("Total: " +tot + " | Average: " + (tot/20));
    }
}