package pack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack(); //created new Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        for (int i =0; i < 4; i++) { //pops 4 nodes
            try {
                stack.pop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        stack.showStack(); //prints all nodes remaining in the Stack
    }
}
