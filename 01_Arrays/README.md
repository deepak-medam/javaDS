# Arrays

- Each element in an array has a index.
- Array is zero based indexing in java.

**Array**: List of elements of the same type placed in a contiguous memory location.

- Each array can only hold same type of elements.

## Operations in Array

- Create
- Input
- Output
- Update

##### Creating an Array

    dataType arrayName[] = new dataType[size];
    int marks[] = new int[50];
    int numbers[] = {1, 2, 3};
    int moreNumbers[] = {4, 5, 6};
    String fruits[] = {"apple", "mango", "orange"};

- **new** keyword is used to create an array in java by allocating memory for the array.
- Arrays type is static, one size is declared it cant be changed.
- **.length** attribute is used to get the size of the array.

##### Passing arrays as argument

- In function to pass a variable there are two ways:
  - By value: A copy of the variable is passed to the function.
  - By reference: The address of the variable is passed to the function.
- Arrays are passed by reference in java.
