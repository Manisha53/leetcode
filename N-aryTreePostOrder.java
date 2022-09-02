/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root == null ) return res;
        post(root,res);
        return res;
    }
    public void post(Node root,List<Integer> res){
        if(root==null) return;
        
        for(Node child : root.children){
            post(child,res);
        }
        res.add(root.val);
        
    }
}
/*
09/02/2022 22:44	Accepted	2 ms	46.3 MB	java
*/
//------------------------sol2--------------------------------------
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> res=new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        
        if(root==null) return res;
        
        for(Node child : root.children) postorder(child);
        res.add(root.val);
        
        return res;
    }
   
}

//09/02/2022 22:53	Accepted	0 ms	43.4 MB	java
