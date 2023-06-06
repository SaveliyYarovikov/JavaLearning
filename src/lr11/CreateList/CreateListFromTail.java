package lr11.CreateList;

public class CreateListFromTail {
    public static void main(String[] args) {
        Node tail = null;
        for (int i = 0; i <= 9; i++){
            tail = new Node(i, tail);
        }
        Node ref = tail;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
