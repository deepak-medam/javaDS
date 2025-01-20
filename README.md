# Data Strcture and Algorithms in Java

## Greedy Algorithms

### Introduction to Greedy

- If you have a problem and you are solving it using small steps which will result in final solution, at every small step you would make a greedy choice
- For example if you are a company and want to hire someone.

  - For round 1 you will have 1000 applicants for a online test
  - For round 2 you will narrow down 100 applicants for a interview
  - For round 3 you will narrow down to 20 applicants for HR round
  - You hire 10 applicants
  - In every round you will pick a local solution for example 100, 20, 10 and these local solutions will give you a global solution which is final solution.

- Greedy approach is useful for optimization problems like getting minimum, maximum,etc
- In Greedy first we sort the data and then use greedy approach.
- Greedy algorithms doesnt have fixed rule that apply to every problem.

### Definition

- Greedy algorithms is the problem solving technique where we make the locally optimum choice at each stage and hope to acheive a global optimum.

#### Pros

- Simple and Easy
- Good Enough Time complexity

#### Cons

- A lot of time, global Optimum is not acheived that is why we apply greedy in particular cases.

### Activity Selection

- you are given **n activities** with their start and end times. Select the maximum number of activities that
  can be performed by a single person, assuming that a person can only work on a single activity at a time.
  **Activities are sorted according to end time.**

## Dynamic Programming Part 01

- Fibonnaci is a sequence of numbers where every number is sum of its last two numbers.

        fib(n) = fib(n-1) + fib(n-2)

- Calculating fibonnaci of a number using recursion is very inefficient. For example if you want to calculate a simple 6th fibonnaci number fib(6) you would calculate fib(2) 5 times similiary fib(3) is calcualted 3 times.

!["Fibonnacci Recursive tree"](https://github.com/deepak-medam/Courses-Images/blob/main/javaDS/Recursion/recursion_01.png?raw=true)

- It is inefficient and stupid to calculate same things again and again as you search for higher fibonnaci numbers.

- In recursion calls start from top
- To solve this problem we can develop a mechanism where we can store the calcuated values and stop calculating them again and again and passing further calls.

        public static int fib(int n, int f[]) {
            if (n == 0 || n == 1) {
                return n;
            }
            if (f[n] != 0) {
                return f[n];
            }

        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
        }

- This change will have a time complexity of O(n) and creates a skewed recursive tree where you calculate one side of the tree as the calls for other sides are already stored in the array.

!["Fibonacci skewed tree"](https://raw.githubusercontent.com/deepak-medam/Courses-Images/refs/heads/main/javaDS/Recursion/recursion_02.png)

- This process of storing values after calculating to optimise the solution is called **Memoization**.
- Memoization is one of the way to implement Dynamic Programming.
- In simple Dynamic programming is nothing but advanced recursion.

### What is Dynamic Programming.?

- Dynamic programming is optimized recursion
  **How to identify Dynamic Programming problem?**

  1. There should be a **Optimal Problem** in the given problem like get the least, most, min, max, largest, smallest, etc.
  2. Some choice is given (multiple branches in recursion tree) as branches results in many sub problems which might have overlapping problmes.

- For example sum of n numbers is not a dynamic programming problem because if you take the recursive tree of the problem its already skewed and optimized there are no overlapping problems.

### Dynamic Programming Definition

- Dynamic programming is a technique in computer programming that helps to efficiently solve a problem that have overlapping subproblems and optimal substructure property.

### Ways of DP

- ##### Memoization(Top Down)
  - In Memoization we come from top to bottom
  - In Memoization first solve the problem with normal recursion second store the results of sub problems and reuse them to solve the problem.
- ##### Tabulation(Bottoms Up)

  - In Tabulation we go from bottom to top.
  - In tabulation we don't use recursion but instead we use iteration.
  - All the problems that are solved using iteration can be solved using recursion and all the problems that are solved using recursion can be solved with iteration.
  - Some problems are easy to solve using iteration and some problems are easy to solve using recursion. Tree problems are easy to solve using recursion similarly sum of n number kindaa problems are easy to solve using iteration.
  - Tabulation is bit difficult to visualize and to develop but its efficient. For some problems you might face a stack overflow issue when trying to solve using memoization this is why we use tabulation for most of the DP problems.
  - Tabulation is basically to create a table
  - In tabulation we follow 3 steps to complete the process:
    - Initialization - first we initialize a table
    - Meaning - We assign a meaning to every index
    - Filling - We start filling the table from small to large.

- DP is all about patterns.

### 7 Important Concepts / Questions

1. Fibonacci
2. 0-1 Knapsack
3. Unbounded Knapsack
4. LCS (Longest Common Subsequence)
5. Kadane's Algorithm (Arrays)
6. Catalan Number
7. DP on Grid (2D Arrays)

- Using these 7 concepts/questions we can solve upto 70 problems.
- If you are clear with these 7 concepts and understand them well then you are probably clear with all DP.

##### 1. Fibonacci

- Climbing Stairs
- Number Factors
- Min Jumps to reach the end
- Min Jumps with cost
- House Theif (most famous)

##### 2. 0-1 Knapsack

- Subset Sum
- Equal Subset Sum Partition
- Min Subset Sum Difference
- Count of Subset Sum
- Target Sum

##### 3. Unbounded Knapsack

- Rod Cutting
- Coin Change
- Min Coin Change
- Max Ribbon Cut

##### 4. LCS (Longest Common Subsequence)

- Longest Common Substring
- Edit Distance
- Box Stacking
- Longest Increasing Subsequence
- Longest Bitcoin Subsequence
- Subsequence Pattern matching
- Min Add/Delete to convert
- One String to another

##### 5. Catalan Number

- No of BSTs
- N Parentheses
- Convex Polygons
- Disjoint chords
- Catalan Triangle
- Mountain Ranges
- Dyck Words

### Climbing Stairs problem

- Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.
- There can be various ways to frame the problem where the number of stairs at a time can change to 3, 4 etc.
- Climbing stairs follow fibonnaci sequence.
- In tabulation if you have one variable that changes you will created 1D array, if you have 2 variables you will create 2D array, and for 3 variables 3D array and so on.
