class TreeNode {
    int data;
    TreeNode leftTreeNode;
    TreeNode rightTreeNode;

    TreeNode(int data) {
        this.data = data;
        this.leftTreeNode = null;
        this.rightTreeNode = null;
    }
    void fill(int left,int right){
        this.leftTreeNode=new TreeNode(left);
        this.rightTreeNode=new TreeNode(right);
    }
}
public class BR002MirrorImage {
    public static boolean solve(TreeNode bt1, TreeNode bt2) {
        if(bt1==null && bt2==null) return true;
        if(bt1==null && bt2!=null) return false;
        if (bt1.data != bt2.data)
            return false;

        return solve(bt1.leftTreeNode, bt2.rightTreeNode) && solve(bt1.rightTreeNode, bt2.leftTreeNode);

    }
    public static void main(String[] args) {
        TreeNode tn1=new TreeNode(11);
        TreeNode tn2=new TreeNode(11);

        tn1.fill(6, 15);
        tn2.fill(15, 6);
        System.out.println(solve(tn1, tn2));



    } 
}

