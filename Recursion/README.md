# Recursion

- Recursion is one of the core concept.
- Recursion is mostly used in

  - Trees
  - Graphs
  - Dynamic Programming

- Iteration and Recursion and like brothers. Whatever problem you can solve using iteration can also be solved using recursion.
- whenever a function calls itself again and again this process is called recursion and when the function calls itself to solve smaller problems they are called recursive functions.

- **Definition** : Recursion is a method of solving a computational problem where the solution depends on solutions to smaller instances of the same problem.
- Base case or final case is where your recursion will end.
- In recursion we go from top to down, From big solution to small solution and stop at base case and once you reach base case we to top again by sending the solution to top again by combining all small solutions we get to big solution.

!["Recursion calls image"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Recursion/recursion_03.png?raw=true)

- Three step approach to Recursion.
  1. Define your base case.
  2. When your function is called it does some work
  3. Your function calls the inner function and trust that it gives the correct solution.

!["Call stack image"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Recursion/recursion_04.PNG?raw=true)

### StackOverflow

- When all the memory stack is occupied and there is no more space to make new calls or parameters this situation is called stack overflow.

- This is the reason Base case is very important in recursion, its like break statement in while loop.

- Stack Overflow occurs in either of these two situations:

  - When there are so many parameters during recursion and all these individual parameters consumption is very high.
  - Too many recursive calls.

- The new recursive call in the stack is called call frame.
- When there is more than one recursion call it will form a tree structure.
- Recursion has O(n) space complexity and O(2^n) time Complexity
