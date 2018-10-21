package promod.datastructures.linkedlist;

/**
 * Created by pmanickam on 5/31/2018 at 4:24 PM
 */
public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
            }
    }

    public void printlist() {

        Node n = head;
        while(n!=null) {
            System.out.println("data "+ n.data + " ");
            n = n.next;
        }

    }
    public static void main(String args[]){

        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.head.next = second;
        second.next = third;
        linkedList.printlist();

    }
}
