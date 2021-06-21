## Paint Job

Bob is a wall painter, and he needs your help. You have to write a program that helps Bob
calculate how many buckets of paint he needs to buy before going to work. Bob might also have some
extra buckets at home. He also knows the area he can cover with one bucket of paint.

1. Write a method named **getBuckedCount** with 4 parameters. The first parameter should be 
named width of type double. This parameter represents the width of the wall.
   
The second parameter should be named **height** of type double. This parameter represents the hight of the wall

The third parameter should be named **areaPerBucket**. This parameter represents the area that
can be covered with one bucket of paint.

The fourth parameter should be named **extraBucked**. This parameter represents the bucket
count that Bob has at home.

The method needs to return a value of type **int** that represents the number of buckets that
Bob needs to buy before going to work. To calculate the buckets count, refer to the note below.

If one of the parameters **width, height or areaPerBucket is less of equal to 0 or if extraBuckets
is less than 0**, the method needs to **return -1** to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

#### EXAMPLES OF INPUT / OUTPUT:
> **getBucketCount(-3.4, 2.1, 1.5, 2);** should return -1 since the width param is invalid
> 
> **getBucketCount(3.4, 2.1, 1.5, 2);** should return 3 
> 
> **getBucketCount(2.75, 3.25, 2.5, 1);** should return 3

2. Bob does not like to enter 0 for the **extraBucket** parameter, so he needs another method.

Write another overloaded method named **getBucketCount** with 3 parameters namely width, height,
and areaPerBucket all of type double.

This method needs to return a value of type int that represents the number of buckets that Bob
needs to buy before going to work. 

If one of the parameters is less than 0, the method needs to return -1 to indicate an invalid
value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

#### EXAMPLE OF INPUT / OUTPUT:
> **getBucketCount(-3.4, 2.1, 1.5);** should return -1
> 
> **getBucketCount(3.4, 2.1, 1.5);** should return 5
> 
> **getBucketCount(7.25, 4.3, 2.35);** should return 14

3. In some cases, Bob does not know the width and height of wall but he knows the area of a wall.
He needs you to write another method.
   
Write another overloaded method with 2 parameters called **area and areaPerBucket** both of type double.

The method needs to return a value of type int that represents the number of buckets that Bob
needs to buy before going to work.

If one of the parameters is less or equal to 0, the method needs to return -1.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

#### EXAMPLE OF INPUT / OUTPUT:
> **getBucketCount(3.4, 1.5);** should return 3
> 
> **getBucketCount(6.26, 2.2);** should return 3
> 
> **getBucketCount(3.26, 0.75);** should return 5
