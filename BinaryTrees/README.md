# Binary Trees

## Binary Trees Part 01

- Tree is a Hierarchical data structure unlike stacks, linked lists, queues which are linear data structures.
- In real life we have a tree where there is a root, branches and leaves, In the same way in data structures we have similar things but upside down.
- The top start node is called root and the bottom end nodes are called leaf nodes and in between ones are called branches.

!["Tree parts"]("https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/BinaryTrees/BinaryTree_01.png?raw=true")

### Levels & Subtrees

- Binary Tree is a tree where at max we have only 2 children.
- Levels and SubTree: We know that data is stored in hierarchical fashion where we have different levels. The data thats stored in first level is called level 01 and level increases respectively and the Depth of 1st level is 1 and depth keeps increasing by 1 at each level.

!["Tree Level and depth image"]("https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/BinaryTrees/BinaryTree_02.png?raw=true")

- We derive another concept from level and depth and its called SubTree.
- Every node has its subtree.

!["SubTree example"]("https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/BinaryTrees/BinaryTree_03.png?raw=true")

- Left subtree node starts with 2 and right sub tree node starts with 3.
- Leaf node is also a subtree whose value is null.
- When we calculate ancestors we list all nodes parent nodes till root node.

### Build Tree Preorder

- We need a preorder Sequence to build a tree.
- In preorder -1 stands for null
- The best way to build a tree from preorder sequence is you start with your node then build the left sub tree downwards till you reach null then build your right subtree upwards we do this whole process recursively(node, left subtree, right subtree).

!["Binary Tree from preorder"]("https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/BinaryTrees/BinaryTree_04.PNG?raw=true")

### Tree Traversals

- There are three ways to traverse trees recursively
  - **PreOrder**
  - **InOrder**
  - **PostOrder**
- There is one way to travers tree iteratively which is called **Level Order** traversal

#### PreOrder Traversal

- PreOrder have three rules
  1. Print Root node of the tree
  2. Print left subtree
  3. Print right subtree
- It is called PreOrder because we first print the Root Node.

#### InOrder Traversal

- PreOrder have three rules
  1. Print left subtree
  2. Print root of the tree
  3. Print right subtree
- It is called InOrder because the node comes in between the left and right subtree.

#### PostOrder Traversal

- PreOrder have three rules
  1. Print left subtree
  2. Print right subtree
  3. Print root of the tree
- It is called PostOrder because the node comes after left and right subtree.

#### LevelOrder Traversal

- In level order traversal we print data level wise.
- To acheive LevelOrder Traversal we use Queue data Structure.
- We take our node individual and store in Queue but there is a specific technique to store these nodes

- DFS: Depth-first Search
- BFS: Breadth-first Search

- To acheive the BFS we use Queue becuase Queue has FIFO(First In First Out) property and we solve lever order iteratively rather than recursively.
- First we add root node to the queue, a null to represent new line and add its left and right nodes to the queue and null again, then we will bring root out then left node out and add its left and right nodes to the queue end and so on.

#### Height of a Tree

- Height is the maximum distance between root to leaf. This distance is calculated in terms of nodes or in terms of edges.
- The connecting line between nodes is called edge.
- We will calculate height in terms of nodes, you can get edges value by subtracting one from nodes value.

##### Insert Image05

!["Height of a Tree"]("https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/BinaryTrees/BinaryTree_05.png?raw=true")

#### Count of Nodes

- In trees almost all the questions can be solved using recursion. First we calculate for child and automatically we will get parent calculation.
- Each node return its subtree node count if the subtree is null then it returns 0.
