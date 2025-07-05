# Java Functions and Recursion - Learning Guide

## Core Concepts

### What are Functions?
Functions (methods in Java) are reusable blocks of code that perform specific tasks. They help organize code, promote reusability, and make programs more modular.

### Function Components
- **Method Signature**: Name, parameters, return type
- **Method Body**: Code that executes when function is called
- **Return Statement**: Returns value to caller (optional for void methods)

### Basic Function Syntax
```java
// Method signature
accessModifier returnType methodName(parameters) {
    // Method body
    return value; // if not void
}

// Examples
public static int add(int a, int b) {
    return a + b;
}

public static void printMessage(String msg) {
    System.out.println(msg);
}
```

### What is Recursion?
Recursion is a programming technique where a function calls itself to solve a problem by breaking it down into smaller, similar subproblems.

### Recursion Components
- **Base Case**: Condition that stops recursion
- **Recursive Case**: Function calls itself with modified parameters
- **Progress**: Each recursive call should move toward base case

### Recursion vs Iteration
- **Recursion**: More intuitive for some problems, uses call stack
- **Iteration**: Generally more memory efficient, uses loops

## Problem-Solving Approaches

### 1. Calculate Factorial (Iteration and Recursion)
**Logic**: Factorial of n (n!) = n × (n-1) × (n-2) × ... × 1
**Base Case**: 0! = 1, 1! = 1

**Pseudocode (Iterative)**:
```
ALGORITHM FactorialIterative(n)
INPUT: Integer n (n >= 0)
OUTPUT: Factorial of n

1. IF n < 0
   THROW IllegalArgumentException
2. IF n = 0 OR n = 1
   RETURN 1
3. result = 1
4. FOR i = 2 TO n
   result = result × i
5. RETURN result
```

**Pseudocode (Recursive)**:
```
ALGORITHM FactorialRecursive(n)
INPUT: Integer n (n >= 0)
OUTPUT: Factorial of n

1. IF n < 0
   THROW IllegalArgumentException
2. IF n = 0 OR n = 1
   RETURN 1
3. RETURN n × FactorialRecursive(n - 1)
```

**Time Complexity**: O(n) for both approaches
**Space Complexity**: O(1) iterative, O(n) recursive (call stack)

**Notes**: 
- Watch for integer overflow with large values
- Recursive version is more intuitive but uses more memory

### 2. Sum of Digits of a Number
**Logic**: Extract each digit and add to sum
**Approach**: Use modulo and division operations

**Pseudocode (Iterative)**:
```
ALGORITHM SumOfDigitsIterative(n)
INPUT: Integer n
OUTPUT: Sum of digits in n

1. n = absolute value of n  // Handle negative numbers
2. sum = 0
3. WHILE n > 0
   digit = n % 10
   sum = sum + digit
   n = n / 10
4. RETURN sum
```

**Pseudocode (Recursive)**:
```
ALGORITHM SumOfDigitsRecursive(n)
INPUT: Integer n
OUTPUT: Sum of digits in n

1. n = absolute value of n
2. IF n = 0
   RETURN 0
3. RETURN (n % 10) + SumOfDigitsRecursive(n / 10)
```

**Time Complexity**: O(log n) - number of digits
**Space Complexity**: O(1) iterative, O(log n) recursive

**Note**: log₁₀(n) represents the number of digits in n

### 3. Print Fibonacci Sequence up to N Terms
**Logic**: Each number is sum of two preceding numbers (0, 1, 1, 2, 3, 5, 8, ...)
**Approach**: Use iteration for efficiency

**Pseudocode (Iterative)**:
```
ALGORITHM PrintFibonacci(n)
INPUT: Integer n (number of terms)
OUTPUT: Prints first n Fibonacci numbers

1. IF n <= 0
   RETURN
2. IF n >= 1
   PRINT 0
3. IF n >= 2
   PRINT 1
4. a = 0, b = 1
5. FOR i = 3 TO n
   c = a + b
   PRINT c
   a = b
   b = c
```

