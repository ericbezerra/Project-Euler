public class Fibonacci{
  public static void main(String[]args){
    int limit = 4000000;
    fibo(limit);
  }
  public static void fibo(int limit){
    int x = 0;
    int y = 1;
    int z = 0;
    int sum = 0;

    System.out.println(x);
    System.out.println(y);

    do{
      z = x + y;
      x = y;
      y = z;
      if(y % 2 == 0) sum += y;
      System.out.println(z);
    }while(y <= limit);
    System.out.println("Fibonacci sum = " + sum);
  }
}
