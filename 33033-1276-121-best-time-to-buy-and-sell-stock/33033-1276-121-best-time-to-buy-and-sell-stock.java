class Solution {
    public int maxProfit(int[] prices) {
        
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){

            minValue = Math.min(minValue , prices[i]);
            maxValue = Math.max(maxValue , prices[i] - minValue);

        }
        return maxValue;
    }
}