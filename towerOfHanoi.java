public class towerOfHanoi {

    public static void move(int n, String A, String B, String C){
        if(n == 1){
            System.out.println("move " + A + " to " + C);
        }else{
            move(n-1,A,C,B);
            System.out.println("move " + A + " to " + C);
            move(n-1, B,A,C);
        }
    }
    
    public static void main(String[] args){
         move(3,"A", "B", "C");
    }
    
}
