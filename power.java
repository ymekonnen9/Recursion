public class power {
    public static double Power(double x, int n){
        if(n==0){
            return 1;
        }else{
            double partial = Power(x, n/2);
            double result = partial * partial;
            if(n%2 == 1){
                return x*result;
            }
            return result;
        }
    }
    
}
