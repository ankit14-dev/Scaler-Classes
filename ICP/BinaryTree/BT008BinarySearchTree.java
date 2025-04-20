public class BT008BinarySearchTree {
    boolean search(TreeNode root,int k){
        if(root==null) return false;
        if(root.data==k) return true;
        if(root.data<k) return search(root.rightTreeNode, k);
        return search(root.leftTreeNode,k);
    }
    TreeNode insert(TreeNode node,int value){
        if(node==null){
            //create a new node
            TreeNode newnode=new TreeNode(value);
            return newnode;
        }
        if(node.data<value) {
            // insert into right side
            TreeNode n=insert(node.rightTreeNode, value);
            node.rightTreeNode=n;
            return node;
            
        }else{
            TreeNode x=insert(node.leftTreeNode, value);
            node.leftTreeNode=x;
            return node;
        }
        // Can we do it without using the extra chaining?
        // -> Yes we can i am thinking that we use two function 
    }
    boolean isLeafNode(TreeNode node){
        if(node.leftTreeNode==null && node.rightTreeNode==null) return true;
        else return false;
    }
    
    TreeNode deleteNode(TreeNode root,int val){
        if(root==null) return null;
        if(root.data==val){
            // Case I root is leaf Node
            if(isLeafNode(root))return null;
            // Case II root has 1 children
            if(root.rightTreeNode==null){
                return root.leftTreeNode;
            }
            if(root.leftTreeNode==null){
                return root.rightTreeNode;
            }
            // Case III node has both children
            else{
                int max=getMax(root.leftTreeNode);
                root.data=max;
                root.leftTreeNode=deleteNode(root.leftTreeNode, max);
            }
        }
        else if(root.data>val){
            TreeNode n=deleteNode(root.leftTreeNode, val);
            root.leftTreeNode=n;
        }
        else{
            root.rightTreeNode=deleteNode(root.rightTreeNode, val);
        }
        return root;
    }

    TreeNode delTreeNodeMyMethod(TreeNode root,int val){
        if(root==null) return null;
        if(root.data>val){
            TreeNode n=delTreeNodeMyMethod(root.leftTreeNode, val);
        }else if(root.data<val){
            TreeNode n=delTreeNodeMyMethod(root.rightTreeNode, val);
        }else{

        }
    }
    
    boolean searchNode(TreeNode root,TreeNode node){
        if(root==null) return false;
        if(root==node) return true;
        return searchNode(root.leftTreeNode, node)|| searchNode(root.rightTreeNode, node); 
    }
    TreeNode LCA(TreeNode root,TreeNode node1,TreeNode node2){
        if(root==null) return null;
        if(root==node1||root==node2) return root;
        TreeNode leftLCA=LCA(root.leftTreeNode, node1, node2);
        TreeNode rightLCA=LCA(root.rightTreeNode, node1, node2);
        if(leftLCA==null) return rightLCA;
        if(rightLCA==null) return leftLCA;
        return root;

         
        // if(searchNode(root.leftTreeNode, node1)){
        //     if(searchNode(root.rightTreeNode,node2)){
        //         return root;
        //     }
        //     if(searchNode(root.leftTreeNode, node2)){
        //         return root;
        //     }
        //     return LCA(root.leftTreeNode, node1, node2);
        // }
        // return LCA(root.rightTreeNode, node1, node2);
    }
    boolean isBST(TreeNode root){
        if(root==null) return false;
        // if(root.leftTreeNode!=null && root.rightTreeNode!=null){
        //     if(root.data>root.leftTreeNode.data && root.data<root.rightTreeNode.data){
        //         return isBST(root.leftTreeNode) && isBST(root.rightTreeNode);
        //     }
        //     else return false;
        // }if(root.leftTreeNode!=null){
        //     return isBST(root.leftTreeNode);
        // }if(root.rightTreeNode!=null)
        // return isBST(root.rightTreeNode);
        // return true;
   }
}
