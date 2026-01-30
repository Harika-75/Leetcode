import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1= new LinkedHashSet<>();
        Set<Integer> res= new LinkedHashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        for(int i:nums2){
            if(s1.contains(i)){
                res.add(i);
            }
        }
        int result[]=new int[res.size()];
        int i=0;
        for(int n:res){
            result[i++]=n;
        }
        
        return result;
    }
}