public class BR005LeftView {
    public int gHt(TreeNode node,int height){
        if(node==null) return height;
        int leftMaHt=gHt(node.leftTreeNode,height+1);
        int rightHt=gHt(node.rightTreeNode,height+1);
        return Math.max(Math.max(leftHt,rightHt),height);
    }
}

