# Java String Manipulation - Learning Guide

## Core Concepts

### What are Strings?
Strings in Java are immutable objects that represent sequences of characters. They are reference types stored in heap memory with special optimizations like string pooling.

### Key Properties
- **Immutable**: Once created, cannot be changed (operations return new strings)
- **String Pool**: Literal strings are stored in a special memory area for reuse
- **Unicode Support**: Supports international characters
- **Zero-indexed**: Characters accessed using index starting from 0

### Declaration and Common Operations
```java
// Declaration
String str = "Hello";
String str2 = new String("Hello");

// Common operations
str.length()           // Get length
str.charAt(index)      // Get character at index
str.substring(start)   // Get substring from start
str.toUpperCase()      // Convert to uppercase
str.toLowerCase()      // Convert to lowercase
str.trim()            // Remove leading/trailing whitespace
```

### Important Classes
- **String**: Immutable string class
- **StringBuilder**: Mutable string buffer (thread-safe)
- **StringBuffer**: Mutable string buffer (not thread-safe, faster)

## Problem-Solving Approaches

### 1. Check if String is Palindrome
**Logic**: Compare characters from both ends moving inward
**Approach**:
- Use two pointers from start and end
- Compare characters while moving pointers inward
- Return false if any mismatch found

**Pseudocode**:
```
ALGORITHM IsPalindrome(str)
INPUT: String str
OUTPUT: Boolean indicating if string is palindrome

1. IF str is null
   RETURN false
2. str = str.toLowerCase()  // Case insensitive
3. left = 0
4. right = str.length() - 1
5. WHILE left < right
   IF str.charAt(left) ≠ str.charAt(right)
      RETURN false
   left = left + 1
   right = right - 1
6. RETURN true
```

**Time Complexity**: O(n) - check each character once
**Space Complexity**: O(1) - only pointer variables

**Variations**: 
- Case-sensitive vs case-insensitive
- Ignore spaces and punctuation
- Use StringBuilder reverse method

### 2. Count Vowels in String
**Logic**: Traverse string and count vowel characters
**Approach**:
- Define vowels (a, e, i, o, u)
- Traverse string character by character
- Count matches with vowel set

**Pseudocode**:
```
ALGORITHM CountVowels(str)
INPUT: String str
OUTPUT: Count of vowels in string

1. IF str is null OR str.length() = 0
   RETURN 0
2. vowels = "aeiouAEIOU"
3. count = 0
4. FOR i = 0 TO str.length() - 1
   IF vowels.contains(str.charAt(i))
      count = count + 1
5. RETURN count
```

**Time Complexity**: O(n) - traverse string once
**Space Complexity**: O(1) - constant space for vowel set

**Optimization**: Use HashSet for vowels for O(1) lookup

### 3. Remove All Spaces from String
**Logic**: Build new string without space characters
**Approach**:
- Use StringBuilder for efficient concatenation
- Skip space characters during traversal
- Return built string

**Pseudocode**:
```
ALGORITHM RemoveSpaces(str)
INPUT: String str
OUTPUT: String with all spaces removed

1. IF str is null
   RETURN null
2. result = new StringBuilder()
3. FOR i = 0 TO str.length() - 1
   IF str.charAt(i) ≠ ' '
      result.append(str.charAt(i))
4. RETURN result.toString()
```

**Time Complexity**: O(n) - process each character
**Space Complexity**: O(n) - StringBuilder storage

**Alternative**: Use `str.replace(" ", "")` - O(n) time, simpler code

### 4. Convert String to Uppercase
**Logic**: Use built-in Java method or manual conversion
**Approach**:
- Use String.toUpperCase() method
- Or manually convert using ASCII values

**Pseudocode (Built-in)**:
```
ALGORITHM ToUpperCase(str)
INPUT: String str
OUTPUT: String converted to uppercase

1. IF str is null
   RETURN null
2. RETURN str.toUpperCase()
```

**Pseudocode (Manual)**:
```
ALGORITHM ToUpperCaseManual(str)
INPUT: String str
OUTPUT: String converted to uppercase

1. IF str is null
   RETURN null
2. result = new StringBuilder()
3. FOR i = 0 TO str.length() - 1
   char ch = str.charAt(i)
   IF ch >= 'a' AND ch <= 'z'
      result.append((char)(ch - 32))
   ELSE
      result.append(ch)
4. RETURN result.toString()
```

**Time Complexity**: O(n) - process each character
**Space Complexity**: O(n) - new string creation

**Note**: Built-in method handles Unicode properly

### 5. Convert String to Lowercase
**Logic**: Similar to uppercase conversion
**Approach**:
- Use String.toLowerCase() method
- Or manually convert using ASCII values

**Pseudocode (Built-in)**:
```
ALGORITHM ToLowerCase(str)
INPUT: String str
OUTPUT: String converted to lowercase

1. IF str is null
   RETURN null
2. RETURN str.toLowerCase()
```

