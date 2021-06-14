## First And Last Digit Sum

Write a method named **sumFirstAndLastDigit** with one parameter ot type **int** called **number**.

The method needs to find the first and the last digit of the parameter **number** passed to the 
method, using a loop and return the sum of the first and the last digit of the number.

If the **number** is negative then method needs to return -1 to indicate an invalid value.

#### Example INPUT / OUTPUT:
> **sumFirstAndLastDigit(252);** should **return 4**
> 
> **sumFirstAndLastDigit(257);** should **return 9**
> 
> **sumFirstAndLastDigit(0);** should **return 0**
> 
> **sumFirstAndLastDigit(5);** should **return 10** since we only have 1 digit -> 5 + 5 = 10
> 
> **sumFirstAndLastDigit(-10);** should **return -1**