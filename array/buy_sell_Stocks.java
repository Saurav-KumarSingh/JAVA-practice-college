/*Q. -> You are given an array prices where prices[i] is the price of a given stock on the ith day.
        Return the maximum profit you can achieve from this transaction. If you cannot
        achieve any profit, return 0. */

package array;

public class buy_sell_Stocks {
    public static int profit(int price[]){
        int maxProfit=0,buyPrice=Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            int sellPrice=price[i];
            if(buyPrice<sellPrice){
                int Profit=sellPrice-buyPrice;
                maxProfit=Math.max(maxProfit, Profit);
            }
            else{buyPrice=sellPrice;}
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
       System.out.println("Maximum Profit : "+profit(price));

    }
}
