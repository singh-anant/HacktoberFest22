// Problem Statement:-https://leetcode.com/problems/binary-tree-postorder-traversal/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
               
        if(root==null) return res;
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();        
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode n=st1.pop();
            st2.push(n);
            if(n.left!=null)
            st1.push(n.left);
            if(n.right!=null)
            st1.push(n.right);
        }
        while(!st2.isEmpty())
        {
            res.add(st2.pop().val);
        }
        return res;        
    }   
    
}