public class countInBinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int i = -1;

        public static Node buildTree(int[] nodes){
            i++;
            if(nodes[i] == -1) return(null);
            
            Node node = new Node(nodes[i]);
            node.data = nodes[i];
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);

            return(node);
        }
    }
// -----------count the no. of nodes in tree----------------


    public static int countNodes(Node root){
        if(root == null) return 0;

        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);

        return 1+leftNodes+rightNodes;
    } 

    // ---------sum of all the nodes in tree ------------------------

    public static int sumNodes(Node root){
        
        if(root == null) return 0;

            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);

        return leftSum+rightSum+root.data;
    }     

    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println(root.data);

        System.out.println("The number of nodes is: "+ countNodes(root));

        System.out.println("The Sum of nodes is: "+ sumNodes(root));


    }
    
}
