import java.util.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;

        // if(n==2^x) return true;
        // else return false;
    }
}
