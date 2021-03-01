public class Deal extends Card implements Hand{
    public static String [] deal(){
        //first 2 cards for player are created
        String card1 = getCard();
        String card2 = getCard();
        String firstcard = getRank(card1);
        String secondcard = getRank(card2);

        //find integer values of first two cards
        int c1 = getValue(card1);
        int c2 = getValue(card2);
        //create a string array that can hold many cards
        String [] newHand ={"","","","","","","","","","",""};
        //add face value of cards to array
        newHand[0] = firstcard;
        newHand[1] = secondcard;

        //create int array with card values
        int [] total = {c1, c2,0,0,0};
        //return total value of cards and add to the array in the next available spot
        int Val = Hand.getHandValue(total);
        String handValue = Integer.toString(Val);
        newHand[2] = handValue;
        return newHand;
    }
    public static int currentHandValue(String[] newHand){
        //find the value of the hand after deal
      int value;
        int counter = 0;
        //search for first empty string and decrement counter
        while(!newHand[counter].equals("")){
            counter++;
        }
        counter--;
        //this is the string holding value of hand and is parsed
        String temp = newHand[counter];
        value = Integer.parseInt(temp);

        return value;
    }
    public static String[] hit(String[] currentHand){
        //adds a card to the array and adds the new total after the cards
        String newcard = getCard();
        String card = getRank(newcard);
        int c = getValue(newcard);
        int value = currentHandValue(currentHand);
        value += c;
        int counter = 0;
        while(!currentHand[counter].equals("")){
            counter++;
        }
        counter--;
        currentHand[counter] = card;
        counter++;
        currentHand[counter] = Integer.toString(value);
        return currentHand;
    }
    public static int checkAce(String [] hand){
        //checks how many aces are in the hand for game logic
        int num = 0;
        int counter = 0;

        while(!hand[counter].equals("")) {
            if(hand[counter].equals("ACE")){
                num++;
            }
            counter++;
        }
        return num;
    }
}