**Pseudocode (Recursive - Individual Term)**:
```
ALGORITHM FibonacciRecursive(n)
INPUT: Integer n (term position)
OUTPUT: nth Fibonacci number

1. IF n <= 0
   RETURN -1  // Invalid input
2. IF n = 1
   RETURN 0
3. IF n = 2
   RETURN 1
4. RETURN FibonacciRecursive(n-1) + FibonacciRecursive(n-2)
```

**Time Complexity**: O(n) iterative, O(2ⁿ) recursive
**Space Complexity**: O(1) iterative, O(n) recursive

**Note**: Recursive approach is inefficient due to repeated calculations

### 4. Check if a Number is Prime
**Logic**: Prime number has exactly two divisors: 1 and itself
**Approach**: Check divisibility up to square root of number

**Pseudocode**:
```
ALGORITHM IsPrime(n)
INPUT: Integer n
OUTPUT: Boolean indicating if n is prime

1. IF n <= 1
   RETURN false
2. IF n = 2
   RETURN true
3. IF n % 2 = 0
   RETURN false
4. FOR i = 3 TO sqrt(n) STEP 2
   IF n % i = 0
      RETURN false
5. RETURN true
```

**Time Complexity**: O(√n) - check up to square root
**Space Complexity**: O(1) - constant space

**Optimization**: Only check odd divisors after checking for 2

### 5. Find GCD of Two Numbers
**Logic**: Greatest Common Divisor using Euclidean algorithm
**Approach**: Use recursive relation: gcd(a,b) = gcd(b, a%b)

**Pseudocode (Euclidean Algorithm)**:
```
ALGORITHM GCDRecursive(a, b)
INPUT: Integer a, Integer b
OUTPUT: GCD of a and b

1. IF b = 0
   RETURN a
2. RETURN GCDRecursive(b, a % b)
```

**Pseudocode (Iterative)**:
```
ALGORITHM GCDIterative(a, b)
INPUT: Integer a, Integer b
OUTPUT: GCD of a and b

1. WHILE b ≠ 0
   temp = b
   b = a % b
   a = temp
2. RETURN a
```

**Time Complexity**: O(log(min(a,b))) - Euclidean algorithm
**Space Complexity**: O(1) iterative, O(log(min(a,b))) recursive

**Note**: Euclidean algorithm is very efficient for GCD calculation

### 6. Calculate Power (x^y)
**Logic**: Multiply x by itself y times
**Approach**: Use efficient exponentiation or simple iteration

**Pseudocode (Simple Iteration)**:
```
ALGORITHM PowerIterative(x, y)
INPUT: Integer x (base), Integer y (exponent)
OUTPUT: x raised to power y

1. IF y = 0
   RETURN 1
2. IF y < 0
   RETURN 1.0 / PowerIterative(x, -y)
3. result = 1
4. FOR i = 1 TO y
   result = result × x
5. RETURN result
```

**Pseudocode (Recursive)**:
```
ALGORITHM PowerRecursive(x, y)
INPUT: Integer x (base), Integer y (exponent)
OUTPUT: x raised to power y

1. IF y = 0
   RETURN 1
2. IF y < 0
   RETURN 1.0 / PowerRecursive(x, -y)
3. IF y = 1
   RETURN x
4. RETURN x × PowerRecursive(x, y - 1)
```

**Pseudocode (Efficient - Fast Exponentiation)**:
```
ALGORITHM PowerEfficient(x, y)
INPUT: Integer x (base), Integer y (exponent)
OUTPUT: x raised to power y

1. IF y = 0
   RETURN 1
2. IF y < 0
   RETURN 1.0 / PowerEfficient(x, -y)
3. IF y % 2 = 0
   temp = PowerEfficient(x, y / 2)
   RETURN temp × temp
4. ELSE
   RETURN x × PowerEfficient(x, y - 1)
```

**Time Complexity**: O(y) simple, O(log y) efficient
**Space Complexity**: O(1) iterative, O(log y) efficient recursive

### 7. Reverse Digits of a Number
**Logic**: Extract digits from right to left and build reversed number
**Approach**: Use modulo and division operations

