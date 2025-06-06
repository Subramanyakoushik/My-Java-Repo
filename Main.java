public class Main{
  public static void main(String[]args){
    Linkedlist list = new Linkedlist();
    list.insertEnd(6);
     list.insertEnd(5);
      list.insertEnd(3);
       list.insertEnd(4);
       list.insertEnd(2);
        list.insertBefore(1);
         list.insertBefore(0);
         list.insertAtPos(8,2);
         list.insertAtPos(50,4);
         list.delbefore();
         list.delbefore();
         list.delAfter();
        list.deleAtPos(2);
        System.out.println("the length of the linkedlist is : "+list.length());
       
    list.print();
}
}