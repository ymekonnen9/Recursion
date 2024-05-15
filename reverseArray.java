public class reverseArray {

    public static void reversArray(int [] data,int low,int high){
        if(low<high){
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reversArray(data, low + 1, high-1);
        }
    }
    
}
