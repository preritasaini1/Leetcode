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
    int dia=0;  //global variable 
    public int dia(TreeNode root){  //not static !
        if(root ==null) return 0;
        int l=dia(root.left);
        int r=dia(root.right);
        dia=Math.max(dia,l+r);

        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dia(root);
        return dia;
    }
}