//https://leetcode.com/problems/merge-sorted-array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, index = 0;
        int[] arr = new int[m+n];
        
        while(i<m && j<n) {
            if(nums1[i]<=nums2[j]) arr[index++] = nums1[i++];
            else arr[index++] = nums2[j++];
        }
        
        while(i<m) {
            arr[index++] = nums1[i++];
        }
        
        while(j<n) {
            arr[index++] = nums2[j++];
        }
        
        for(int k=0; k<m+n; k++) {
            nums1[k] = arr[k];
        }
    }
}