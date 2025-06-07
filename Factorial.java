public class Factorial {
  public static void main(String[]args){
    Factorial f = new Factorial();
    System.out.println(f.fact(5));
  }
  public int fact(int data){
    if(data == 1) return 1;
  return data * fact(data - 1);
}
}
