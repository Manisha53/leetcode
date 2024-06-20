public class heightAndDiameter_BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int i=-1;

        public static Node buildTree(int[] nodes){
            i++;
            if(nodes[i]==-1) return null; //-1 means null in nodes array

            Node node = new Node(nodes[i]);
            node.data = nodes[i];
            node.left=buildTree(nodes);
            node.right=buildTree(nodes);

            return(node);

        }
    }

    // ---------------height of binary tree--------------

    public static int height(Node root){
        if(root == null) return 0;
        int lefth= height(root.left);
        int righth= height(root.right);

        int height = Math.max(lefth,righth)+1;
        return(height);
    }

    // ------------diameter of the binary tree O(n*n)

    public static int diameter(Node root){
        if(root == null) return(0);
        int d1=diameter(root.left);
        int d2=diameter(root.right);
        int d3=height(root.left)+height(root.right)+1;

        return(Math.max(Math.max(d1, d2), d3));
    }

    // ------------diameter of the binary tree O(n)

    static class TreeInfo{
        int ht;
        int dia;

        TreeInfo(int ht, int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }

    public static TreeInfo diam(Node root){
        if(root == null) return new TreeInfo(0,0);

        TreeInfo left = diam(root.left);
        TreeInfo right = diam(root.right);

        int myHeight = Math.max(left.ht, right.ht)+1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht+right.ht+1;

        int myDia = Math.max(Math.max(dia1,dia2), dia3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDia);

        return(myInfo);
    }

    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println(root.data);

        System.out.println("Height of the tree is: "+height(root));

        System.out.println("Diameter of the tree is: "+diameter(root));

        System.out.println("Diameter of the tree is: "+diam(root).dia);

    }
    
}
