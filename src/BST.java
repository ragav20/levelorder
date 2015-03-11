public class BST{
    int arr[] = {1,2,5,4,6,7,9};
    public Node insert(int data){
        Node root=null;
        root=makeBST(root,data);
    return root;
    }
    public Node makeBST(Node root,int data){
        //for (int i=0;i<arr.length;i++)
        {
        if(root == null){
          root = new Node(data);
          }
        else {
            if(data>=root.data){
                if(root.right==null) root.right=new Node(data);
              //  else makeBST(root.right);
            }
            else if(data<root.data){
                if(root.left==null) root.left = new Node(data);
                //else makeBST(root.left);
            }
        }
        }
        return root;
      }
    
    public void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
    
    public static void main(String[] args) {
   BST t = new BST();
   Node root =null;
  for(int i=0;i<t.arr.length;i++ ){
   root=  t.insert(t.arr[i]);
  }
  Node x = t.maketree2();
 
   t.inorder(x);
   t.kSmall(x);
}
 int index=0;
    int number=6;
    public void kSmall(Node root){
       if (root==null)return;
       if(root.left!=null){
        kSmall(root.left);   
       } 
       ++index;
        
        if(index==number) System.out.println("Kth smallest element is : " + root.data);
    if(root.right!=null)
        kSmall(root.right);
        
        
    }
    
    public Node maketree2()
    {
        Node x = new Node(5);
        x.left=new Node(3);
        x.left.left=new Node(2);
        x.left.right=new Node(4);
        x.right=new Node(7);
        x.right.left=new Node(6);
        x.right.right=new Node(8);
        return x;
    }    
}

