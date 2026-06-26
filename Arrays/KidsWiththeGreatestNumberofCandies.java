package Arrays;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        List<Boolean> list = new ArrayList<>();

        // Checking for the max candies in the array
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        // Checking for the which kid has the max candies
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}
