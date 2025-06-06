public class Linkedlist {
  Node head;

  Linkedlist() {
    this.head = null;
  }
  public void insertBefore(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      newNode = head;
    } else {
      newNode.next = head;
      head = newNode;
    }

  }
    void insertEnd(int data) {
    Node newNode = new Node(data);
    Node temp = head;
    if (head == null) {
     head = newNode;
     return;
    }
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
    public void insertAtPos(int data,int pos){
      Node newNode = new Node(data);
      Node temp = head;
      for(int i = 1;i < pos;i ++){
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
   }
   public void delbefore(){
    head = head.next;
   }
   public int length(){
    int length_ = 0;
    Node temp = head;
    while(temp != null){
      length_ ++;
      temp = temp.next;
    }
    return length_;
   }
   public void deleAtPos(int pos){
    Node temp = head;
    for(int i = 1;i < pos;i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
   }
    public void delAfter(){
      Node temp = head;
      while(temp.next.next != null){
        temp = temp.next;
      }
      int removedele = temp.next.data;
      temp.next = null;
      System.out.println("the removed node is : " + removedele);
      
    }
    public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

}
