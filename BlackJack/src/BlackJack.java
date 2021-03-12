import java.util.Scanner;

public class BlackJack extends Deal{
    public static void main(String[] args){
        System.out.println("Welcome to BlackJack!");
        System.out.println("The goal is to get to your hand to equal 21");
        System.out.println("Any other value will result in a loss");

        long startTime = System.nanoTime();
        String[] firsthand = deal();
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("time for dealing hand " + time + "ns");

        int totalfirst = currentHandValue(firsthand);

        System.out.println("Your first hand is " + firsthand[0] +" and "+ firsthand[1] + " with a value of " + totalfirst);
        if (totalfirst == 21){
            System.out.println("BLACKJACK");
            System.exit(0);
        }

        System.out.println("Would you like to hit? Y or N");
        Scanner hit = new Scanner(System.in);
        String h = hit.next();
        //turn all input to lowercase to remove comparison issues
        h= h.toLowerCase();

        int i = 0;
        int counter = 0;
        String[] newHand = new String[10];
        //while loop to add values to newHand array
        while(!firsthand[counter].equals("")) {
            counter++;
            newHand[counter] = firsthand[counter];
        }
        //nested while loops to ask player if they want to hit
        int aces = 0;
        while(h.equals("y")){

            startTime = System.nanoTime();
            newHand = hit(firsthand);
            endTime = System.nanoTime();
            time = endTime - startTime;
            System.out.println("time for adding card to hand " + time + "ns");

            startTime = System.nanoTime();
            aces = checkAce(newHand);
            endTime = System.nanoTime();
            time = endTime - startTime;
            System.out.println("time for checking hand for aces " + time + "ns");

            //find last value in array
            while(!newHand[i].equals("")){
                i++;
            }
            int x = 0;
            //print out the new hand
            System.out.println("Your new hand is: ");
            while(x < i-1){
                System.out.print(newHand[x] + " ");
                x++;
            }
            //if statement that removes 10 from total if player is over 21 and has an ace

            startTime = System.nanoTime();
            int total = currentHandValue(newHand);
            endTime = System.nanoTime();
            time = endTime - startTime;
            System.out.println("time for checking hand value " + time + "ns");

            if(total > 21 && aces > 0){
                total -= 10;
            }
            //use currentHandValue to check the value of the hand
            System.out.println("\nYour total is " + total);

            //if statements to verify whether user wins, loses or continues

            if(total == 21){
                System.out.println("YOU WIN! :)");
                System.exit(0);
            }

            if(total > 21){
                System.out.println("YOU LOSE :(");
                System.exit(0);
            }
            System.out.println("Would you like to hit? Y or N");
            h = hit.next();
            h= h.toLowerCase();
        }
        //checks if hand is less than 21 and player loses
        int total = currentHandValue(newHand);
        if(total < 21){
            System.out.println("YOU LOSE :(");
            System.exit(0);
        }
    }


}

