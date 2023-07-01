class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
            }else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k]=nums1[i];
                i++;
                k++;
        }
        while(j<n){
            arr[k]=nums2[j];
                j++;
                k++;
        }
        for(int h=0;h<arr.length;h++){
            nums1[h]=arr[h];
        }
    }
}
