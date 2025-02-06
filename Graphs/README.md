# Graphs

- If you have to pick 3 topics from which an interview question might come one of that would be graphs.
- Graphs are used in daily life and many practical situations in a company.

- Graph is a network of Nodes.
- Graph is a hierarchical structure.
- If we take our tree data structure to next level that would be our graphs.
- The node inside graph is called a vertex and vertices(plural), The line that connect the vertex is called edge.
- There are different types of edges:

  - Uni-Directional Graph or Directed graph(can travel in one direction but not other way around)
  - Bi-Directional(can travel in both directions)
  - Un-Directed(no direction same as bi directional)

!["Edges and graph types"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_01.png?raw=true)

- Edges have weight associated with them
- We have two types of graphs based on weight:

  - Weighted graph
  - UnWeighted graph

- Weight can be any value including 0, negative values and positive values

!["Graph types based on weight"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_02.png?raw=true)

## Graph Representations

- Whenever we create a graph we need a structure to store and represent it in memory.
- There are few way to store a graph:

  - Adjacency list(most problems use this form)
  - Adjacency matrix
  - Edge list
  - 2D matrix(Implicit Graph)

- Cycles from in graphs and its quite normal

!["Cyclic nature in graphs"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_03.png?raw=true)

### Adjacency List

- Adjacency list is nothing but a list of lists
- We create a separate list for each node containing all the connecting neighbour nodes and we create a list to
  store all these list of nodes
- Adjacent list doesn't store any extra information and it is optimized in terms of space and time.
- The Time complexity to find a node and its neighbours will be O(k) for k neighbours which is usually
  constant time.
- How do we store the infromation inside array list for each node, we store it in the form of its edges. We
  create a array of arraylists in which we store every single edge.
- Edge has source, destination and weight as its information. Source is from where edge starts, destination is
  where it ends and weight of edge. By default if no weight is given we use 1 or we can remove this weight
  parameter but we use it in here to make our life easier in future.

!["Adjacency list graph creation"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_04.PNG?raw=true)

### Adjacency matrix

- Second way to represnt graph in java is Adjacency matrix
- It stores the edges information, The space to store the information about v number of vertices is O(v^2)
- In adjacency matrix we use vertices values of rows and columns. If matrix value is (i,j) and its value is 0
  that means we dont have any edge between i to j and if its equal to 1 then a edge exists between both of them
- Time Complexity to find and edge for vertex is O(v) which is very significant
- Instead of 1 if the edge exists between vertices we can store the weight value which indicates there is a edge
  and its weight.

!["Adjacency matrix graph creation"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_05.png?raw=true)

### Edge List

- In edge list we make list for all edges
- Usually we don't represent graph using this structure but we use it for some algorithms like sorting edges or
  trying to find minimum spanning tree for any graph

!["Edge list graph creation"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_06.png?raw=true)

### Implicit Graph

- You have a 2D matrix in which you can travel in four directions(up, down, left, right) and you will be asked
  to find something like in how many steps you can reach (0,0) or (n,m) basically from one source to destination
  path. Though you are not specifically given a graph but we assume this as a graph
- We assume this 2D matrix as graph thats why its an implicit graph.
- We solve flood fill algorithm using this.

!["2D matrix implict graph"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_07.png?raw=true)

## Graphs Applications

- Maps(Shortest Path) : This is most commonly used implementation of graphs
- Flight travel cost calculation
- Social Network(Facebook, Insta, Twitter, Linkedin, Snap, etc): Every person is a vertex and has edge with
  other person in this way we represent a person graph and network graph. All the recommondations, posts,
  likes happens through graphs.
- Delivery Network(Shortest Cyclic Route) : For example a amazon delivery truck have to deliver to muliple
  location how do we decide what is the shortest way to cover all points that is cyclic start and end at
  warehouse. Similarly We have School Van problem.
- Physics & Chemistry molecules: For research and development to store molecules in computer we use graphs
- Routing Algorithms: We use graphs to develop routing algorithms to deliver data packets.
- Machine Learning: Graphs are used for neurons, neural networks and computation graphs.
- Dependency graph: To run a particular software or package you will need other software or packages to run
  your desired package to represent this we use dependecy graph. This is very important in case of servers.
- Computer vision: Graphs are used for image segmentation and flood fill algorithm uses graphs.
- Graph Databases: Similar to SQL and NoSQL we have graph databases like nebula, neo4g. These are used in fraud
  detection, recommondation engines, etc.
- Research: Graph is highly used in research related to human brain.

## Creating a graph

!["Adjacency graph"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_08.png?raw=true)

## Graph Traversals

- There are two ways to travers a graph:

  - Breadth First Search(BFS)
  - Depth First Search(DFS)

- Usually when we start traversing we start with source. In graph there is no fixed starting point it can be anyt vertex of your choice unlike trees where the starting point is root node.

### Breadth First Search (BFS)

- In BFS we go to immediate neighbours first.
- Breadth First Search is similar to level order traversal.
  !["Breadth First Search"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_09.png?raw=true)
- To implement Breadth First Search we need Queue data structure and a FIFO one.
- We use a boolean array to keep track of visited vertices and to visit one node only once, because in trees we dont have cycles whereas in graphs we do have cycles.

### Depth First Search (DFS)

- In DFS keep going to the 1st neighbor.

1. Visit the current node
2. Visit all neighbors if they are unvisited

### Has Path

- There will be no path between two nodes if they are disjoint
- If there are traversal questions in graphs most of the time we will have a visited array to avoid going around in cycles.
- To Check if the path exists between src and dest firt I will ask my neighbour if they know the path to the destination if they do then I will return true.

1. src == dest return true
2. if(!vis[neigh]) && hasPath(neigh, dest)) I will return ture.

!["Has Path explanation"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Graphs/graphs_10.png?raw=true)