**Pseudocode (Manual)**:
```
ALGORITHM ToLowerCaseManual(str)
INPUT: String str
OUTPUT: String converted to lowercase

1. IF str is null
   RETURN null
2. result = new StringBuilder()
3. FOR i = 0 TO str.length() - 1
   char ch = str.charAt(i)
   IF ch >= 'A' AND ch <= 'Z'
      result.append((char)(ch + 32))
   ELSE
      result.append(ch)
4. RETURN result.toString()
```

**Time Complexity**: O(n) - process each character
**Space Complexity**: O(n) - new string creation

### 6. Reverse a String
**Logic**: Build string in reverse order
**Approach**:
- Use StringBuilder with reverse() method
- Or manually build reversed string

**Pseudocode (StringBuilder)**:
```
ALGORITHM ReverseString(str)
INPUT: String str
OUTPUT: Reversed string

1. IF str is null
   RETURN null
2. RETURN new StringBuilder(str).reverse().toString()
```

**Pseudocode (Manual)**:
```
ALGORITHM ReverseStringManual(str)
INPUT: String str
OUTPUT: Reversed string

1. IF str is null
   RETURN null
2. result = new StringBuilder()
3. FOR i = str.length() - 1 DOWN TO 0
   result.append(str.charAt(i))
4. RETURN result.toString()
```

**Time Complexity**: O(n) - process each character
**Space Complexity**: O(n) - new string storage

**Alternative**: Two-pointer approach with char array

### 7. Check if Two Strings are Anagrams
**Logic**: Anagrams have same characters with same frequency
**Approach**:
- Sort both strings and compare
- Or count character frequencies

**Pseudocode (Sorting)**:
```
ALGORITHM AreAnagrams(str1, str2)
INPUT: String str1, String str2
OUTPUT: Boolean indicating if strings are anagrams

1. IF str1 is null OR str2 is null
   RETURN false
2. IF str1.length() ≠ str2.length()
   RETURN false
3. str1 = str1.toLowerCase()
4. str2 = str2.toLowerCase()
5. sortedStr1 = sort(str1.toCharArray())
6. sortedStr2 = sort(str2.toCharArray())
7. RETURN sortedStr1.equals(sortedStr2)
```

**Pseudocode (Frequency Count)**:
```
ALGORITHM AreAnagramsFrequency(str1, str2)
INPUT: String str1, String str2
OUTPUT: Boolean indicating if strings are anagrams

1. IF str1 is null OR str2 is null
   RETURN false
2. IF str1.length() ≠ str2.length()
   RETURN false
3. frequency = new int[256]  // ASCII characters
4. FOR i = 0 TO str1.length() - 1
   frequency[str1.charAt(i)]++
   frequency[str2.charAt(i)]--
5. FOR i = 0 TO 255
   IF frequency[i] ≠ 0
      RETURN false
6. RETURN true
```

**Time Complexity**: O(n log n) for sorting, O(n) for frequency
**Space Complexity**: O(1) for frequency array, O(n) for sorting

### 8. Find First Non-Repeated Character
**Logic**: Count frequency of each character, find first with count 1
**Approach**:
- Use HashMap to count character frequencies
- Traverse string again to find first character with count 1

**Pseudocode**:
```
ALGORITHM FirstNonRepeatedChar(str)
INPUT: String str
OUTPUT: First non-repeated character or null

1. IF str is null OR str.length() = 0
   RETURN null
2. frequency = new HashMap<Character, Integer>()
3. FOR i = 0 TO str.length() - 1
   char ch = str.charAt(i)
   frequency.put(ch, frequency.getOrDefault(ch, 0) + 1)
4. FOR i = 0 TO str.length() - 1
   IF frequency.get(str.charAt(i)) = 1
      RETURN str.charAt(i)
5. RETURN null
```

**Time Complexity**: O(n) - two passes through string
**Space Complexity**: O(k) - where k is number of unique characters

**Alternative**: Use array for ASCII characters (O(1) space for limited charset)

### 9. Count Number of Words
**Logic**: Split string by whitespace and count parts
**Approach**:
- Use built-in split method
- Or manually count word boundaries

**Pseudocode (Split method)**:
```
ALGORITHM CountWords(str)
INPUT: String str
OUTPUT: Number of words in string

1. IF str is null OR str.trim().length() = 0
   RETURN 0
2. words = str.trim().split("\\s+")
3. RETURN words.length
```

**Pseudocode (Manual)**:
```
ALGORITHM CountWordsManual(str)
INPUT: String str
OUTPUT: Number of words in string

1. IF str is null OR str.trim().length() = 0
   RETURN 0
2. str = str.trim()
3. wordCount = 0
4. inWord = false
5. FOR i = 0 TO str.length() - 1
   IF str.charAt(i) ≠ ' '
      IF NOT inWord
         wordCount = wordCount + 1
         inWord = true
   ELSE
      inWord = false
6. RETURN wordCount
```

