package promod.datastructures.tree;

/**
 * Created by pmanickam on 6/12/2018 at 9:43 AM
 */
public class DeleteBinaryTree {

    Node root;
    Node temp = root;
    class Node {
        int key;
        Node left,right;

        Node(int key){
            this.key = key;
            this.left = null;;
            this.right = null;;
        }
    }

    //Inorder traversal of binary tree
    public void inOrder(Node temp) {
        if (temp == null) {
            return;
        }
        inOrder(temp.left);
        System.out.println("Print the center data " + temp.key);
        inOrder(temp.right);
    }

    //insert a data
    public Node insert(int newKey){
        if(temp==null){
            return new Node(newKey);
        }
        if(newKey<temp.key){
            temp.left = insert(newKey);
        }
        else if(newKey>temp.key) {
            temp.right = insert(newKey);

        } else
            return temp;
        return temp;
    }

    public void add(int value){
        root = insert(value);
    }

    public static void main(String[] args){

        System.out.println("Invoking the traversal method");
        DeleteBinaryTree deleteBinaryTree = new DeleteBinaryTree();
        deleteBinaryTree.add(10);
        deleteBinaryTree.add(20);
        deleteBinaryTree.add(30);
        deleteBinaryTree.inOrder(deleteBinaryTree.root);

    }
}
