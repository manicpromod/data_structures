package promod.datastructures.linkedlist;

/**
 * Created by pmanickam on 6/6/2018 at 11:18 AM
 */
public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

        void push(int data){
            Node new_node = new Node(data);
            new_node.next = head;
            new_node.prev = null;
            if(head!=null) {
                head.prev = new_node;
            }
            head = new_node;
        }

        public void insertAfter(Node prevNode, int data ){

            if(prevNode==null) return ;

            Node new_Node = new Node(data);
            new_Node.next = prevNode.next;
            prevNode.next = new_Node;
            new_Node.prev = prevNode;

            if(new_Node.next!=null) {
                new_Node.next.prev = new_Node;
            }
        }

        public void append(int data){

            Node temp_Node = head;

            if(temp_Node==null) return;

            while(temp_Node.next!=null){

                temp_Node = temp_Node.next;

            }

            Node newNode = new Node(data);
            temp_Node.next = newNode;
            newNode.prev = temp_Node;
        }

        public void printList(Node node){

            Node last = null;
            System.out.println("Traversing in the forward Direction ");
            while(node!=null){

                System.out.println(node.data + " ");
                last = node;
                node = node.next;
            }

            System.out.println("Traversing through reverse directions ");
            while(last!=null){

                System.out.println( last.data);
                last = last.prev;

            }
        }

    public static void main(String[] args){

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.push(40);
        doublyLinkedList.push(20);
        doublyLinkedList.push(10);
        System.out.println("Printing the list before additions");
        doublyLinkedList.printList(doublyLinkedList.head);
        doublyLinkedList.insertAfter(doublyLinkedList.head.next,30);
        doublyLinkedList.append(50);
        System.out.println("Printing the list after additions");
        doublyLinkedList.printList(doublyLinkedList.head);



    }
}
