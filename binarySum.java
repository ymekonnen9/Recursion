public class binarySum {

    public static int binarysum(int [] data, int low, int high){
        if(low>high){
            return 0;
        }else if(low == high){
            return data[low];
        }else{
            int mid = (low+high)/2;
            return binarysum(data, low, mid) + binarysum(data, mid+1, high); 
        }
    }
    
}
