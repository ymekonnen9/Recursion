public class Factorial {
    public static int factorial(int x) throws IllegalArgumentException{
        if(x<0){
            throw new IllegalArgumentException("Invalid number");
        }else if(x==0){
            return 1;
        }else{
            return x * factorial(x-1);
        }
    }
}
