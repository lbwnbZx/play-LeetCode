class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int price : prices) {
            if(price > min) {
                maxValue = Math.max(maxValue, price - min);
            } else {
                min = price;
            }
        }
        return maxValue;
    }
}