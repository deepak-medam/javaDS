public class AddFirstLL {
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
    public static void main(String[] args) {
        AddFirstLL ll = new AddFirstLL();
        ll.addFirst(1);
        ll.addFirst(2);
    }
    
}
