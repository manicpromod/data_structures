package promod.datastructures.linkedlist;

/**
 * Created by pmanickam on 6/4/2018 at 9:21 AM
 */
public class DeleteLinkedList {

    //Node creation for linkedlist
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    //delete a node
    void deleteNode(int key){

        Node temp = head;
        Node prev = null;
        if( temp!= null && temp.data == key) {

            head = temp.next;
            return;
        }
        while (temp!=null && temp.data!= key){

            prev = temp;
            temp = temp.next;
        }
        if( temp == null) return;

        prev.next = temp.next;

    }

    //Inserts the new data at the front
    public void push(int new_data){

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }

    public void printList(){

        Node tnode = head;
        while(tnode!=null){

            System.out.println(tnode.data+ " ");
            tnode = tnode.next;
        }

    }

    public static void main(String[] args) {

        DeleteLinkedList linkedList = new DeleteLinkedList();
        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);
        linkedList.push(40);
        System.out.println("List before deletion");
        linkedList.printList();
        linkedList.deleteNode(20);
        System.out.println("List after deletion");
        linkedList.printList();

    }

}