**Pseudocode (Iterative)**:
```
ALGORITHM ReverseDigitsIterative(n)
INPUT: Integer n
OUTPUT: Number with digits reversed

1. isNegative = (n < 0)
2. n = absolute value of n
3. reversed = 0
4. WHILE n > 0
   digit = n % 10
   reversed = reversed × 10 + digit
   n = n / 10
5. IF isNegative
   reversed = -reversed
6. RETURN reversed
```

**Pseudocode (Recursive)**:
```
ALGORITHM ReverseDigitsRecursive(n)
INPUT: Integer n
OUTPUT: Number with digits reversed

1. IF n = 0
   RETURN 0
2. isNegative = (n < 0)
3. n = absolute value of n
4. result = ReverseHelper(n, 0)
5. RETURN isNegative ? -result : result

HELPER FUNCTION ReverseHelper(n, reversed)
1. IF n = 0
   RETURN reversed
2. RETURN ReverseHelper(n / 10, reversed × 10 + n % 10)
```

**Time Complexity**: O(log n) - number of digits
**Space Complexity**: O(1) iterative, O(log n) recursive

**Note**: Handle overflow for large numbers

### 8. Print All Even Numbers from 1 to N
**Logic**: Iterate through range and print even numbers
**Approach**: Check if number is divisible by 2

**Pseudocode (Method 1)**:
```
ALGORITHM PrintEvenNumbers(n)
INPUT: Integer n
OUTPUT: Prints all even numbers from 1 to n

1. IF n < 1
   RETURN
2. FOR i = 1 TO n
   IF i % 2 = 0
      PRINT i
```

**Pseudocode (Method 2 - Optimized)**:
```
ALGORITHM PrintEvenNumbersOptimized(n)
INPUT: Integer n
OUTPUT: Prints all even numbers from 1 to n

1. IF n < 2
   RETURN
2. FOR i = 2 TO n STEP 2
   PRINT i
```

**Time Complexity**: O(n) method 1, O(n/2) method 2
**Space Complexity**: O(1) - constant space

**Note**: Method 2 is more efficient as it only checks even numbers

### 9. Print All Odd Numbers from 1 to N
**Logic**: Iterate through range and print odd numbers
**Approach**: Check if number is not divisible by 2

**Pseudocode (Method 1)**:
```
ALGORITHM PrintOddNumbers(n)
INPUT: Integer n
OUTPUT: Prints all odd numbers from 1 to n

1. IF n < 1
   RETURN
2. FOR i = 1 TO n
   IF i % 2 ≠ 0
      PRINT i
```

**Pseudocode (Method 2 - Optimized)**:
```
ALGORITHM PrintOddNumbersOptimized(n)
INPUT: Integer n
OUTPUT: Prints all odd numbers from 1 to n

1. IF n < 1
   RETURN
2. FOR i = 1 TO n STEP 2
   PRINT i
```

**Time Complexity**: O(n) method 1, O(n/2) method 2
**Space Complexity**: O(1) - constant space

### 10. Calculate String Length Without Built-in Functions
**Logic**: Count characters until null terminator or end of string
**Approach**: Iterate through string counting characters

**Pseudocode (Iterative)**:
```
ALGORITHM StringLengthIterative(str)
INPUT: String str
OUTPUT: Length of string

1. IF str is null
   RETURN 0
2. length = 0
3. TRY
   WHILE true
      str.charAt(length)
      length = length + 1
4. CATCH StringIndexOutOfBoundsException
   RETURN length
```

**Pseudocode (Recursive)**:
```
ALGORITHM StringLengthRecursive(str)
INPUT: String str
OUTPUT: Length of string

1. IF str is null
   RETURN 0
2. RETURN StringLengthHelper(str, 0)

HELPER FUNCTION StringLengthHelper(str, index)
1. TRY
   str.charAt(index)
   RETURN 1 + StringLengthHelper(str, index + 1)
2. CATCH StringIndexOutOfBoundsException
   RETURN 0
```

**Pseudocode (Using toCharArray)**:
```
ALGORITHM StringLengthArray(str)
INPUT: String str
OUTPUT: Length of string

1. IF str is null
   RETURN 0
2. charArray = str.toCharArray()
3. RETURN charArray.length
```

