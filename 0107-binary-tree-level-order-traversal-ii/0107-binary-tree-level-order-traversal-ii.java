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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();

        q.add(root);
        if(root==null) return res;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            while(n!=0){
                TreeNode t=q.poll();
                l.add(t.val);
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                n--;
            }
            res.add(l);
        }
        Collections.reverse(res);
        return res;
    }
}