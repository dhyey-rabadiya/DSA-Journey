package Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        // Iterating the accounts loop
        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            // Iterating the individual accounts
            for(int col = 0; col < accounts[row].length; col++){
                // Calculating the richness
                sum+= accounts[row][col];
            }

            // Checking with the max value and updating the richest customer
            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}
