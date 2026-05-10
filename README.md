# Java Exception Handling

Exception handling in Java is a mechanism used to handle runtime errors so that the normal flow of the program can continue without abnormal termination.

---

# Table of Contents

1. Introduction to Exception Handling  
2. Exception Handling Keywords  
3. try-catch  
4. finally  
5. Multiple catch  
6. Nested try  
7. throw Keyword  
8. throws Keyword  
9. Custom Exception (User Defined Exception)  
10. Difference Between throw and throws  
11. Checked vs Unchecked Exceptions  
12. Common Exceptions in Java  
13. Important Interview Questions  
14. Recommended Learning Order  
15. Conclusion  

---

# 1. Introduction to Exception Handling

## Definition

Exception handling is a process in Java used to handle runtime errors during program execution.

It helps:
- Prevent sudden program termination
- Maintain normal flow of execution
- Improve reliability and debugging

---

# 2. Exception Handling Keywords

| Keyword | Purpose |
|---|---|
| try | Contains risky code |
| catch | Handles exception |
| finally | Executes whether exception occurs or not |
| throw | Manually throws an exception |
| throws | Declares exceptions |

---

# 3. try-catch

## Definition

The `try-catch` block is used to handle exceptions immediately after they occur.

- `try` contains risky code
- `catch` handles the exception

## When to Use

Use `try-catch` when:
- You know an exception may occur
- You want to prevent program crash
- You want custom error handling

## Advantages

- Prevents abnormal termination
- Makes debugging easier
- Allows smooth program execution

---

# 4. finally Block

## Definition

The `finally` block always executes whether an exception occurs or not.

## When to Use

Use `finally` for:
- Closing files
- Closing database connections
- Releasing resources
- Cleanup operations

## Important Point

The `finally` block executes even if:
- Exception occurs
- Exception does not occur

It may not execute only if:
- `System.exit()` is called
- JVM crashes

---

# 5. Multiple catch

## Definition

Multiple `catch` blocks are used to handle different types of exceptions separately.

## When to Use

Use when:
- Different exceptions may occur
- Different handling is needed for each exception

## Advantages

- Better exception management
- Separate handling for separate errors
- Improves readability

---

# 6. Nested try

## Definition

A `try` block inside another `try` block is called nested try.

## When to Use

Use nested try when:
- Multiple risky operations exist
- Different exceptions need different handling levels

## Advantages

- Better control over exception handling
- Separate handling for inner and outer operations

---

# 7. throw Keyword

## Definition

The `throw` keyword is used to manually create and throw an exception.

## When to Use

Use `throw` when:
- Validation fails
- Invalid conditions occur
- Business rules are violated

## Common Uses

- Age validation
- Password validation
- Bank balance checking

## Important Point

`throw` is followed by an exception object.

---

# 8. throws Keyword

## Definition

The `throws` keyword is used in method declaration to declare exceptions that may occur.

## When to Use

Use `throws` when:
- You do not want to handle exception in current method
- Caller method should handle the exception

## Advantages

- Cleaner code
- Better exception delegation
- Useful in large applications

## Important Point

`throws` is followed by exception class names.

---

# 9. Custom Exception (User Defined Exception)

## Definition

A custom exception is an exception created by the programmer according to application requirements.

## When to Use

Use custom exceptions when:
- Built-in exceptions are insufficient
- Business logic requires specific exceptions

## Examples

- Invalid age
- Insufficient balance
- Invalid marks
- Invalid user input

## Advantages

- Improves readability
- Better error understanding
- Application-specific handling

---

# 10. Difference Between throw and throws

| throw | throws |
|---|---|
| Used inside method | Used in method declaration |
| Throws single exception | Declares multiple exceptions |
| Followed by object | Followed by class names |
| Used manually | Used for delegation |

---

# 11. Checked vs Unchecked Exceptions

| Checked Exception | Unchecked Exception |
|---|---|
| Checked at compile time | Checked at runtime |
| Must be handled | Handling optional |
| Inherits Exception class | Inherits RuntimeException |
| Example: IOException | Example: ArithmeticException |

---

# 12. Common Exceptions in Java

| Exception | Cause |
|---|---|
| ArithmeticException | Divide by zero |
| NullPointerException | Accessing null object |
| ArrayIndexOutOfBoundsException | Invalid array index |
| NumberFormatException | Invalid number conversion |
| IOException | File handling issue |

---

# 13. Important Interview Questions

## Why use exception handling?

Exception handling is used to:
- Prevent abnormal termination
- Maintain normal flow
- Improve reliability
- Handle runtime errors properly

---

## Can finally block skip execution?

Yes, only when:
- `System.exit()` is called
- JVM crashes

---

## Can we have try without catch?

Yes, if `finally` exists.

---

## Can we have catch without try?

No.

---

## Can multiple catch blocks exist?

Yes.

---

## Can finally exist without catch?

Yes.

---

# 14. Recommended Learning Order

1. try-catch  
2. finally  
3. multiple catch  
4. nested try  
5. throw  
6. throws  
7. custom exceptions  
8. checked vs unchecked exceptions  

---

# 15. Conclusion

Exception handling is one of the most important concepts in Java because it:
- Prevents program crashes
- Improves debugging
- Makes applications reliable
- Helps manage runtime errors effectively

Learning exception handling is essential for:
- Interviews
- Java projects
- Backend development
- Enterprise applications
