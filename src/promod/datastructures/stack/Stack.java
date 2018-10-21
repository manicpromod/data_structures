package promod.datastructures.stack;

/**
 * Created by pmanickam on 5/29/2018 at 3:24 PM
 */
public class Stack {
    static final int max =10;
    int top;
    int a[] = new int[max];

    boolean isEmpty(){
        return (top < 0);
    }

    boolean push(int x) {
        if( top > max) {

            return false;
        }
        else {

            a[++top] = x;
            System.out.println("Push method ");
            return true;

        }
    }

    int pop(){

        if( top < 0) {

            return 0;
        }

        else {

            int x = a[top--];
            System.out.println("Pop method ");
            return x;
        }
    }
}

class StackInvoke {

    public static void main(String args[]){

        Stack s = new Stack();
        s.push(10);
        s.push(150);
        System.out.println("Poped up the value " + s.pop());
     }
  }
