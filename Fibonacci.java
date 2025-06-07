public class Fibonacci {
  public static void main(String[]args){
    Fibonacci f = new Fibonacci();
    System.out.println(f.fib(6));
  }
  public  int fib(int data){
    if(data == 1 ||data == 0){
      return data;
    }
    System.out.println("hello");
    return fib(data - 1)+fib(data - 2);
    }
}
