public class BR003GetHeight {
    public int getHeight(TreeNode bTreeNode){
        if(bTreeNode==null) return 0;
        int leftHt=getHeight(bTreeNode.leftTreeNode);
        int rightHt=getHeight(bTreeNode.rightTreeNode);
        return Math.max(leftHt,rightHt)+1;
    }
    public int gHt(TreeNode node,int height){
        if(node==null) return height;
        int leftHt=gHt(node.leftTreeNode,height+1);
        int rightHt=gHt(node.rightTreeNode,height+1);
        return Math.max(Math.max(leftHt,rightHt),height);
    }
}
