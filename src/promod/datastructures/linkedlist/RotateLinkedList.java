package promod.datastructures.linkedlist;

/**
 * Created by pmanickam on 6/5/2018 at 9:21 AM
 */
public class RotateLinkedList {

    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp= temp.next;
        }
    }


    //Rotate the linked list
    void rotate(int key){

        if(key == 0) return;
        Node current = head;
        int count = 1;

        while(count<key && current!= null){
            current = current.next;
            count++;
        }

        if( current == null) return;
        Node nthNode = current;
        while( current.next != null){
            current = current.next;

        }
        current.next = head;
        head = nthNode.next;
        nthNode.next = null;
    }
    void push(int data){

        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

    }

    public static void main(String[] args){

        RotateLinkedList firstNode = new RotateLinkedList();
        for( int i=60; i>=10;i=i-10 ) {

            firstNode.push(i);
        }
        System.out.println("Printing the list before the rotation");
        firstNode.printList();
        firstNode.rotate(4);
        System.out.println("Printing the list after the rotation");
        firstNode.printList();
    }
}
