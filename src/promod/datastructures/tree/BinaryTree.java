package promod.datastructures.tree;

/**
 * Created by pmanickam on 6/1/2018 at 11:00 AM
 */
public class BinaryTree {

    Node root;

    static class Node {

        int key;
        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    BinaryTree(int key){
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    public static void main(String args[]){

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(10);
        binaryTree.root.left = new Node(20);
        binaryTree.root.right = new Node(30);

    }
}
