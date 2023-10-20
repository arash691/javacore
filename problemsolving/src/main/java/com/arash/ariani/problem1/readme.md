# Problem: Finding the Maximum of Three Numbers

## Problem Description

The task at hand is to find the maximum of three numbers entered by the user.
The program prompts the user to input three numbers and then determines and displays the maximum among them.
For instance if we enter three numbers like 5,1,8 the program must print 8 as a maximum.

## Solution Explanation

### Input Gathering:

The program uses the Scanner class to obtain input from the user. Three integers (a, b, and c) are declared to store the
user-inputted values.

### Finding the Maximum:

The program then compares the three numbers to determine the maximum using a series of if-else statements.

- If a is greater than or equal to both b and c, then a is the maximum.
- If b is greater than or equal to both a and c, then b is the maximum.
- Otherwise, c is the maximum.

The result is then printed to the console.