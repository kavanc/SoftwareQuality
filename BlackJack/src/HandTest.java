import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HandTest{

    @Test
    public void getHandValue() {
        int[] hand = {10,11,0,0};
        int result = Hand.getHandValue(hand);
        assertEquals(result,21);
        System.out.println("getHandValue() passes");
    }
}