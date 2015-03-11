
public class levelorder {

    public int getHeight(Node root){
     if(root==null)  return 0;
     else{
         int left = getHeight(root.left);
         int right=getHeight(root.right);
         if(left>right) return left+1;
         else return right + 1;
     }    
    }
    
    public void getLevel(Node root,int height){
        for(int i=1;i<=height;i++){
            PrintLevel(root,i);
        }
    }
    
    public void PrintLevel(Node root,int level){
        if(root==null)return;
        if(level==1)System.out.println(root.data + " ");
        PrintLevel(root.left,level-1);
        PrintLevel(root.right,level-1);
        }
    
    public Node makeTree(){
        Node x = new Node(5);
        x.left=new Node(3);
        x.left.left=new Node(2);
        x.left.right=new Node(4);
        x.right=new Node(7);
        x.right.left=new Node(6);
        x.right.right=new Node(8);
        return x;
    }
    
    public static void main(String[] args) {
        levelorder t = new levelorder();
        Node root = t.makeTree();
        int h = t.getHeight(root);
        t.getLevel(root, h);
    }
}