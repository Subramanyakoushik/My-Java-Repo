public class Stacks {
  public static void main(String[]args){
      Stacks s = new Stacks(6);
      s.push(0);
      s.push(1);
      s.push(3);
      s.push(4);
      s.push(5);
      s.display();
      System.out.println("********");
      s.pop();
       s.display();
       System.out.println("The data "+s.peek()+" is at peek");
      s.isEmpty();
      s.isFull();
  }
  int top;
  int[] stack;
  int size;
  Stacks(int size){
    this.top = -1;
    this.size = size;
    stack = new int[size];
  }
  void isEmpty(){
    if(top == -1){
      System.out.println("The stack is empty");
    }
    else{
     System.out.println("Stack is Not empty");
    }
  }
  void isFull(){
    if(top == size - 1){
      System.out.println("The stack is full");
    }
  }
  void push(int data){
    if(top == size - 1){
      System.out.println("The stack is full");
      return;
    }
   stack[++top] = data;
  }
  void pop(){
    if(top == -1){
      System.out.println("No scope to pop");
      return;
    }
    int var = stack[top];
    stack[top--] = top;
    System.out.println("The data "+var+" is no more");
  }
  int peek(){
    return stack[top];
  }
  void display(){
    for(int i = 0;i <=top;i++){
      System.out.println( "|"+stack[i]+"|");
    }
  }
}

