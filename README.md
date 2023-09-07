# Turnkey_Test_Corrections
A.
The program can now prompt the user to key in an input and then prints a fibonacci sequence not exceeding the user input.
I have made a few changes to the program
# 1. Intoducing a maxAllowableValue variable beyond which no any other value is printed in the sequence. This is to meet the requirement that the sequence is suppose to be printed upto the user input.
# 2. Introducing valiables a, b and c, where a and b represents the two previous values in the sequence while the variable c is used to generate the next value in the sequence.
# With a continuous generations in the sequence, to calculate the next Fibonacci number, we will need to update a and b as follows: a should be set equal to the previous value of b, 
meaning it now represents the Fibonacci number before the current one and b should be set equal to the value of c, which is the next Fibonacci number you want to calculate.

B. For Springboot questions

1.Bean - I would describe a bean as a class which contains objects and the objects have properties which are notable within that specific bean.
2 Methods of dependency injection:
Dependency injection is a technique which allows objects and functions to receive and use other objects and their functions. It can be done in the following ways;
   a. Constuctor injection - This invloves the dependency being injected in an object's constructor.
   b. Method injection - the dependency is passed to an object via it's method(s).
   c. Property injection -  The dependency is injected via object properties moreso setter properties.
