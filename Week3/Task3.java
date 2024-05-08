package Week3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* . Write a JAVA program to find the maximum between three numbers. */
         Scanner scan = new Scanner (System.in);
         System.out.println("enter 1st number");
         int number1 = scan.nextInt();
         System.out.println("enter 2nd number");
         int number2 = scan.nextInt();
         System.out.println("enter 3rd number");
         int number3 = scan.nextInt();
         scan.close();
         if(number1 > number2 && number1 > number3){
            System.out.println("maximum = " + number1);
        }else if(number2 > number1 && number2 > number3){
            System.out.println("maximum = " + number2);
        }else{
            System.out.println("maximum = " + number3);
        }


        /* 2. Write a JAVA program to check whether a number is negative, positive, or zero. */
        Scanner scan1 = new Scanner (System.in);
        System.out.println("enter a number");
        int number = scan1.nextInt();
        scan1.close();
        if(number < 0){
            System.out.println("it's negative");
        }else if(number > 0){
            System.out.println("it's positive");
        }else if(number == 0){
            System.out.println("it's zero");
        }


        /* 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        Scanner scan2 = new Scanner (System.in);
        System.out.println("enter a number");
        int num = scan2.nextInt();
        scan2.close();
        if(num % 5 == 0 && num % 11 == 0 ){
            System.out.println("it is divisible by 5 and 11");
        }else{
            System.out.println("it is not divisible by 5 and 11");
        }


        /* 4. Write a JAVA program to check whether a number is even or odd. */
        Scanner scan3 = new Scanner (System.in);
        System.out.println("enter a number");
        int num1 = scan3.nextInt();
        scan3.close();
        if(num1%2 == 0){
            System.out.println("Even");
        }else if(num1%2 != 0){
            System.out.println("Odd");
        }


        /* 5. Write a JAVA program to check whether a year is a leap year or not. 
         * Hint: if year%4==0; if year%100!==0 ; year%400==0; */
        Scanner scan4 = new Scanner (System.in);
        System.out.println("enter the year");
        int year = scan4.nextInt();
        scan4.close();
        if(year%4 == 0 &&  year%100 != 0 || year%400 == 0 ){
            System.out.println("it is a leap year");  
        }else{
            System.out.println("it is not leap year");
        }


        /* 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        Scanner scan5 = new Scanner (System.in);
        System.out.println("enter the alphabet");
        String alphabet = scan5.next();
        scan5.close();
        if(alphabet == "a" || alphabet ==  "e" || alphabet == "i" || alphabet == "o" || alphabet == "u"){
            System.out.println(" it is vowel");
        }else{
            System.out.println("it is consonant");
        }



        /* 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value.
         * Use a switch case statement to handle different grades. */
        Scanner scan6 = new Scanner (System.in);
        System.out.println("enter the grade");
        String grade = scan6.nextLine();
        scan6.close();
        switch (grade){
            case "A":
               System.out.println("4.0");
               break;
            case "B":
               System.out.println("3.0");
               break;
            case "C":
                System.out.println("2.0");
                break;
            case "D":
                System.out.println("1.0");
                break;
            case "F" :
                System.out.println("0.0");
                break;
            default:
                System.out.println("Invalid");
                break;
        }




        /* 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs
         * and performs the corresponding arithmetic operation using a switch case statement. */
        Scanner scan7 = new Scanner (System.in);
        System.out.println("enter first number");
        int num2 = scan7.nextInt();
        System.out.println("enter second number");
        int num3 = scan7.nextInt();
        System.out.println("enter the operator");
        char operator = scan7.next().charAt(0);
        scan7.close();
        switch(operator){
            case '+':
               System.out.println(num2 + num3);
               break;
            case '-':
               System.out.println(num2 - num3);
               break;
            case '*':
               System.out.println(num2 * num3);
               break;
            case '/':
               System.out.println(num2 / num3);
               break;
            default:
               System.out.println("Invalid");
               break;
        }




        /* 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season 
         * (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        Scanner scan8 = new Scanner (System.in);
        System.out.println("enter the integer");
        int month = scan8.nextInt();
        scan8.close();
        switch(month){
            case 1,2,3:
              System.out.println("Winter");
              break;
            case 4,5,6:
              System.out.println("Spring");
              break;
            case 7,8,9:
              System.out.println("Summer");
              break;
            case 10,11,12:
              System.out.println("Fall");
              break;
            default:
              System.out.println("Invalid");
              break;

        }



        /* 4. Implement a Java program that calculates the area of different shapes 
         * (circle, rectangle, square, triangle) based on the user's choice using a switch case.*/
        Scanner scan9 = new Scanner (System.in);
        System.out.println("Choose a shape to calculate its area:");
        System.out.println(" Circle");
        System.out.println(" Rectangle");
        System.out.println(" Square");
        System.out.println(" Triangle");
        int choice = scan9.nextInt();
        switch(choice){
            case 1:
              System.out.println("enter radius");
              double radius = scan9.nextDouble();
              double area_of_circle = 22/7 * radius * radius;
              System.out.println("area of circle is" + area_of_circle);
              break;
            case 2:
              System.out.print("Enter length of rectangle");
              double length = scan9.nextDouble();
              System.out.print("Enter breadth of rectangle");
              double breadth = scan9.nextDouble();
              double area_of_rectangle = length * breadth;
              System.out.println("Area of rectangle: " + area_of_rectangle);
              break;
            case 3:
              System.out.print("Enter the length of square: ");
              double length1 = scan9.nextDouble();
              double area_of_square = length1 * length1;
              System.out.println("Area of square: " + area_of_square);
              break;
            case 4:
                System.out.print("Enter base of triangle: ");
                double base = scan9.nextDouble();
                System.out.print("Enter the height of triangle: ");
                double height = scan9.nextDouble();
                double area_of_triangle = (base * height)/2;
                System.out.println("Area of triangle: " + area_of_triangle);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scan9.close();



    }
}
   

        
 
 
           
               
          
            
 
   

