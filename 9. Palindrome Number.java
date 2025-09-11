class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,r;
        int org=x;
        if(x<0) return false;
        while(x!=0){
            r=x%10;
            temp=temp*10+r;
            x=x/10;
        }
        if(org==temp) return true;
        else return false;
    }
}