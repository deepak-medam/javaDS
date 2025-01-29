# BackTracking Notes

- There are three types of Backtracking:

  1. Decision, Any questions that has yes or no answers are decision type backtracking.
  2. Optimization, Any question that might have answer as many ways what is the shortest path, easiest path, these are optimization type backtracking.
  3. Enumeration, Any question that asks for total ways to reach destination these are enumeration type backtracking.

- When you perform an action while coming back from recursion call stack it is called backtracking.

## Problems

1. Array BackTracking
2. Find Subsets

   - Find and print all subsets of a given string.
   - If a string is of length n, then it will have 2^n subsets.
     !["Insert image 01"]()

3. Find and print all permutations of a String.

   - If you have n elements you will have n! permutations.
   - This is enumeration type backtracking.
     !["Insert image 02"]()

4. N Queens: Place N queens on an NxN chessboard such that no 2 queens can attack each other.

   - N Queens question comes in differnet forms
     - One is find all solutions where all queens can sit
     - Yes/No can N queens sit on the board without attackign each other, If yes then print one solution.
     - Third would be to count the solutions.

5. Grid ways: Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM grid.

   - Allowed moves - right or down.
   - No of cell turns will be equal to rows+columns.
   - Right turns will be equal to number of columns = m
   - Down turns will be equal to number of rows = n

6. Sudoko Solver
