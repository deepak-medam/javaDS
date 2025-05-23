public class PrintLL {
    public static class Node{
        int data; 
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // Step1 create New Node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step2 newNode next = head
        newNode.next = head; // link

        // Step3 Head = new Node
        head = newNode;
    }

    public void addLast(int data){
        // Step1 Create a new Node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        // step2 point tail next to newNode
        tail.next = newNode;

        // step3 make newNode tail
        tail = newNode;
    }
    
    public void printLL(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        PrintLL ll = new PrintLL();
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
    }
    
}
