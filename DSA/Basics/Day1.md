# Day 1: Java Logic and Flow Control - Learning Guide

## Core Concepts Overview

### Conditionals
- **if-else statements**: Execute code based on boolean conditions
- **else if chains**: Handle multiple conditions sequentially
- **ternary operator**: Compact conditional assignment `condition ? value1 : value2`
- **switch statements**: Multi-way branching for discrete values

### Loops
- **for loop**: Best for known iteration count
- **while loop**: Best for condition-based iteration
- **do-while loop**: Executes at least once before checking condition

### Basic Operators
- **Arithmetic**: `+`, `-`, `*`, `/`, `%` (modulo)
- **Comparison**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Logical**: `&&` (AND), `||` (OR), `!` (NOT)

## Problem-by-Problem Logic and Optimization

### 1. Find the Largest of Three Numbers
**Logic Approach:**
- Compare first two numbers, store the larger
- Compare the result with the third number
- Alternative: Use nested ternary operators for concise solution

**Syntax Pattern:**
```java
if (a > b && a > c) {
    // a is largest
} else if (b > c) {
    // b is largest
} else {
    // c is largest
}
```

**Optimization Notes:**
- **Time Complexity**: O(1) - constant time, maximum 2 comparisons
- **Space Complexity**: O(1) - no additional space needed
- **Tip**: Avoid using `Math.max()` twice as it's less efficient than direct comparison

### 2. Check if a Number is Even or Odd
**Logic Approach:**
- Use modulo operator `%` to check remainder when divided by 2
- If remainder is 0, number is even; otherwise odd

**Syntax Pattern:**
```java
if (number % 2 == 0) {
    // Even
} else {
    // Odd
}
```

**Optimization Notes:**
- **Time Complexity**: O(1) - single modulo operation
- **Space Complexity**: O(1) - no additional space
- **Tip**: Bitwise AND with 1 `(number & 1) == 0` is slightly faster but less readable

### 3. Sum of All Numbers from 1 to N (Using Loop)
**Logic Approach:**
- Initialize sum to 0
- Iterate from 1 to N, adding each number to sum
- Alternative: Use mathematical formula `n*(n+1)/2` for O(1) solution

**Syntax Pattern:**
```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

**Optimization Notes:**
- **Time Complexity**: O(n) with loop, O(1) with formula
- **Space Complexity**: O(1) - only storing sum and counter
- **Tip**: For large N, use the formula to avoid overflow and improve performance

### 4. Print All Numbers from 1 to N
**Logic Approach:**
- Use a simple for loop from 1 to N
- Print each number in the iteration

**Syntax Pattern:**
```java
for (int i = 1; i <= n; i++) {
    System.out.println(i);
}
```

**Optimization Notes:**
- **Time Complexity**: O(n) - must print each number
- **Space Complexity**: O(1) - no additional storage
- **Tip**: Use `System.out.print()` with spaces for horizontal output

### 5. Check if a Number is Divisible by 5
**Logic Approach:**
- Use modulo operator with 5
- If remainder is 0, the number is divisible by 5

**Syntax Pattern:**
```java
if (number % 5 == 0) {
    // Divisible by 5
}
```

**Optimization Notes:**
- **Time Complexity**: O(1) - single modulo operation
- **Space Complexity**: O(1) - no additional space
- **Tip**: Can also check if last digit is 0 or 5 for slightly better performance

### 6. Find the Absolute Difference Between Two Numbers
**Logic Approach:**
- Subtract smaller from larger to avoid negative result
- Use conditional logic or `Math.abs()` function

**Syntax Pattern:**
```java
int difference = (a > b) ? a - b : b - a;
// Or: int difference = Math.abs(a - b);
```

**Optimization Notes:**
- **Time Complexity**: O(1) - single subtraction and comparison
- **Space Complexity**: O(1) - no additional space
- **Tip**: Conditional approach is slightly faster than `Math.abs()` but less readable

### 7. Print Multiplication Table for a Given Number
**Logic Approach:**
- Use a loop from 1 to 10 (or desired range)
- Multiply the given number by each loop counter

**Syntax Pattern:**
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(number + " x " + i + " = " + (number * i));
}
```

**Optimization Notes:**
- **Time Complexity**: O(k) where k is the range (typically 10)
- **Space Complexity**: O(1) - no additional storage
- **Tip**: Pre-format strings for better performance if printing many tables

### 8. Check if a Number is Positive, Negative, or Zero
**Logic Approach:**
- Use if-else chain to check three conditions
- Check for zero first, then positive/negative

**Syntax Pattern:**
```java
if (number == 0) {
    // Zero
} else if (number > 0) {
    // Positive
} else {
    // Negative
}
```

**Optimization Notes:**
- **Time Complexity**: O(1) - maximum 2 comparisons
- **Space Complexity**: O(1) - no additional space
- **Tip**: Order conditions by most likely case first for better average performance

### 9. Find the Remainder When a Number is Divided by 3
**Logic Approach:**
- Direct application of modulo operator
- Handle negative numbers if needed

**Syntax Pattern:**
```java
int remainder = number % 3;
```

**Optimization Notes:**
- **Time Complexity**: O(1) - single modulo operation
- **Space Complexity**: O(1) - storing only the result
- **Tip**: In Java, modulo with negative numbers preserves the sign of the dividend

### 10. Check if a Number is Divisible by Both 2 and 3
**Logic Approach:**
- Check divisibility by 2 AND divisibility by 3
- Equivalent to checking divisibility by 6 (LCM of 2 and 3)

**Syntax Pattern:**
```java
if (number % 2 == 0 && number % 3 == 0) {
    // Divisible by both
}
// Or optimized:
if (number % 6 == 0) {
    // Divisible by both
}
```

**Optimization Notes:**
- **Time Complexity**: O(1) - one or two modulo operations
- **Space Complexity**: O(1) - no additional space
- **Tip**: Single modulo by 6 is more efficient than two separate checks

## General Learning Tips

### Performance Optimization
1. **Avoid unnecessary operations**: Don't repeat calculations
2. **Use appropriate data types**: `int` for most cases, `long` for large numbers
3. **Minimize method calls**: Direct operations are faster than library functions
4. **Consider mathematical shortcuts**: Formulas often beat iterative approaches

### Code Quality
1. **Use meaningful variable names**: `sum` instead of `s`
2. **Add input validation**: Check for edge cases like negative numbers
3. **Follow consistent formatting**: Proper indentation and spacing
4. **Comment complex logic**: Explain the "why" not just the "what"

### Common Pitfalls to Avoid
1. **Integer overflow**: Be careful with large numbers in calculations
2. **Off-by-one errors**: Pay attention to `<` vs `<=` in loops
3. **Modulo with negative numbers**: Results might be unexpected
4. **Infinite loops**: Always ensure loop conditions will eventually be false

### Testing Strategy
1. **Test edge cases**: 0, negative numbers, maximum values
2. **Test typical cases**: Normal positive integers
3. **Test boundary conditions**: Very large or very small valid inputs
4. **Verify time complexity**: Ensure solutions scale properly with input size

## Key Takeaways
- Master the basic operators and control structures before moving to complex problems
- Always consider both time and space complexity when designing solutions
- Simple, readable code is often better than overly clever optimizations
- Practice with different input ranges to understand performance characteristics
- Build a habit of testing edge cases early in your development process