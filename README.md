# Dice-Roller

# Introduction
This program allows the user to specify a die with n number of sides (in the constructor) and then randomly rolls that die and outputs the number rolled to the console. The user can specify how many sides the Die has: 4, 6, 8, 10, 12, 20, or 100. 

# Implementation
This program contains two classes: "Die.java" and "Main.java". 

## "Die.java" 
### Methods
*   private int dieValue, dieFaces: private variables to hold the value of the die and the number of faces the die has.
*  private Random random: Random object created to randomly "roll" the die.
*  Die(int faces): the constructor for Die.java and initializes the value of the die and how many faces the die has. 
*  int roll(): sets (and returns) the face value to a uniform random number between 1 and the number of faces. 
*  int getFaceValue(): returns the current face value of the die. 
*  int getNumFaces(): returns the number of faces of the die. 
*  String toString(): returns the string representation of the face value.

##"Main.java" 
In the Main class, I create a new Die object to simulate the roll of a die. 

#How to run Die.java
I assume you have the Java Development Kit installed on your machine, so you will just run this like any other java program: 
  1.  Open the command prompt in the directory containing "Main.java" and "Die.java". 
  2.  Compile the Main class by typing: "javac Main.java" and hit enter in the command prompt. 
  3.  Now that the program is compiled, run it by typing "java Main" and hit enter.

