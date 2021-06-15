## Last Digit Checker

Write a method named **hasSameLastDigit** with three parameters of type **int**.

Each number should be within the range of **10(inclusive) - 1000(inclusive)**. If one of the
numbers is **not within the range**, the method should return false.

The method should return true if al least two of the numbers share the same rightmost digit, otherwise, it
should return false.

#### Example of INPUT / OUTPUT:
> **hasSameLastDigit(41, 22, 71);** should return TRUE since 1 is the rightmost digit in numbers 41 and 71
> 
> **hasSameLastDigit(23, 32, 42);** should return TRUE since 2 is the rightmost digit in numbers 32 and 42
> 
> **hasSameLastDigit(9, 99, 999);** should return FALSE since 9 is not within the range of 10 - 1000
> 

Write another method named **isValid** with one parameter of type **int**.

The method needs to return TRUE if the number parameter is in range of 10 - 1000, otherwise return FALSE.

#### Example of INPUT / OUTPUT:
> **isValid(10);** should return TRUE
> 
> **isValid(468);** should return TRUE
> 
> **isValid(1051);** should return FALSE