**Time Complexity**: O(n) - where n is string length
**Space Complexity**: O(1) iterative, O(n) recursive, O(n) array method

**Note**: Exception handling approach is used since Java doesn't have null-terminated strings

## Recursion Fundamentals

### Key Principles
1. **Base Case**: Must have at least one case that doesn't recurse
2. **Progress**: Each recursive call should move toward base case
3. **Self-Similarity**: Problem can be broken into similar subproblems

### Common Recursion Patterns
```java
// Linear recursion
public int linearRecursion(int n) {
    if (n <= 1) return baseValue;  // Base case
    return operation(n, linearRecursion(n-1));  // Recursive case
}

// Binary recursion
public int binaryRecursion(int n) {
    if (n <= 1) return baseValue;  // Base case
    return combine(binaryRecursion(n/2), binaryRecursion(n/2));  // Two recursive calls
}
```

### Recursion vs Iteration Trade-offs
**Recursion Advantages**:
- More intuitive for certain problems
- Cleaner code for complex problems
- Natural for tree/graph traversal

**Recursion Disadvantages**:
- Higher memory usage (call stack)
- Potential stack overflow
- Generally slower due to function call overhead

## Important Tips and Best Practices

### Function Design
- **Single Responsibility**: Each function should do one thing well
- **Meaningful Names**: Use descriptive function names
- **Parameter Validation**: Check input parameters
- **Return Values**: Be consistent with return types

### Recursion Guidelines
- **Always define base case** first
- **Ensure progress** toward base case
- **Consider iterative alternative** for better performance
- **Watch for stack overflow** with deep recursion

### Common Pitfalls
- **Missing base case**: Causes infinite recursion
- **No progress toward base case**: Causes infinite recursion
- **Stack overflow**: Too many recursive calls
- **Inefficient recursion**: Repeated calculations (like naive Fibonacci)

### Performance Considerations
- **Tail recursion**: Some languages optimize this (Java doesn't)
- **Memoization**: Cache results to avoid repeated calculations
- **Choose appropriate approach**: Consider time/space trade-offs

## Additional Preparation Notes

### Memory Management
- **Stack frames**: Each function call creates stack frame
- **Local variables**: Stored in function's stack frame
- **Return addresses**: Stored for function returns

### Debugging Recursion
- **Trace execution**: Follow recursive calls step by step
- **Print statements**: Add debug prints to understand flow
- **Base case testing**: Verify base cases work correctly

### Mathematical Functions
- **Factorial**: n! = n × (n-1)!
- **Fibonacci**: F(n) = F(n-1) + F(n-2)
- **Power**: x^n = x × x^(n-1)
- **GCD**: gcd(a,b) = gcd(b, a mod b)

### Interview Tips
- **Understand the problem**: Clarify requirements and constraints
- **Start simple**: Begin with iterative solution if easier
- **Explain approach**: Walk through logic before coding
- **Test with examples**: Use small inputs to verify logic
- **Consider edge cases**: Handle boundary conditions

### Practice Strategy
1. **Master basic recursion** concepts first
2. **Practice both approaches** (iterative and recursive)
3. **Understand time/space complexity** trade-offs
4. **Learn to identify** when recursion is appropriate
5. **Practice debugging** recursive functions

### Common Time Complexities
- **O(1)**: Direct calculations
- **O(log n)**: Binary operations, GCD
- **O(n)**: Linear operations, single loops
- **O(n²)**: Nested operations
- **O(2ⁿ)**: Exponential (inefficient recursion)

### When to Use Recursion
- **Tree/Graph traversal**: Natural recursive structure
- **Divide and conquer**: Problem can be split into subproblems
- **Mathematical definitions**: Naturally defined recursively
- **Backtracking**: Exploring all possibilities

### When to Avoid Recursion
- **Simple iterations**: When loop is more straightforward
- **Performance critical**: When memory/speed is crucial
- **Deep recursion**: Risk of stack overflow
- **Repeated subproblems**: Without memoization

Remember: Functions and recursion are fundamental programming concepts. Master the basics before tackling complex recursive algorithms!