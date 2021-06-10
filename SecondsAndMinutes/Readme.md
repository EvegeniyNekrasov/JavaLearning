## Seconds and Minutes Challenge

Create a method called **getDurationString** with two
parameters, first param **minutes**, and the 2nd param **seconds**.

You should validate that the **first parameter minutes is >= 0**.
You should validate that the **2nd parameter seconds is >= 0 and <=59**.

The method should **return "Invalid Value"** in the method if either of the 
above are not true.

If the **parameters are valid** then calculate how many hours minutes and seconds
equals the  minutes and seconds passed to this method and **return that values as 
string in format "XXh YYm ZZs"** where XX represents a number of hours, YY the minutes 
and ZZ the seconds.

Create a **2nd method of the same name but with only one paramether seconds**.

**Validate that it is >= 0, and return "Invalid Value" if it's not true**.

If it's valid, then calculate how many minutes are in the seconds value and then call
the other overloaded method passing the correct minutes and seconds calculated so that
it can calculate correctly.

Call both methods to print values to the seconds.

#### Tips:
> Use int or long for your number data types is probably a good idea
> 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
> Methods should be static.