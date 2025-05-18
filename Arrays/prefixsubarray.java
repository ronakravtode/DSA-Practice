public class prefixsubarray {
    public static void sub(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                sum= i==0? prefix[j]:prefix[j]-prefix[i-1];                                
                if(sum>max) max=sum;
                if(sum<min) min=sum;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        sub(arr);
    }
}