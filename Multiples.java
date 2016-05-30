public class Multiples{
    public static void main(String[] args){
	int[] x = new int[1000];
	int sum = 0;
	for(int i = 1; i < 1000; i++){
	    x[i] = i;
	    //System.out.println(x[i]);
	    if((x[i]%3 == 0)||(x[i]%5==0)){
		sum += x[i];
	    }
	}
	System.out.println("The sum is = " + sum);
    }
}
