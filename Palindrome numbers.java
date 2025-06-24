import java.util.*;
class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int x=n;
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }  
        if(rev==x){
            return true;
        }     
        else return false;
    }
    
}
