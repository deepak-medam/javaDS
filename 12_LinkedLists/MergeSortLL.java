public class MergeSortLL {

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

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;   
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // To find mid
        Node mid = getMid(head);

        // left and right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);

        // merge
    }
    public static void main(String args[]){
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.addFirst(5);

        ll.printLL();
        ll.head = ll.mergeSort(ll.head);
        ll.printLL();
    }
    
}
