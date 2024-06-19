import java.util.*;

public class levelOrder_BT {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int i = -1;
        public static Node buildTree(int[] nodes){
            i++;
            if(nodes[i]== -1) return null;

            Node node = new Node(nodes[i]);
            node.data = nodes[i];
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return(node);
        } 
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(! q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(!q.isEmpty()){ //level breaker null encountered
                    q.add(null);
                } else{          //end of queue null encountered
                    break;
                }
            } else{
                System.out.print(curNode.data+" ");
                if(curNode.left!=null) q.add(curNode.left);
                if(curNode.right!=null)  q.add(curNode.right);
               
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println("root= "+root.data);

        levelOrder(root);

    }
    
}
