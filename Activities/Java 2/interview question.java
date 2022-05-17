import java.util.Scanner;

public class CardTable{
    public char[] deck = ["A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"];
    public int alecWins = 0;
    public int bobWins = 0;
}

public class Solution{
    public void solution(Char A, Char B){
        int AValue = 0;
        int BValue = 0;

        //iterating throught the values
        for (int i=0; i<14; i++){
            if (CardTable.deck[i] == A){
                AValue = i;
            }
            if (CardTable.deck[i] == B){
                BValue = i;
            }
        }

        //checking the winner
        if (AValue > BValue){
            CardTable.bobWins += 1;
        } else if (AValue < BValue){
            CardTable.alecWins +=1;
        }

    }
}

public class Main extends Solution{
    public static void main() string[] args{

        int cardsOfAHand = 0;

        System.out.println("Enter the number of cards in a hand");
        cardsOfAHand = scn.nextInt();

        // * meka internet eken baluwa!!
        char[] alecCards = new char[cardsOfAHand];  
        char[] bobCards = new char[cardsOfAHand];  

        //getting Alec's deck
        System.out.println("Enter Alec's cards");
        for (int k = 0; k < cardsOfAHand; k++){
            alecCards[k] = scn.nextChar();
        }

        //gettign Bob's deck
        System.out.println("Enter Bob's cards");
        for (int j = 0; k < cardsOfAHand; k++){
            bobCards[k] = scn.nextChar();
        }

        //running the camparing loop
        for (int m = 0; m < cardsOfAHand; m++){
            Solution.solution(alecCards[m], bobCards[m])
        }

        //outputs
        System.out.println("Alec wins:", CardTable.alecWins);
        System.out.println("Bob wins:", CardTable.bobWins);

    }
}