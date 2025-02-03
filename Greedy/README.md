# Greedy Algorithms Notes

## Introduction to Greedy

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

## Definition

- Greedy algorithms is the problem solving technique where we make the locally optimum choice at each stage and hope to acheive a global optimum.

#### Pros

- Simple and Easy
- Good Enough Time complexity

#### Cons

- A lot of time, global Optimum is not acheived that is why we apply greedy in particular cases.

## Activity Selection

- you are given **n activities** with their start and end times. Select the maximum number of activities that
  can be performed by a single person, assuming that a person can only work on a single activity at a time.
  **Activities are sorted according to end time.**
