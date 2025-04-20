class TreeNode {
    int data;
    TreeNode leftTreeNode;
    TreeNode rightTreeNode;

    TreeNode(int data) {
        this.data = data;
        this.leftTreeNode = null;
        this.rightTreeNode = null;
    }
}

public class BT001IsEqual {
    public boolean solve(TreeNode bt1, TreeNode bt2) {
        if(bt1==null && bt2==null) return true;
        if(bt1==null && bt2!=null) return false;
        if (bt1.data != bt2.data)
            return false;

        return solve(bt1.leftTreeNode, bt2.leftTreeNode) && solve(bt1.rightTreeNode, bt2.rightTreeNode);

    }
}
