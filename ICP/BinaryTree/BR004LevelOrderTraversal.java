import java.util.ArrayList;

public class BR004LevelOrderTraversal {
    public void levelorderTraversal(TreeNode node) {
        {
            ArrayList<ArrayList<Integer>> al = new ArrayList<>();
            



        }

    }

    public int gHt(TreeNode node, int height,ArrayList<ArrayList<Integer>> al) {
        if (node == null)
            return height;
        ArrayList<Integer> a=al.get(height);
        a.add(node.data);
        al.add(height,a);
        int leftHt = gHt( node.leftTreeNode, height + 1,al);
        int rightHt = gHt(node.rightTreeNode, height + 1,al);
        return Math.max(Math.max(leftHt, rightHt), height);
    }
}
