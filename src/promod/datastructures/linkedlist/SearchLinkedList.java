package promod.datastructures.linkedlist;

/**
 * Created by pmanickam on 6/4/2018 at 1:12 PM
 */
public class SearchLinkedList {

    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
    }

    public void printList(){

    }
}
