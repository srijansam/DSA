class Solution{
    public int mVa(TreeNode root){
        int mV=root.val;
        while(root.left!=null){
            mV=root.left.val;
            root=root.left;
        }
        return mV;
    }
    public TreeNode deleteNode(TreeNode root,int key){
        if (root==null){
            return null; 
        }
        if (key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if (key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else {
            if (root.left==null){
                return root.right;
            } 
            else if (root.right==null){
                return root.left;
            }
            root.val=mVa(root.right);
            root.right=deleteNode(root.right, root.val);
            }
        return root;
    }
}
