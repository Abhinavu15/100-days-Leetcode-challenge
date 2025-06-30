import java.util.*;
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a=numBottles;
        while(numBottles>=numExchange){
            int b=numBottles/numExchange;
            int rem=numBottles%numExchange;
            a=a+b;
            numBottles=b+rem;
        }
        return a;
    }
}
