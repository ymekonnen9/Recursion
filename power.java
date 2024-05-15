public class power {
    public static double Power(double x, int n){
        if(n==0){
            return 1;
        }else{
            return x*Power(x,n-1);
        }
    }
    
}
