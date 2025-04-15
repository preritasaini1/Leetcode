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
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> res= new ArrayList<>();
        if(root ==null) return res;
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            double sum=0;
            // while(n!=0){   using while loop will change original value of n that's why use for loop!
            for(int i=0;i<n;i++){
                TreeNode t =q.poll();
                sum=sum+t.val;
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
        double avg=sum/n;
        res.add(avg);
        }
        return res;
    }
}