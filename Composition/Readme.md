## Composition

#### Directions:

This is an exercise in **Class Composition**. To complete the exersice, you must create five classes
with associated member variables and methods.

The five classes should be created as follow:

1) Create a class and name it **Lamp**. Inside this class should be declared three member variables 
   **style** of type String, **battery** of type boolean, and **globRating** of type int. All variables  should be marked **private**.
   A constructor needs to be created witch accepts the three member variables as 
   parameters. In addition, for methods should also be created: **turnOn()** has no return typr and should print a 
   message that lamp is being turned on; **getStyle** return the lamp style; **isBattery** return the value of battery;
   and **getGlobRatirng()** return the **globRating** of the lamp.
   
2)  Create a class and name it **Bed**. Five **private** member variables should be declared **style** of 
    type String, and **pillows, height, sheets, quilt** of type int. A constructor should be codded which
    accepts the five member variables as parameters. Also, six methods should be defined -> 
    **make()** has no return type and prints a message to the effect that the bed is being made;
    **getStyle()** which returns tha value of **style**; 
    **getPillows()** returns the number of **pilows**;
    **getHight()** returns the **height** of the bed;
    **getSheets()** returns the number of **sheets** on the bed;
    and **getQuilt()** returns the value of quits.
    
3) Create a class with the name **Ceiling**. There are two members variables for this one, height and
paintedColor, both of type int. There should also be a constructor which accepts both member variables as parameters.
   There are also two additional methods which should be defined.
   **getHeight()** shall return the value of height and **getPaintedColor()** should return the value of
   paintedColor.
   
4) Create a class with the name **Wall**. It contains one member variable, direction, and is of type String.
A constructor for **Wall** should accept one parameter for the member variable **direction**. A getter 
   should also be defined for the **direction** field called **getDirection()**.
   
5) Create a class with the name **Bedroom**. This class contains eight member variables.
Name of type String, wall1, wall2, wall3, wall4 of type Wall, ceiling of type Ceiling, bed of type Bed,
   and lamp of type Lamp. The class constructor should accept all eight of the member variables as 
   parameters, and there should also be two addictional methods.
   **getLamp()** wich returns an object of type **Lamp**, and **makeBed()** which prints a message
   that the bed is being made and also calls the **make()** method in the **Bed** class.
    