**Time Complexity**: O(n) - traverse string once
**Space Complexity**: O(n) for split method, O(1) for manual

### 10. Replace All Spaces with Underscores
**Logic**: Replace each space character with underscore
**Approach**:
- Use built-in replace method
- Or manually build new string

**Pseudocode (Built-in)**:
```
ALGORITHM ReplaceSpacesWithUnderscores(str)
INPUT: String str
OUTPUT: String with spaces replaced by underscores

1. IF str is null
   RETURN null
2. RETURN str.replace(" ", "_")
```

**Pseudocode (Manual)**:
```
ALGORITHM ReplaceSpacesManual(str)
INPUT: String str
OUTPUT: String with spaces replaced by underscores

1. IF str is null
   RETURN null
2. result = new StringBuilder()
3. FOR i = 0 TO str.length() - 1
   IF str.charAt(i) = ' '
      result.append('_')
   ELSE
      result.append(str.charAt(i))
4. RETURN result.toString()
```

**Time Complexity**: O(n) - process each character
**Space Complexity**: O(n) - new string creation

## Common Patterns and Techniques

### Two Pointers for String Problems
```java
int left = 0, right = str.length() - 1;
while (left < right) {
    // Compare or process characters
    // Move pointers based on condition
}
```

### StringBuilder for String Building
```java
StringBuilder sb = new StringBuilder();
for (char c : str.toCharArray()) {
    // Process character and append
    sb.append(processedChar);
}
return sb.toString();
```

### Character Frequency Counting
```java
Map<Character, Integer> freq = new HashMap<>();
for (char c : str.toCharArray()) {
    freq.put(c, freq.getOrDefault(c, 0) + 1);
}
```

### ASCII Array for Character Counting
```java
int[] count = new int[256]; // For ASCII characters
for (char c : str.toCharArray()) {
    count[c]++;
}
```

## Important Tips and Best Practices

### String Immutability
- Every string operation creates new string object
- Use StringBuilder for multiple concatenations
- Avoid string concatenation in loops

### Performance Considerations
- **StringBuilder vs String**: Use StringBuilder for multiple operations
- **String Pool**: Literal strings are pooled for memory efficiency
- **Character Arrays**: Sometimes more efficient for in-place operations

### Input Validation
```java
if (str == null || str.isEmpty()) {
    // Handle null or empty string
}
```

### Common Pitfalls
- **NullPointerException**: Always check for null strings
- **Case Sensitivity**: Consider case-insensitive operations
- **Unicode Issues**: Be aware of international characters
- **Performance**: Avoid creating unnecessary string objects

### Memory Management
- Strings are stored in heap memory
- String literals use string pool
- Large strings can impact memory usage

## Additional Preparation Notes

### Character Methods
- `Character.isLetter(ch)`: Check if character is letter
- `Character.isDigit(ch)`: Check if character is digit
- `Character.isWhitespace(ch)`: Check if character is whitespace
- `Character.toLowerCase(ch)`: Convert character to lowercase

### String Methods to Remember
- `str.length()`: Get string length
- `str.charAt(index)`: Get character at index
- `str.substring(start, end)`: Get substring
- `str.indexOf(ch)`: Find first occurrence of character
- `str.contains(substr)`: Check if string contains substring

### Regular Expressions
- `str.matches(regex)`: Check if string matches pattern
- `str.replaceAll(regex, replacement)`: Replace using regex
- `str.split(regex)`: Split string using regex

### Interview Tips
- **Clarify Requirements**: Ask about case sensitivity, special characters
- **Edge Cases**: Handle null, empty strings, single character
- **Efficiency**: Choose appropriate data structures and algorithms
- **Space vs Time**: Consider trade-offs between approaches

### Practice Strategy
1. **Master basic operations** first
2. **Understand immutability** and its implications
3. **Practice with edge cases** (null, empty, single char)
4. **Learn when to use** StringBuilder vs String
5. **Time yourself** on implementations

### Common Time Complexities
- **O(1)**: Character access, basic operations
- **O(n)**: Single pass operations, linear search
- **O(n²)**: Nested loops, substring operations
- **O(n log n)**: Sorting-based solutions

### Space Complexity Patterns
- **O(1)**: In-place operations, constant extra space
- **O(n)**: Creating new strings, using data structures
- **O(k)**: Where k is size of character set or unique elements

### Unicode Considerations
- Java strings support Unicode (UTF-16)
- Be careful with character comparisons
- Some characters may require multiple char values
- Use `Character` class methods for proper handling

Remember: String manipulation is fundamental to many programming tasks. Master these patterns and you'll be well-prepared for more complex string algorithms!