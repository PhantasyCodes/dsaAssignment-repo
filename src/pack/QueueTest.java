package pack;

public class QueueTest {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<>(); //creates new generic queue

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        for (int i = 0; i < 4; i++) { //dequeues 4 nodes from the stack
            System.out.println("Dequeued " + queue.remove());
        }
    }
}

//There is no need for overflow testing because a queue can have an infinite number of nodes


