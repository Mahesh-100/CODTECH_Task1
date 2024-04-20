Documentation for SimpleCalculator.java

1. Introduction:
   
The Calculator program is a simple Java application that allows users to perform basic arithmetic operations (addition, subtraction, multiplication, division) as well as exponentiation.
It provides a user-friendly interface where users can input numbers and select the desired operation. Additionally, the program includes error handling to prevent division by zero.

3. Installation:
   
To run the Calculator program:
1.Ensure you have Java Development Kit (JDK) installed on your system.
2.Download the Calculator.java file.
3.Open a command prompt or terminal.
4.Navigate to the directory containing the Calculator.java file.
5.Compile the program using the command: 'javac SimpleCalculator.java'
6.Run the program using the command: 'java SimpleCalculator'

5. Code Explanation:
   
Main Class: SimpleCalculator
The main class Calculator controls the flow of the program. It includes a main method where user interactions are handled using a Scanner object.
Arithmetic Operations:
Each arithmetic operation (addition, subtraction, multiplication, division, exponentiation) is implemented within a switch-case statement. 
User input is taken for the numbers involved in the operation, and the result is calculated accordingly.
Quit Option:
The program includes an option to quit, which terminates the program loop when selected by the user.

4.Screenshots

1.Initial Display:

![sc1](https://github.com/Mahesh-100/CODTECH_Task1/assets/124244425/fe64268c-bca5-4041-8a8c-490d413b04de)




2.Addition Operation:



![sc2](https://github.com/Mahesh-100/CODTECH_Task1/assets/124244425/2f9ad110-da88-4043-93c4-43260510a494)


3.Division by Zero Error Handling:


![3](https://github.com/Mahesh-100/CODTECH_Task1/assets/124244425/3a9e21d5-3102-49e6-be2b-c59be2c4a27f)


4.Quit Option:


![sc4](https://github.com/Mahesh-100/CODTECH_Task1/assets/124244425/27027a65-169c-46e4-80df-f3ecd4085c96)

6. Conclusion:

The Calculator program provides a simple yet functional tool for performing arithmetic calculations.
With its user-friendly interface and error handling capabilities, it ensures a seamless user experience. Further enhancements could include additional mathematical functions and a more polished user interface.
<==================================================================>

Documentation for Calculator Java Project.

Introduction:

The Calculator program is a basic calculator application implemented in Java using the Swing framework. It provides a user-friendly interface for performing arithmetic calculations.

Features:
1.Addition, subtraction, multiplication, and division operations
2.Decimal point support for floating-point numbers
3.Clear and delete functionality for input correction
4.Ability to toggle the sign of the displayed number
5.Exponential operation (added as per the latest modification)

User Interface:
The user interface consists of the following components:

1.Textfield: Displays the input numbers and the result of calculations.
2.Number Buttons: Allow the user to input numerical digits.
3.Function Buttons: Perform arithmetic operations and other functions.
4.Clear (CLR) Button: Clears the textfield.
5.Delete (DEL) Button: Deletes the last entered digit.
6.Negative (NEG) Button: Toggles the sign of the displayed number.
7.Decimal (DEC) Button: Adds a decimal point to the displayed number.
8.Exponential (EXP) Button: Performs exponentiation.

Code Explanation
The code is structured into several parts:

 Initialization:

The Swing components are initialized, including the JFrame, textfield, buttons, and panel.

Action listeners are added to the buttons to handle user interactions.

Action Performed:

The actionPerformed method handles button click events.

It processes each button click and performs the corresponding action, such as appending digits to the textfield, performing arithmetic operations, or executing other functions like clearing or deleting input.

Arithmetic Operations:

Arithmetic operations (addition, subtraction, multiplication, and division) are implemented using switch statements.

The result of the calculation is displayed in the textfield.



Screenshots
![calc](https://github.com/Mahesh-100/CODTECH_Task1/assets/124244425/fee5f3f6-0b7b-4088-a5bf-282d5b490c32)

Conclusion:

The Calculator program provides a simple yet effective tool for performing basic arithmetic calculations. With its intuitive user interface and essential features, it serves as a handy utility for everyday mathematical tasks.

for Detail documentation of each and every class and method of this java project, documentation which is attached in that project is done by javadoc. Please take a look. 



