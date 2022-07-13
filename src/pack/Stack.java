package pack;

public class Stack {

    private Node top;  //initialize top node
    private int size; //holds size of the Stack

    private class Node { //node class
        private int data; // holds data of the node
        private Node next; //holds address of the next node
        public Node (int data) { //node constructor
            this.data = data;
            this.next = null;
        }
    }

    public void push (int data) { //method to add node
        Node tempNode = new Node(data); //new node
        tempNode.next = top; //holds the next node
        top = tempNode; //makes new node the top node

        size++;
    }

    public int pop () throws Exception { //pop method
        if(isEmpty()) { //checks if the stack is empty
            throw new Exception("Stack is empty");
        }
        int result = top.data; //holds the first node's data
        top = top.next; //makes the next node in the list the fist node
        size--; //reduces size of the list
        return result;
    }

    public int peek() throws Exception { //peek method returns data of the first node
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return top.data;
    }

    public int size (){
        return size;
    } //returns size of Stack

    public boolean isEmpty() {
        return size == 0;
    } //returns true if the Stack size is 0

    public void showStack() { //method prints the whole Stack
        Node current = top;

        while(current != null) {
            System.out.println(current.data+" ");
            current = current.next;
        }
    }
}
