public class Trees {
  public static void main(String[] args){
    int[] array = {1,2,3,-1,-1,-1,4,-1,5,-1,-1};
    Trees t = new Trees(array);
    t.Orders();
  }
  Node root;
  int index = -1;

  Trees(int[] arr){
    this.root = toBuildTree( arr);
  }
  
  public Node toBuildTree(int[] arr){
    index++;
    if(index >= arr.length){
      return null;
    }
    if(arr[index] == -1){
      return null;
    }
    Node newNode = new Node(arr[index]);
    newNode.left = toBuildTree(arr);
    newNode.right = toBuildTree(arr);
  return newNode;
  }
    public void Orders(){

      Node temp = this.root;
      System.out.println("The preorder is :");
      preOrderHelper(temp);
      System.out.println();
      System.out.println("The inorder is :");
      inOrderHelper(temp);
      System.out.println();
      System.out.println("the postorder is :");
      postOrderHelper(temp);
      System.out.println(height( temp));
    }
    public void preOrderHelper(Node temp){
      if(temp == null){
        return;}
        System.out.print(temp.data + " ");
        preOrderHelper(temp.left);
        preOrderHelper(temp.right);
    }
    public void inOrderHelper(Node temp){
      if(temp == null){
        return;      
      }
      inOrderHelper(temp.left);
      System.out.print(temp.data+" ");
      inOrderHelper(temp.right);
    }
    public void postOrderHelper(Node temp){
        if(temp == null){
          return;
        }
        postOrderHelper(temp.left);
        postOrderHelper(temp.right);
        System.out.print(temp.data+ " ");
    }
   
    public int height(Node temp){
    if(temp == null){
      return 0;}
      int lh = height(temp.left);
      int rh = height(temp.right);
      return Math.max(lh, rh) + 1;
    }
}
 class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
}


