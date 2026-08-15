public class SellStock
{
    public static void buy_sell_stock(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int profit=0;
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);

            }
            else
            {
                buyPrice=prices[i];
            }
        }
        System.out.println("Max Profit:"+ maxProfit);
    }
    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
        buy_sell_stock(prices);

    }
    
}
