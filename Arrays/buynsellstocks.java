public class buynsellstocks {
    public static int maxProfit(int arr[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice<arr[i]){
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else buyPrice=arr[i];
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
