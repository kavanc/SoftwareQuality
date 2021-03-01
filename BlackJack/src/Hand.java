public interface Hand  {

//method finds the value of int array for the deal class
    static int getHandValue(int[] hand){
        int counter = 0;
        int value = 0;
        while(hand[counter] != 0){
            value += hand[counter];
            counter++;
        }
        return value;
    }

}
