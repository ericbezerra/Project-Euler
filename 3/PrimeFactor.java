public class PrimeFactor{

  public static void main(String[] args){
    long n = Long.parseLong(args[0]);
    if(n == 0){
      System.out.println("Insira um valor valido");
      System.exit(1);
    }
    factor(n);
  }

  public static void factor(long n){
    long value = n;
    int index = 0;
    int divisor = 2;
    long []factors = new long[2000000];

    do{
      if(n % divisor == 0){
        factors[index] = n / divisor;
	System.out.println("Divisores primos: " + divisor);
	n = factors[index];
        index++;
      }else{
        divisor++;
      }
    }while(n != 1);

    System.out.println(value);

    for(int i = 0; i < factors.length; i++){
      if(factors[i] != 0)System.out.println(factors[i]);
    }
  }

}
