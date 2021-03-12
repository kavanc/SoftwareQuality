import java.util.Arrays;
import java.util.Scanner;

public class bj_slice extends Deal {
    public static void main(String[] args){
        int a = ace_slice();
        int t = total_slice();
        String[] n = newHand_slice();
        int tf = totalfirst_slice();
        String h = h_slice();
        System.out.println("aces: " + a);
        System.out.println("total: " + t);
        System.out.println("newHand: " + Arrays.toString(n));
        System.out.println("totalfirst: " + tf);
        System.out.println("h: " + h);
    }
    public static int ace_slice(){
        String[] firsthand = deal();

        System.out.println("Would you like to hit? Y or N");
        Scanner hit = new Scanner(System.in);
        String h = hit.next();
        //turn all input to lowercase to remove comparison issues
        h= h.toLowerCase();

        int counter = 0;
        String[] newHand = new String[10];

        //while loop to add values to newHand array
        while(!firsthand[counter].equals("")) {
            counter++;
            newHand[counter] = firsthand[counter];
        }
        int aces = 0;
        while(h.equals("y")){
            newHand = hit(firsthand);
            aces = checkAce(newHand);
            break;
        }
      return aces;
    }
    public static int total_slice(){
        String[] firsthand = deal();

        System.out.println("Would you like to hit? Y or N");
        Scanner hit = new Scanner(System.in);
        String h = hit.next();
        //turn all input to lowercase to remove comparison issues
        h= h.toLowerCase();

        String[] newHand = new String[10];
        int aces = 0;
        int total = 0;
        while(h.equals("y")) {
            newHand = hit(firsthand);
            aces = checkAce(newHand);
            total = currentHandValue(newHand);
            if (total > 21 && aces > 0) {
                total -= 10;
            }
            break;
        }
        return total;
    }
    public static String[] newHand_slice(){
        String[] firsthand = deal();

        System.out.println("Would you like to hit? Y or N");
        Scanner hit = new Scanner(System.in);
        String h = hit.next();
        //turn all input to lowercase to remove comparison issues
        h= h.toLowerCase();

        int counter = 0;
        String[] newHand = new String[10];
        //while loop to add values to newHand array
        while(!firsthand[counter].equals("")) {
            counter++;
            newHand[counter] = firsthand[counter];
        }
        newHand = hit(firsthand);

        return newHand;
    }
    public static int totalfirst_slice(){
        String[] firsthand = deal();
        int totalfirst = currentHandValue(firsthand);

        return totalfirst;
    }
    public static String h_slice(){
        System.out.println("Would you like to hit? Y or N");
        Scanner hit = new Scanner(System.in);
        String h = hit.next();
        //turn all input to lowercase to remove comparison issues
        h= h.toLowerCase();
        while(h.equals("y")){
            System.out.println("Would you like to hit? Y or N");
            h = hit.next();
            h= h.toLowerCase();
        }
        return h;
    }

}
