
public class PrintLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step 1 = create a new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 = newNode next = head
        newNode.next = head; // link

        // step 3 = newNode = head
        head = newNode;
    }

    public void addLast(int data) {
        // step 1 = create a new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 tail point to new node
        tail.next = newNode;

        // step 3 = newNode = tail
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        PrintLL ll = new PrintLL();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
    }
}