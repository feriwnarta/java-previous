package strukturdata.linked;

public class Node {
    public int data;
    public Node next;

    @Override
    public String toString() {
        String result = Integer.toString(data);
        while(next != null) {
            result = result + " " + Integer.toString(next.data);
            next = next.next;
        }
        return result;
    }
}
