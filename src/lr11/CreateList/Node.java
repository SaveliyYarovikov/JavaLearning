package lr11.CreateList;

public class Node {
    public int value;
    public Node next;

    Node(int value, Node next){
        this.next = next;
        this.value = value;
    }
}
