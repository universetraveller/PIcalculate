# PIcalculate
A Pi calculate project from abeginner
Environment:JDK18;
Language:Java;
Updates log:
--------------
ver1:PiTest
Using the riemann's zeta function to calculate Pi,and design a simple loop to realize it
Drawbacks:1.convergence is very bad;
          2.use "double" as number code,easy to overflow.
          
--------------
ver2:PiTest2
Using Bigdecimal to process calculation,would not overflow like ver1;
Drawbacks:Still has a bad convergence;

--------------
ver3:PiTest3
Using new method "Circumcision" to calculate Pi,solving the problem of convergence,it is quicker than ver2
moreover set the type-in number:loop number and accuracy
when loop 100 times,accuracy set as 1000,it could calculate the 53 digit after the point of Pi

--------------
ver4:PiTest4
updates new functions:1.user could choose to reserve how many decimals;
                      2.set a timer to time the calculation;
                      3.using array to simplify the code.
