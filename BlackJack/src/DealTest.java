import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class DealTest {

    @Test
    public void deal() {
        String [] result = Deal.deal();
        String num = result[2];
        int res = Integer.parseInt(num);
        int check =Deal.currentHandValue(result);
        assertEquals(res,check);
        System.out.println("deal() passes");
    }

    @Test
    public void currentHandValue() {
        String[] test ={"ACE","TEN","21","","",""};
        int result = Deal.currentHandValue(test);
        assertEquals(result,21);
        System.out.println("currentHandValue() passes");
    }

    @Test
    public void hit() {

        String[] test ={"ACE","TWO","13","","",""};
        String[] result = Deal.hit(test);
        String num = result[3];
        int res = Integer.parseInt(num);
        assertTrue(res > 13);
        System.out.println("hit() passes");
    }

    @Test
    public void checkAce() {
        String[] test = {"ACE","TWO","13","","",""};
        int result;
        result = Deal.checkAce(test);
        assertEquals(result,1);
        System.out.println("checkAce() passes");
    }
}