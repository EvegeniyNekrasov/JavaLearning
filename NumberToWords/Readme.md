## Number to Words

Write a method called **numberToWords** with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".

**To print the number as words, follow these steps**:
1. Extract tha last digit of the given number using the remainder operator.
2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for 
that digit, those being 0,1,2,3,4,5,6,7,8,9. Print the corresponding word for each digit,
   e.g.print "Zero" if the digit is 0, "One" if 1, and so on.
   
3. Remove the last digit from the number.
4. Repeat Steps 2 though 4 until the number is 0.

The logic above is correct, but in it's current state, the words will be printed in reverse order. For
example, if the number is 234, the logic above will produce the output "Four Three Two" instead of
"Two Three Four". To overcome this problem, write a second method called **reverse**.

The method **reverse** should have one int parameter and **return the reversed number(int)**. For
example, if the number passed is 234, then the reversed number should be 432. The method **reverse**
should also reverse negative numbers.

Use the method **reverse** within the method **numberToWords** in order to print the words
int the correct order.

Another thing to keep in mind is any reversed number with leading zeroes(e.g the reversed number
fo 100 is 001). The logic above for the method **numberToWord** will print **"One"**, but that is
incorrect. It should print "One Zero Zero". To solve this problem, write a  third method called
**getDigitCount**.

The method **getDigitCount** should have one int parameter called **number** and **return the count
of the digits in the number**. If the number is negative, **return -1** to indicate an invalid value.

#### Example INPUT / OUTPUT - getDigitCount method:
> **getDigitCount(0);** should return 1
> **getDigitCount(123);** should return 3
> **getDigitCount(12);** should return -1
> **getDigitCount(5200);** should return 4

#### Example INPUT / OUTPUT - reverse method:
> **reverse(-121);** should return -121
> **reverse(1212);** should return 2121
> **reverse(1234);** should return 4321
> **reverse(100);** should return 1

#### Example INPUT / OUTPUT - numberToWords method:
> **numberToWords(123);** should print "One Two Three"
> **numberToWords(1010);** should print "One Zero One Zero"
> **numberToWords(1000);** should print "One Zero Zero Zero" 
> **numberToWords(-12);** should print "Invalid Value"