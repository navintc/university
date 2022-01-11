import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Name");
        String n = in.nextLine();
        
        System.out.println("Enter Salary");
        int s = in.nextInt();
        
        System.out.println("Enter Bonus");
        int b = in.nextInt();

        System.out.println(n + ": " + (s+b) );
        
    }
}   