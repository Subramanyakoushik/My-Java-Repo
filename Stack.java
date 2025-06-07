public class Stack{
  public static void main(String[]args){
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println(s.pop());
    System.out.println(s.peek());
    s.print();


  }
  Node top;
  Stack(){
    this.top = null;
  }
  void push(int data){
    Node newNode = new Node(data);
    if(top == null){
      top = newNode;
      return;
    }
    newNode.next = top;
    top = newNode;
  }
  int pop(){
    if(top == null){
      return -1;
    }
    int removedEle = top.data;
    top = top.next;
    return removedEle;
  }
  int peek(){
    return top.data;
  }
  void print(){
    Node temp = top;
    while(temp != null){
      System.out.println("|"+temp.data+"|" );
      temp = temp.next;
    }
  }

  
}
