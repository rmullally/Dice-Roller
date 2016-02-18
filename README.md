# Dice-Roller

# Introduction
This program allows the user to specify a die with n number of sides (in the constructor) and then randomly rolls that die and outputs the number rolled to the console. The user can specify how many sides the Die has: 4, 6, 8, 10, 12, 20, or 100. 

# Implementation
This program contains two classes: "Die.java" and "Main.java". 

##"Die.java" 
*private Random random: Random object to randomly "roll" the value of the die. 
*private int dieValue: dieFaces: private variables to hold the value of the die and the number of faces the die has.
*Die(int faces): the constructor for Die.java and initializes the value of the die and how many faces the die has. 
*int roll(): sets (and returns) the face value to a uniform random number between 1 and the number of faces. 
*int getFaceValue(): returns the current face value of the die. 
*int getNumFaces(): returns the number of faces of the die. 
*String toString(): returns the string representation of the face value.

##"Main.java" 
In the Main class, I create a new Die object to simulate the roll of a die. 

