import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
    TreeSet<Integer> s1=new TreeSet<>();
    int i=0;
    for(int n:nums){
        s1.add(n);
    }
   for(int n:s1)
   {
     nums[i++]=n;
    }
    int n=s1.size();
    if(n<=2) return nums[n-1];
    else return nums[n-3];
    }
}