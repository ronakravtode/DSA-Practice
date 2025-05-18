public class kadanesubarray {
    public static void kadanesubarraymaxmin(int arr[]){
        int sum=0;
        int currentmax=0;
        int currentmin=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int ts=0;
        boolean allNegative=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                allNegative=false;
            }
            ts+=arr[i];
        }
        if(allNegative) {
            for(int i=0;i<arr.length;i++){
                maxsum=Math.max(maxsum,arr[i]);
                minsum=ts;
            }
        }
        else{
        for(int i=0;i<arr.length;i++){
            currentmax+=arr[i];
            if(currentmax<0) currentmax=0;
            if(currentmax>maxsum) maxsum=currentmax;

                currentmin+=arr[i];
                if(currentmin<0) currentmin=0;
                if(currentmin<minsum) minsum=currentmin;
            }
        }
        System.out.println(minsum);
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanesubarraymaxmin(arr);
    }
}
