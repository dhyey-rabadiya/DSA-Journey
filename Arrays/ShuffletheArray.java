package Arrays;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];

        int length = arr.length;
        int left = 0, right = n;

        for(int i=0; i<length; i+=2){
            arr[i] = nums[left];
            arr[i+1] = nums[right];
            left++;
            right++;
        }

        return arr;
    }
}
