## Perfect Number

**What is a perfect number?**
A perfect number is a positive integer which is equal to the sum if its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving 
a remainder and exclude the perfect number itself.

For example, number 6:
It's proper divisors are 1,2 and 3 and the sum of it's proper divisors is 1 + 2 + 3 = 6.

Write a method named **isPerfectNumber** with one parameter of type **int** named number.

**If number < 1**, the method should return FALSE.

The method should calculate if the number is perfect and return TRUE, otherwise return FALSE.

#### Example of INPUT / OUTPUT:
> **isPerfectNumber(6):** should return TRUE
> 
> **isPerfectNumber(28):** should return TRUE
> 
> **isPerfectNumber(5):** should return FALSE
> 
> **isPerfectNumber(-1):** should return FALSE