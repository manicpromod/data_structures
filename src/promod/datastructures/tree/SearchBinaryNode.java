package promod.datastructures.tree;

/**
 * Created by pmanickam on 6/15/2018 at 11:29 AM
 */
public class SearchBinaryNode {
    class Node {
        int key;
        Node left,right;
        Node(int data){
            this.key = data;
            left = right = null;
        }
    }
    Node head;
    Node temp = head;
    public Node insertBinaryTree(int data){
        if(temp==null) {

            return new Node(data);
        }
        if(temp.left.key<data){
            temp.left = insertBinaryTree(data);

        } else if(temp.left.key>data) {
            temp.right = insertBinaryTree(data);
        }


          return temp;
    }

    public void addValue(int value){
        head = insertBinaryTree(value);
    }

    public void transverseBinaryTree(Node temp){
        if(temp == null )
            return;

        transverseBinaryTree(temp.left);
        System.out.println(temp.key);
        transverseBinaryTree(temp.right);

    }
    public static void main(String[] args){

        SearchBinaryNode sbn = new SearchBinaryNode();
        sbn.addValue(10);
        sbn.addValue(20);
        sbn.addValue(30);
        sbn.addValue(40);

        sbn.transverseBinaryTree(sbn.head);
    }
}
