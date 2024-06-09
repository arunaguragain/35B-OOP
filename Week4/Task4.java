package Week4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        scan.close();
        for(int index = 0; index <5; index++){
            System.out.println("Hello " + name);  
        }


        /*  2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
         *  Miles    Kilometers
         *  1    1.609
         *  2    3.218
         *  …    ….
         *  9    14.481
        *  10    16.090 */
        int  miles = 1;
        double kilometers = 1.609;
        System.out.println("Miles   Kilometers");
        while(miles <= 10){
            System.out.println(miles + "        " + kilometers);
            miles = miles + 1;
            kilometers = kilometers + 1.609;
        }

        /* 3. Write a program that generates the following table:  
         * Number    Square
         *  10    100
         *  9     81
         * ..    ….
         * 2    4
         *  1    1
         */ 
        int  number = 10;
        System.out.println("Number    Square");
        while(number >= 1){
            int square = number * number;
            System.out.println(number + "        " + square);
            number = number - 1;
        }

        /* 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
         *****
         *****
         *****
         *****
         ***** 
         */
        Scanner scan1= new Scanner(System.in);
        System.out.println("Enter the width");
        int width = scan1.nextInt();
        scan1.close();
        for(int index = 0; index < width; index++){
            String result = "*";
            String result1 = " ";
            for(int index1 = 0; index1 < width; index1++ ){
                result1 = result1 + result;
            }
            System.out.println(result1);
        }

        /*  5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
         *  Sample Run:
         * Enter a positive non-zero integer 4
         *  Sum of 1 to 4 is 10
         * Do you want to continue? Enter ‘y’ for yes or any other character for no.
         * y
         * Enter a positive non-zero integer 3
         * Sum of 1 to 3 is 6
         * Do you want to continue? Enter ‘y’ for yes and any other character for no.
         * n. */

         Scanner scan2 = new Scanner(System.in);
         char input;
         do{
            System.out.println("Enter a positive non-zero integer");
            int input1 = scan2.nextInt();
            int count = 1;
            int output = 0;
            while(count <= input1){
                output = count +input1;
                count =  count + 1;
            }
            System.out.println("Sum of 1 to " + input1 + " is " + output);
            System.out.println("Do you want to continue? Enter y for yes or any other character for no.");
            input = scan2.next().charAt(0);
         }while(input == 'y');
         scan2.close();


        /*  6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
         *  *
         *  ** 
         *  ***
         *  **** 
         *  *****
         *  Use a nested for loop to generate the above pattern. */
        Scanner scan3= new Scanner(System.in);
        System.out.println("Enter the width");
        int width1 = scan3.nextInt();
        scan3.close();
        for(int index = 0; index < width1; index++){
            String result = "*";
            String result1 = " ";
            for(int index1 = 0; index1 < width1; index1++ ){
                result1 = result1 + result;
                System.out.println(result1);
            }
            
        }

        /* 7. Write a program to calculate the HCF of Two given numbers. */
        Scanner scan4= new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = scan4.nextInt();
        System.out.println("Enter the num2");
        int num2 = scan4.nextInt();
        scan4.close();
        int hcf = 0;
        for(int i = 1; i <= num1 || i <= num2; i++) {
            if( num1%i == 0 && num2%i == 0 )
            hcf = i;
         }
         System.out.println("HCF of given two numbers is ::"+hcf);


         /* 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
          * For example, if the input is 12345, the output should be 54321. */
          Scanner scan5 = new Scanner(System.in);
          System.out.println("Enter an integer");
          int input2 = scan5.nextInt();
          scan5.close();
          int reverse = 0;  
          while(input2 != 0){  
             int remainder = input2 % 10;  
             reverse = reverse * 10 + remainder;  
             input2 = input2/10;  
          }  
          System.out.println( reverse);  

        /*  9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50.
         * The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.*/
          Scanner scan6= new Scanner(System.in);
          int countGreaterThan50 = 0;
          int countLessThan50 = 0;
          int countEqualTo50 = 0;
          int sumGreaterThan50 = 0;
          int sumLessThan50 = 0;
          System.out.println("Enter 10 integer numbers:");
          for (int i = 0; i < 10; i++) {
            int number1 = scan6.nextInt();

            if (number1 > 50) {
                countGreaterThan50++;
                sumGreaterThan50 += number1;
            } else if (number1 < 50) {
                countLessThan50++;
                sumLessThan50 += number1;
            } else {
                countEqualTo50++;
            }
          }

          double averageGreaterThan50 = (countGreaterThan50 > 0) ? (double) sumGreaterThan50 / countGreaterThan50 : 0;
          double averageLessThan50 = (countLessThan50 > 0) ? (double) sumLessThan50 / countLessThan50 : 0;

          System.out.println("Number of inputs greater than 50: " + countGreaterThan50);
          System.out.println("Number of inputs less than 50: " + countLessThan50);
          System.out.println("Number of inputs equal to 50: " + countEqualTo50);
          System.out.println("Average of numbers greater than 50: " + averageGreaterThan50);
          System.out.println("Average of numbers less than 50: " + averageLessThan50);

          scan6.close();



        /* 10. Write a program that asks the user for a positive nonzero integer value.
         * The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
         * For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50.*/
        Scanner scan7 = new Scanner(System.in);
        System.out.println("Enter a positive nonzero integer ");
        int positiveInt = scan7.nextInt();
        scan7.close();
            int count = 1;
            int output = 0;
            while(count <= positiveInt){
                output = count + positiveInt;
                count =  count + 1;
            }
            System.out.println("Sum of 1 to " + positiveInt + " is " + output);    


    }
}


  



