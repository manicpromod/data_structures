package promod.datastructures.linkedlist;

/**
 * Created by pmanickam on 6/1/2018 at 1:26 PM
 */
public class CircularLinkedList {

    public int size = 0;
    public Node head = null;
    public Node tail = null;

    class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next= null;
        }
    }

    //add a new node at the beginning of the linked list
    public void addNodeStart(int data){
        Node  n = new Node(data);
        if(size==0){
            head = n;
            tail = n;
            n.next = head;
        } else {
            Node temp = head;
            n.next = temp;
            head = n;
        }
    }

    public void printLinkedlist(){

        Node temp = head;
       do {

            System.out.println(temp.data);
            temp = temp.next;
        }while(temp!=head);
    }
    public static void main(String[] args){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addNodeStart(10);
        circularLinkedList.addNodeStart(20);
        circularLinkedList.addNodeStart(30);
        circularLinkedList.addNodeStart(40);
        circularLinkedList.printLinkedlist();


    }


}
