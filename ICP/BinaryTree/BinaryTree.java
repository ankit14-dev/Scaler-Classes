class TreeNode{
    int data;
    TreeNode leftTreeNode;
    TreeNode rightTreeNode;
    TreeNode(int data){
        this.data=data;
        this.leftTreeNode=null;
        this.rightTreeNode=null;
    }
}
public class BinaryTree{
    TreeNode root;
    void addLeft(int data){
        this.root.leftTreeNode=new TreeNode(data);
    }
    void addRight(int data){
        this.root.rightTreeNode=new TreeNode(data);
    }
    void preOrderTraversal(TreeNode node){
        if(node==null) return;
        System.out.println(node.data);
        preOrderTraversal(node.leftTreeNode);
        preOrderTraversal(node.rightTreeNode);
    }
    void inOrderTraversal(TreeNode node){
        if(node==null) return;
        preOrderTraversal(node.leftTreeNode);
        System.out.println(node.data);
        preOrderTraversal(node.rightTreeNode);
    }
    void postOrderTraversal(TreeNode node){
        if(node==null) return;
        preOrderTraversal(node.leftTreeNode);
        preOrderTraversal(node.rightTreeNode);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.preOrderTraversal(bt.root);
    }
}