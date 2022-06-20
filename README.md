# MakeChangeProject

##Description
Here is my Make change project. The program will ask you for the price of the item you would like to purchase, as well as how much money you gave. Then it takes that information figures out the correct change and what bills to give you in the most efficient way. Nobody wants a stack of pennies when a quarter would be enough.


## Technologies used
I used a variety of techniques to get my code running.
A the beginning I created a scanner and asked the user for input.

I then took the users input and used a Ternary Condition to evaluate: 
	if the Item cost was more than the tendered amount or 
	if the item cost was equal to the tendered amount or 
	if the tendered amount is more than the Item cost in which we need change.
	
Then I used a switch to steer the program between Exact change, Not enough messages and to the change method I created.

I created a method to help figure out what the correct change would be and assign which bills we need. 

I used a while loop and an if statement in this method to get the program to cycle through and add a counter for each bill as well as subtract that amount from the change left over

This continued until there was no more change left over and I pushed it to a seperate method to print the change statement.

The print change method is pretty simple just a long series of if and else if statements.
If the customer needs more than 1, 20 then print the number + " Twenty dollar bills, "
if the customer needs only 1 of a 20 print (the number + " Twenty dollar bill, " (Notice no s, because its no longer plural.
if the customer doesn't need a 20 it moves to the next bill.

etc.

Additionally I added an extra method that would ask the user if they would like to do another transaction to help with testing. This method was just another while loop and switch statement. I did need to use a method that could receive information such as my scanner and return information.

##What I Learned

I have learned so much this past week to make this process possible!

I needed to learn how to pass information to a method, set up if/else if/else statements, use a while loop, create a ternary condition. A lot of learning went into this.

An issue that I encountered was getting my doubles to have an accurate outcome. I occasionally had it jipping the customer 1 penny and I don't think I know a great solution for that however I decided to multiply the numbers by 100 when completing the math section of this code, particularly in my method to create change.

Another issue I faced was how to change the statement from "1 five dollar bills" to "1 five dollar bill". and making the program leave out any bills that we did not need. 