public class RemoveLast {
    // Static Variables
    public static Node head;
    public static Node tail;
    public static int size;

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add Node to the First
    public void addFirst(int data) {
        // step 1 = create a new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 = newNode next = head
        newNode.next = head; // link

        // step 3 = newNode = head
        head = newNode;
    }

    // Add Node to the last
    public void addLast(int data) {
        // step 1 = create a new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 tail point to new node
        tail.next = newNode;

        // step 3 = newNode = tail
        tail = newNode;
    }

    // Add Node in the middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // Print Linked List
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

    // Remove Node from First
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Node from last
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Main
    public static void main(String args[]) {
        // Create a Linked list
        RemoveLast ll = new RemoveLast();

        // Add first nodes
        ll.addFirst(2);
        ll.addFirst(1);

        // Add last nodes
        ll.addLast(4);
        ll.addLast(5);

        // Add node in the middle
        ll.add(2, 3);

        // Print LL
        ll.print();

        // Remove First Node
        ll.removeFirst();
        ll.print();

        // Remove last Node
        ll.removeLast();
        ll.print();
        System.out.println(size);
    }

}