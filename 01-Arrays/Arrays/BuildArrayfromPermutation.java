package Arrays;

class BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) {
        
        int n = nums.length;

        for(int i=0; i<n; i++){
            // To reduce any number that becomes greater than n
            int b = nums[nums[i]] % n;

            nums[i] = nums[i] + (b*n);
        }

        for(int i=0; i<n; i++){
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}