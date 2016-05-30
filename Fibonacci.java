public class Fibonacci {
    public static void main(String[] args){
	int sum = 0;
	for(int i = 2; i < 4000000; i++){
	    if(fibonnaci(i)>=4000000)break;
	    sum += fibonnaci(i);
	    System.out.println(fibonnaci(i));
	}
	System.out.println("Sum of fibonnaci is = " + sum);
    }
    public static int fibonnaci(int n){
	if(n < 2){
	    return n;
	}else{
	    return fibonnaci(n - 1) + fibonnaci(n - 2);
	}
    }
}
