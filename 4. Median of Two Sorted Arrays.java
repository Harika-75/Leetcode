class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int num[]=new int[m+n];
        for(int i=0;i<m;i++){
            num[i]=nums1[i];
        }
        for(int i=m;i<m+n;i++){
            num[i]=nums2[i-m];
        }
        Arrays.sort(num);
        int len=num.length;
        if(len%2==0){
            return (num[len/2 - 1] + num[len/2]) / 2.0;
        }
        else return num[len/2];
        
    }
}