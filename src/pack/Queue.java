package pack;

public class Queue<T> { //creates generic class Queue
    private Node<T> front; //first and last nodes declared
    private Node<T> rear;

    private int length; //holds length of queue

    private static class Node<T> { //creates node class
        private final T data; //holds node data
        private Node<T> next; //holds next node
        public Node(T data) { //node constructor
            super();
            this.data = data;
            this.next = null;
        }
    }

    public void insert(T data) { //inserts node into queue
        if(front == null) { //front and rear node are the same if the queue was empty
            rear = new Node<T>(data);
            front = rear;
        }
        else {
            rear.next = new Node<T>(data); //last item hold the new node
            rear = rear.next; //new node becomes rear node
        }
        length++; //increments the length
    }

    public T remove() throws Exception { //removes an item from the Queue and returns the node.data and decrements the length
        if(front != null) {
            T result = front.data;
            front = front.next;
            length--;
            return result;
        }
        else {
            throw new Exception("Queue is empty");
        }
    }

    public int size() {
        return length;
    } //returns size of the queue

    public void showQueue() { //prints all data in queue
        Node<T> current = front;

        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}
