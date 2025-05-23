public class ReverseLL {      
    // Static Node class
    public static class Node{
        int data; 
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail variables
    public static Node head;
    public static Node tail;
    public static int size;

    // Add First Method
    public void addFirst(int data){
        // Step1 create New Node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step2 newNode next = head
        newNode.next = head; // link

        // Step3 Head = new Node
        head = newNode;
    }

    // Add Last Method
    public void addLast(int data){
        // Step1 Create a new Node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        // step2 point tail next to newNode
        tail.next = newNode;

        // step3 make newNode tail
        tail = newNode;
    }
    
    // Add in the middle
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode =  new Node(data);
        size++;

        Node temp = head;
        int i =0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    // Reverse
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next = head.next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    // Print Linked List
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
        ReverseLL ll = new ReverseLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        
        ll.printLL();
        ll.reverse();
        ll.printLL();
    }
    
}
