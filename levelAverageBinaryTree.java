// ! Problem-Statement- https://leetcode.com/problems/average-of-levels-in-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if(root==null) return null;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            double sum=0;
            int numNodes=q.size();
            for(int i=0; i<numNodes; i++){
                TreeNode t=q.poll();
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
                sum+=t.val;
                
            }
            res.add(sum/numNodes);
        }
        return res;
    }
    
}