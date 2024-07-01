package Week5;

public class Task5 {
    public static void main(String[] args) {
        /* 1. Make a method to check if a number is prime or not. */
        int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        /* 2. Make a method to check if a given number n is even or not. */
        int number1 = 20;
        if (isEven(number1)){
            System.out.println(number1 + " is even");
        }else{
            System.out.println(number1 + " is not even");
        }

        /* 3. Make a method to print the table of a given number n. */
        int n = 5; 
        table(n);

        /* 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.*/
        int a = 2;
        int b = 3;
        int c = 4;
        int result = multiply(a, b, c);
        System.out.println("The result of multiplying " + a + ", " + b + ", and " + c + " is: " + result);   

        /* 5. Write a program for calculating Simple Interest using a method and print the result from the method itself. */
        double principal = 1000;
        double rate = 5; 
        double time = 2; 
        SimpleInterest(principal, rate, time); 

        /* 6. Write a program to calculate the area of a rectangle using a method of your choice. */
        double length = 10;
        double breath = 6;
        AreaRectangle(length, breath);

        /* 7. Calculates the factorial of a given number using the Java method. */
            int number2 = 5; 
            long result1 = factorial(number2); 
            System.out.println("The factorial of " + number2 + " is: " + result1);
        
        /* 8. Calculate the nth Fibonacci number using the method.*/
        int n1 = 10; 
        int result2 = fibonacci(n1); // Calling the fibonacci method
        System.out.println("The " + n1 + "th Fibonacci number is: " + result2);

        /* 9. Write a Java program to find the greatest common divisor (GCD) of two numbers. */
        int a2 = 56; 
        int b2 = 98; 
        int result3 = gcd(a2, b2);
        System.out.println("The GCD of " + a2 + " and " + b2 + " is: " + result3);

        /* 10. Write a Java program to display all prime numbers less than a given number 
           and count all the prime numbers less than that number using functions.  
           Your program should contain two functions: 
           a. print_prime_less_than that takes a number as a parameter and prints the prime number less than that number 
           b. is_prime that takes a number as a parameter and then returns whether that number is prime. */

           int num1 = 50;
           printPrimeLessThan(num1); 
    }

    /* 1. Make a method to check if a number is prime or not. */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                 return false;
            }
        }
        return true;
    }

    /* 2. Make a method to check if a given number n is even or not. */
    public static boolean isEven(int number1){
        if(number1 % 2 == 0 ){
            return true;
        }
        if (number1 % 2 != 0){
            return false;
        }  
        return true;  
    }

    /* 3. Make a method to print the table of a given number n. */
    public static void table(int n){
        System.out.println("Multiplication Table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    /* 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.*/
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    /* 5. Write a program for calculating Simple Interest using a method and print the result from the method itself. */
    public static void SimpleInterest(double principal, double rate, double time) {
        double SI = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + SI);
    }

    /* 6. Write a program to calculate the area of a rectangle using a method of your choice. */
    public static void AreaRectangle(double length , double breath){
        double area = length * breath;
        System.out.println("area of rectangle is " + area);
    }

    /* 7. Calculates the factorial of a given number using the Java method. */
    public static long factorial(int number2) {
        if (number2 == 0) {
            return 1;
        }
        long result1 = 1;
        for (int i = 1; i <= number2; i++) {
            result1 *= i;
        }
        return result1;
    }

    /* 8. Calculate the nth Fibonacci number using the method.*/
    public static int fibonacci(int n1) {
        if (n1 <= 1) {
            return n1;
        }
        int a1 = 0, b1 = 1;
        for (int i = 2; i <= n1; i++) {
            int temp = a1 + b1;
            a1 = b1;
            b1 = temp;
        }
        return b1;
    }

    /* 9. Write a Java program to find the greatest common divisor (GCD) of two numbers. */
    public static int gcd(int a2, int b2) {
        while (b2 != 0) {
            int temp = b2;
            b2 = a2 % b2;
            a2 = temp;
        }
        return a2;
    }

    /* 10. Write a Java program to display all prime numbers less than a given number 
       and count all the prime numbers less than that number using functions.  
       Your program should contain two functions: 
       a. print_prime_less_than that takes a number as a parameter and prints the prime number less than that number 
       b. is_prime that takes a number as a parameter and then returns whether that number is prime. */

    public static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeLessThan(int num1) {
        int count = 0;
        System.out.println("Prime numbers less than " + num1 + ":");
        for (int i = 2; i < num1; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers less than " + num1 + ": " + count);
    }
   



}
    















