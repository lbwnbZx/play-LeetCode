//用一个变量记录历史最低点，相当于我们在这天买了股票，然后之后每一天都判断今天能卖出多少钱
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int price:prices){
            if(price > min){
                profit = Math.max(profit,price-min);
            }else{
                min = price;
            }
        }
        return profit;
    }
}
