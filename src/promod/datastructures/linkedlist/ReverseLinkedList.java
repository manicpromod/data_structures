package promod.datastructures.linkedlist;

/**
 * Created by pmanickam on 6/5/2018 at 2:20 PM
 */
public class ReverseLinkedList {

    class Node {

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

    void printLinkedList(){

        Node temp = head;
        while(temp!=null){

            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    void push(int data){

        Node current = new Node(data);
        current.next = head;
        head =current;

    }

    void reverse(int data){
        
    }

    public static void main(String[] args){

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.push(10);
        reverseLinkedList.push(20);
        reverseLinkedList.printLinkedList();

    }
}
