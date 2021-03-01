import java.util.ArrayList;
import java.util.Collections;
public class Card {
    public static String getCard(){
        ArrayList<String> cards = new ArrayList<String>();
            //arraylist to hold all the cards
            cards.add("ACE 11");
            cards.add("TWO 2");
            cards.add("THREE 3");
            cards.add("FOUR 4");
            cards.add("FIVE 5");
            cards.add("SIX 6");
            cards.add("SEVEN 7");
            cards.add("EIGHT 8");
            cards.add("NINE 9");
            cards.add("TEN 10");
            cards.add("JACK 10");
            cards.add("QUEEN 10");
            cards.add("KING 10");
            //shuffle the cards for randomization
            Collections.shuffle(cards);
        String r = cards.get(0);

        return r;
    }

    public static int getValue(String rank){
        // parse string to find value of card
        int value = 0;
       String[] tmp = rank.split(" ");
       String num = tmp[1];
       value = Integer.parseInt(num);

        return value;
    }
    public static String getRank(String card){
        //find the name of card by splitting string
        String[] tmp = card.split(" ");
        card = tmp[0];
        return card;
    }

}
