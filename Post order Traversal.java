class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList <Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
    public void traversal(TreeNode root, ArrayList<Integer> postlist){
        if(root == null){
            return;
        }
        traversal(root.left, postlist);
        traversal(root.right, postlist);
        postlist.add(root.val);
    }
}
