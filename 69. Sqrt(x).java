class Solution {
    public int mySqrt(int x) {
     long low=0;
     long high=x;
     long k=0;
     while(low<=high){
       long mid=(high+low)/2;
        if(mid*mid==x){
            return (int)mid;
        }
        else if(mid*mid<x){
            low=mid+1;
            k=mid;
        }else{
            high=mid-1;
        }
     }
     return (int)k;
}
}