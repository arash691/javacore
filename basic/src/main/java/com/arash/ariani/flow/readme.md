# Control Flow in Programming

Control flow refers to the order in which statements, instructions, or blocks of code are executed within a program. It determines the flow of execution based on conditions, loops, and branching statements. In other words, control flow defines the sequence in which different parts of a program are executed.

## Key Components of Control Flow

### Sequential Execution

- Statements are executed in a linear or sequential order, one after the other.
```java
public class SequentialExecutionExample {
    public static void main(String[] args) {
        // Statements executed sequentially
        int x = 5;
        System.out.println("The value of x is: " + x);

        String greeting = "Hello, ";
        String name = "John";
        System.out.println(greeting + name);
    }
}
```

### Conditional Execution (Branching)

- Decisions are made based on conditions, and different blocks of code are executed depending on whether a condition is true or false.
- Common constructs for conditional execution include `if`, `else if`, and `else` statements.
```java
public class ConditionalExecutionExample {
    public static void main(String[] args) {
        int age = 18;

        // Decision based on a condition
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
```


### Looping (Iteration)

- A block of code is repeated multiple times based on a condition. This is often achieved using `for`, `while`, or `do-while` loops.
- Loops are used for repetitive tasks and can iterate over arrays, collections, or until a certain condition is met.
```java
public class LoopingExample {
    public static void main(String[] args) {
        // Looping with for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Looping with while loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}

```
### Jump Statements

- Jump statements alter the normal control flow by transferring the control to a different part of the program. Examples include `break` and `continue` statements.

Control flow is crucial for creating programs that can perform different actions based on varying conditions and input. It allows developers to write dynamic and flexible code that can adapt to different scenarios during runtime.
```java
public class JumpStatementsExample {
    public static void main(String[] args) {
        // Jump statement (break) in a loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking loop at i = 5");
                break;
            }
            System.out.println("Inside loop: " + i);
        }
    }
}

```