package Week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter yur age");
        int age = scan.nextInt();
        int eligibleage = 18;
        boolean rExpression =  age >=  eligibleage;
        System.out.println("can cast vote" + rExpression);
        System.out.println("Cannot cast vote" + (age < eligibleage));
        scan.close();


        /* 2. Write a program to calculate SI. 
         * Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter Principle amout");
        double PrincipleAmount = scan1.nextDouble();
        System.out.println("Enter Time");
        Double Time = scan1.nextDouble();
        System.out.println("Enter Rate");
        double Rate = scan1.nextDouble();
        System.out.println("simple interest = " + PrincipleAmount*Time*Rate/100);
        scan1.close();


        /* 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
         * Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter the base of triangle");
        double base = scan2.nextDouble();
        System.out.println("Enter the height of triangle");
        double height = scan2.nextDouble();
        System.out.println("Enter the side of cube");
        double side = scan2.nextDouble();
        System.out.println("Enter length of cuboid");
        double length = scan2.nextDouble();
        System.out.println("Enter width of cuboid");
        double width = scan2.nextDouble();
        System.out.println("Enter height of cuboid");
        double height1 = scan2.nextDouble();
        System.out.println("Area of triangle =" + (base*height)/2);
        System.out.println("Volume of Cube =" + side*side*side);
        System.out.println("Volume of Cuboid =" + length*width*height1);
        scan2.close();

        /* 4. Write the ternary operator for question no. 1 */
        Scanner scan3 = new Scanner (System.in);
        System.out.println("enter your age");
        int age1 = scan3.nextInt();
        int eligibleage1 = 18;
        String output;
        output = age1 >= eligibleage1 ? "Can cast vote" : "Cannot cast vote";
        System.out.println(output);
        scan3.close();

        /* 5. Write a program to take two integer inputs from the user and print the sum and product of them.*/
        Scanner scan4  = new Scanner (System.in);
        System.out.println("enter the first integer");
        int integer1 = scan4.nextInt();
        System.out.println("enter the second integer");
        int integer2 = scan4.nextInt();
        System.out.println("the sum is " + (integer1 + integer2));
        System.out.println("the product is " + integer1*integer2);
        scan4.close();

        /* 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two.
         * Finally, calculate the division of the thus obtained sum and product and print the result. */
        Scanner scan5  = new Scanner (System.in);
        System.out.println("enter the first integer");
        int integer3 = scan5.nextInt();
        System.out.println("enter the second integer");
        int integer4 = scan5.nextInt();
        int sum = (integer3 + integer4);
        int product =  integer3*integer4;
        System.out.println("the sum is " + sum );
        System.out.println("the product is " + product );
        System.out.println("the result of division is " + product/sum);
        scan5.close();

        /* 7. Take the name, roll number, and field of interest from the user and print in the format below:
         * Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        Scanner scan6 = new Scanner (System.in);
        System.out.println("enter your name?");
        String name = scan6.nextLine();
        System.out.println("enter your field of interest");
        String interest = scan6.nextLine();
        System.out.println("enter your roll number");
        int rollnumber = scan6.nextInt();
        System.out.print("Hey, my name is " + name  );
        System.out.print(" and my roll number is " +  rollnumber + "." );
        System.out.print(" My field of interest are " + interest + ".");
        scan6.close();

        /* 8. Take side of a square from user and print area and perimeter of it. 
         * Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        Scanner scan7 = new Scanner (System.in);
        System.out.println(" enter the side of square");
        int side_of_square = scan7.nextInt();
        System.out.println("the are of square is " + (side_of_square*side_of_square));
        System.out.println("the perimeter of square is " + (4*side_of_square));
        System.out.println(" enter the Principle amount ");
        double Principle_Amount = scan7.nextDouble();
        System.out.println(" enter the time");
        double time1 = scan7.nextDouble();
        System.out.println("enter the rate");
        double rate1 = scan7.nextDouble();
        System.out.println("the simple interest is" + (Principle_Amount*time1*rate1)/2);
        System.out.println("Enter the base of triangle");
        double base1 = scan7.nextDouble();
        System.out.println("Enter the height of triangle");
        double height_tri = scan7.nextDouble();
        System.out.println("Area of triangle =" + (base1*height_tri)/2);
        System.out.println("Enter the side of cube");
        double side1 = scan7.nextDouble();
        System.out.println("Volume of Cube =" + side1*side1*side1);
        System.out.println("Enter length of cuboid");
        double length1 = scan7.nextDouble();
        System.out.println("Enter width of cuboid");
        Double width1 = scan7.nextDouble();
        System.out.println("Enter height of cuboid");
        double height2 = scan7.nextDouble();
        System.out.println("Volume of Cuboid =" + length1*width1*height2);
        scan7.close();

        /* 9. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int */
        Scanner scan8 = new Scanner (System.in);
        System.out.println("enter the length");
        double length2 = scan8.nextDouble();
        System.out.println(" enter the breadth");
        double breadth2 = scan8.nextDouble();
        double intValueConvert = length2 * breadth2;
        int doubleValueConvertedToint = (int) intValueConvert;
        System.out.println("area is" + doubleValueConvertedToint);
        scan8.close(); 

        /* 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
         * And use the following conditions to generate the final result;
         * a. If equal to or more than 70 -> First Class    b. If more than 59 -> Upper Second Class
         * c. If more than 49 -> Second class               d. If more than 39 -> Third class and if below than 40 the result is fail. 
         * Hint: Use ternary operator */

         Scanner scan9 = new Scanner (System.in);
         System.out.println("enter marks of sub1");
         double sub1 = scan9.nextDouble();
         System.out.println("enter marks of sub2");
         double sub2 = scan9.nextDouble();
         System.out.println("enter marks of sub3");
         double sub3 = scan9.nextDouble();
         System.out.println("enter marks of sub1");
         double sub4 = scan9.nextDouble();
         double total_marks = sub1+sub2+sub3+sub4;
         double total_percentage = (total_marks/400) * 100;
         String output1;
         output1 = total_percentage >= 70  ? "First Class" 
         : total_percentage > 59 ? " Upper Second Class" 
         : total_percentage > 49 ? " Second Class" 
         : total_percentage > 39 ? " Third Class" : " Fail";
         System.out.println(output1);
         scan9.close();
    
    }
    
}







