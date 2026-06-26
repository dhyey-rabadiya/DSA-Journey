package Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] freqArr = new int[101];
        int[] result = new int[nums.length];

        // Create a frequency array or hashmap to keep the count of the frequency of individual numbers
        for(int num : nums){
            freqArr[num]++;
        }

        // Now we need to find the sum of the array
        for(int i = 1; i < 101; i++){
            freqArr[i] += freqArr[i-1];
        }

        // Now we already have our answer in the frequency array, just neeed to loop throgh the nums array and store the ans into the result arr
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                result[i] = 0;
            }else{
                result[i] = freqArr[nums[i] - 1];
            }
        }

        return result;
    }
}
