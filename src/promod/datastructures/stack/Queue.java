package promod.datastructures.stack;

/**
 * Created by pmanickam on 5/29/2018 at 4:30 PM
 */
public class Queue {
    int front, rear, size;
    int capacity;
    int array[];

    Queue(int capacity){

        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity-1;
        array = new int[this.capacity];
    }

    boolean isFull(Queue queue){

        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue){

        return (queue.size==0);
    }

    void enqueue(int item){

        if(isFull(this))
            return;
        this.rear = (this.rear + 1)% this.capacity;
        this.array[this.rear] = item;


    }

    int dequeue(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }

        int item = this.array[this.front];
        this.front = (this.front + 1)% this.capacity;
        this.size = this.size - 1;
        return item;

    }

    int front() {

        if( isEmpty(this))
            return 0;

        return this.array[this.front];
    }

    int rear() {

        if( isEmpty(this))
            return 1;

        return this.array[this.rear];
    }


}

class QueueInvoke {


    public static void main(String args[]){
        Queue queue = new Queue(100);
        queue.enqueue(10);
        queue.enqueue(20);
      //  queue.dequeue();
        System.out.println("Rear Value "  + queue.rear());
        System.out.println("Front Data " + queue.front());
    }


}