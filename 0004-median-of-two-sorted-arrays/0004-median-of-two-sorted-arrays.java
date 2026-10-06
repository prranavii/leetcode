class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m = nums2.length;
        int [] newnum=new int[n+m];

        int i=0;
        int j=0;
        int k=0;
          while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                newnum[k++] = nums1[i++];
            } else {
                newnum[k++] = nums2[j++];
            }
        }
      
        while (i < n) {
            newnum[k++] = nums1[i++];
        }

        while (j < m) {
            newnum[k++] = nums2[j++];
        }
        
        int total=n+m;
        if(total%2 != 0){
            return newnum[total/2];

        }else{
            int m1= newnum[(total/2)-1];
            int m2= newnum[total/2];
            return (m1 +m2)/2.0;
        }
    }
}
