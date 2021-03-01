
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CardTest {

    @Test
    public void getCard() {
        String test = Card.getCard();
        int value = Card.getValue(test);
        String[] tmp = test.split(" ");
        int num = Integer.parseInt(tmp[1]);

        String face = Card.getRank(test);
        String exam = tmp[0];
        assertEquals(value,num);
        assertEquals(face, exam);

        System.out.println("getCard() passes");
    }

    @Test
    public void getValue() {
        String card = "ACE 11";
        int num = Card.getValue(card);
        assertEquals(11,num);
        System.out.println("getValue() passes");
    }

    @Test
    public void getRank() {
        String card = "ACE 11";
        String face = Card.getRank(card);
        assertEquals("ACE",face);
        System.out.println("getRank() passes");
    }
}