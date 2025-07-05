# Java Quick Syntax Reference

## Basic Program Structure
```java
public class Main {
    public static void main(String[] args) {
        // Your code here
    }
}
```

## Input/Output Operations

### Printing Output
```java
// Basic print (stays on same line)
System.out.print("Hello ");
System.out.print("World");

// Print with new line
System.out.println("Hello World");

// Print with formatting
System.out.printf("Name: %s, Age: %d, GPA: %.2f\n", "John", 20, 3.75);
```

### Reading Input
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading different types
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        scanner.close(); // Always close scanner
    }
}
```

## Variables and Data Types

### Primitive Data Types
```java
// Integer types
byte b = 127;           // -128 to 127
short s = 32000;        // -32,768 to 32,767
int i = 2147483647;     // -2^31 to 2^31-1
long l = 9223372036854775807L; // -2^63 to 2^63-1

// Floating point
float f = 3.14f;        // 32-bit floating point
double d = 3.14159;     // 64-bit floating point

// Character and Boolean
char c = 'A';           // Single character
boolean bool = true;    // true or false

// String (not primitive, but commonly used)
String str = "Hello World";
```

### Variable Declaration
```java
// Declaration and initialization
int x = 10;
int y, z;               // Multiple variables
y = 20;
z = 30;

// Constants
final int MAX_SIZE = 100;
```

## Type Conversions

### Automatic (Implicit) Conversion
```java
int i = 100;
double d = i;           // int to double (widening)
```

### Manual (Explicit) Conversion
```java
double d = 3.14159;
int i = (int) d;        // double to int (narrowing) - loses decimal

// String conversions
String str = "123";
int num = Integer.parseInt(str);        // String to int
double dbl = Double.parseDouble(str);   // String to double

// Number to String
int number = 42;
String text = String.valueOf(number);   // or Integer.toString(number)
```

## Print Formatting

### printf() Format Specifiers
```java
int age = 25;
String name = "Alice";
double salary = 50000.50;

// Common format specifiers
System.out.printf("Name: %s\n", name);              // %s for String
System.out.printf("Age: %d\n", age);                // %d for decimal integer
System.out.printf("Salary: $%.2f\n", salary);       // %f for float/double
System.out.printf("Character: %c\n", 'A');          // %c for character
System.out.printf("Boolean: %b\n", true);           // %b for boolean
System.out.printf("Hexadecimal: %x\n", 255);        // %x for hex

// Width and alignment
System.out.printf("Right aligned: %10s\n", name);   // 10 character width
System.out.printf("Left aligned: %-10s|\n", name);  // Left aligned
System.out.printf("Zero padded: %05d\n", age);      // Zero padding
```

## Methods

### Defining and Calling Methods
```java
public class Main {
    public static void main(String[] args) {
        // Calling methods
        greet();
        greet("Alice");
        
        int result = add(5, 3);
        System.out.println("Sum: " + result);
        
        double area = calculateArea(5.0);
        System.out.println("Area: " + area);
    }
    
    // Method with no parameters, no return
    public static void greet() {
        System.out.println("Hello!");
    }
    
    // Method with parameter, no return
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with different parameter types
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
```

### Method Overloading
```java
public static int multiply(int a, int b) {
    return a * b;
}

public static double multiply(double a, double b) {
    return a * b;
}

public static int multiply(int a, int b, int c) {
    return a * b * c;
}
```

## Control Structures

### Conditional Statements
```java
int score = 85;

// if-else
if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}

// switch statement
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}
```

### Loops
```java
// for loop
for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);
}

// while loop
int j = 0;
while (j < 5) {
    System.out.println("While: " + j);
    j++;
}

// do-while loop
int k = 0;
do {
    System.out.println("Do-while: " + k);
    k++;
} while (k < 5);

// Enhanced for loop (for arrays)
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```

## Arrays

### Array Declaration and Initialization
```java
// Declaration and initialization
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"Alice", "Bob", "Charlie"};

// Alternative declaration
int[] ages = new int[5];        // Array of 5 integers (default value 0)
ages[0] = 25;
ages[1] = 30;

// Array length
System.out.println("Array length: " + numbers.length);

// Accessing elements
System.out.println("First element: " + numbers[0]);
System.out.println("Last element: " + numbers[numbers.length - 1]);
```

## String Operations

### Common String Methods
```java
String str = "Hello World";

// Basic operations
System.out.println("Length: " + str.length());
System.out.println("Upper case: " + str.toUpperCase());
System.out.println("Lower case: " + str.toLowerCase());
System.out.println("Character at index 0: " + str.charAt(0));
System.out.println("Substring: " + str.substring(0, 5));

// String comparison
String str1 = "hello";
String str2 = "hello";
String str3 = "Hello";

System.out.println("str1 equals str2: " + str1.equals(str2));
System.out.println("str1 equals str3: " + str1.equals(str3));
System.out.println("str1 equals str3 (ignore case): " + str1.equalsIgnoreCase(str3));
```

## Basic Math Operations

### Arithmetic Operators
```java
int a = 10, b = 3;

System.out.println("Addition: " + (a + b));        // 13
System.out.println("Subtraction: " + (a - b));     // 7
System.out.println("Multiplication: " + (a * b));  // 30
System.out.println("Division: " + (a / b));        // 3 (integer division)
System.out.println("Modulo: " + (a % b));          // 1
System.out.println("Division (double): " + (a / (double)b)); // 3.333...
```

### Math Class Methods
```java
System.out.println("Square root of 16: " + Math.sqrt(16));
System.out.println("Power (2^3): " + Math.pow(2, 3));
System.out.println("Absolute value: " + Math.abs(-5));
System.out.println("Maximum: " + Math.max(10, 20));
System.out.println("Minimum: " + Math.min(10, 20));
System.out.println("Random number: " + Math.random()); // 0.0 to 1.0
```

## Exception Handling

### Try-Catch Block
```java
try {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    System.out.println("You entered: " + number);
} catch (Exception e) {
    System.out.println("Invalid input! Please enter a valid number.");
}
```

## Complete Example Program

```java
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get student information
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Calculate total and average
        double total = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.printf("Enter marks for subject %d: ", i);
            double marks = scanner.nextDouble();
            total += marks;
        }
        
        double average = total / numSubjects;
        char grade = calculateGrade(average);
        
        // Display results
        displayResult(name, total, average, grade);
        
        scanner.close();
    }
    
    // Method to calculate grade
    public static char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
    
    // Method to display results
    public static void displayResult(String name, double total, double average, char grade) {
        System.out.println("\n--- Student Report ---");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Total Marks: %.2f\n", total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Grade: %c\n", grade);
    }
}
```

## Key Tips

1. **Always close Scanner objects** to prevent resource leaks
2. **Use meaningful variable names** for better code readability
3. **Handle exceptions** when dealing with user input
4. **Use proper indentation** for code clarity
5. **Comment your code** to explain complex logic
6. **Follow naming conventions**: 
   - Classes: PascalCase (e.g., `StudentGradeCalculator`)
   - Methods and variables: camelCase (e.g., `calculateGrade`)
   - Constants: UPPER_CASE (e.g., `MAX_SIZE`)

This reference covers the essential Java syntax you'll need for basic programming tasks!