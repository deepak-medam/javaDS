# Linked Lists Notes

- Linked List is a linear type of data structure.
- In Linked list we connect one element to other element through a chain, This chain is called Link. That is why this data structure is called Linked List.
- The single element or node in Linked list have two parts, the first part holds data like integers, strings, etc. The second part holds the data about next(a reference or in simple language a pointer)which links to next node.

!["Node Description"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/LinkedList/LLImage_01.png?raw=true)

!["Linked list description"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/LinkedList/LLImage_02.png?raw=true)

- In the second part we store a reference variable because there are no pointers in java but in c++ we stoer a pointer.
- Reference variables are variables that point to an object.
- So to make a Linked List we will create a class named Node and all the nodes are various objects of this class.
- When we create a node calss we will assume that there are no more nodes so we will initialize the next parameter in constructor to null.
- There are two special nodes in Linked list that we always mark or keep track of, One is Head node which is the starting or beginning node of the Linked List and the Second one is Tail node which is the ending node of the LL.
- To add, remove, print, search nodes in Linked List we don't write the code for these in main but rather as methods in class itself.

#### Add

- Add First

  - If we use add first we will add a node before the head and the new node becomes the head.
  - Steps to add first:

    - Create a new Node
    - New node's next = head
    - head = new Node

  - We will follow these three steps except if the LinkedList is null. If LL is null then we create a new Node assign head to it and assign tail to it as well.

- Add Last
- Steps to add Last:

  - Create a node
  - tail.next = New Node
  - tail = new Node

- To Print a linked list we traverse the whole linked list using next. We create a temporary node and store head in it and print the temporary node data after that we point our temporary node to next node and print and so on till we reach tail.
- Head and tail values are fixed we dont change this values, we only changes these when linked list is changed.

- To Add in Middle

  - We take in index where the node needs to be added and data of the node.
  - Then we createa temporary node and travese that till index-1 then point our temporary node next to new node next and then temporary node next to new node

#### Print

- To track size of linked list we declare a static variable named size and whenever we add a node we increase
  the size by 1.

#### Remove

- Similar to add we can remove nodes in two ways:

  - Remove First
  - Remove Last

- While Removing First we remove the head of current Linked list and point it to next node and the removed node will automatically be deleted by garbage collector as there is no way to access that node now.
- While removing last we first point the previous node next to null and point tail to the previous node and the current tail node will be deleted by garbage collector as there is no way to access that node

#### Iterative Search

- Search for a key in a Linked List, Return the position where it is found. If not found return -1.

#### Iterative Search

- Search for a key in a Linked List, Return the position where it is found. If not found return -1. Use Recursion.

#### Reverse a Linked List.

- Reversing a linked list is a four step process
  - The three variables current, previous and next are important
  - Step 1: next = current.next
  - Step 2: current.next = previous
  - Step 3: previous = current
  - Step 4: current = next

#### Find and remove Nth Node from End.

- nth node from end is equal to size-n+1 node from start.

#### Check if LL is a Palindrome

- To deal with this problem we will check out two appraoches
  - Slow fast concept
  - Reverse half LL
- We can convert linkedlist to array list, string or array and check if they are palindrome if they are then the linked list is palindrome. But it takes BigO(n) time complexity and BigO(n) Space complexity. O(n) of sc becasue we use completely different data structure to achevie the results. But we want the tc to be linear and sc to be O(1)
- The other way to solve is find the mid node of the LinkedList and reverse the second half of the LL. Then check if first half is equal to reversed 2nd half.
- In slow fast approach we delcare to variables or pointer where the slow variable increases by 1 and the fast variable increases by 2
  - In Even case we travel till fast variable points to null, in the same time slow variable will cover half the linked list.
  - In odd case we travel till fast.next is equal to null
- After finding mid we reverse the second half of the linked list and compare the first half with second half.
