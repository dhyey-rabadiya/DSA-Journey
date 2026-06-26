package Arrays;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        // hash-map to store the frequency of the numbers
        int[] counts = new int[101];

        for(int num : nums){
            // Here we are getting the frequency of the already visited number to find the good pairs
            // If not found then zero will be returned
            goodPairs += counts[num];

            // Here we are updating the hashmap
            // for instance we come across the very first element which is 1, so it will go to the 1th index and put the value 1 and so on increment
            // it as the number appears again in the array
            counts[num]++;
        }

        return goodPairs;
    }
}
