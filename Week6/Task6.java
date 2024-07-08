package Week6;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        // One Dimensional Array:
        /*1. Write a Java program to calculate the average value of array element.*/
        int[] numbers = new int[]{20, 30, 60};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 


        /* 2. Write a Java program to test if an array contains a specific value. */
        int[] num = {1, 2, 3, 4, 5, 6};
        int valueToFind = 3;
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == valueToFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The array contains the value: " + valueToFind);
        } else {
            System.out.println("The array does not contain the value: " + valueToFind);
        }

        /* 3. Write a Java program to find the maximum and minimum value of an array. */
        int[] num1 = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < num1.length; i++) {
            if (num1[i] > max) {
                max = num1[i];
            }
            if (num1[i] < min) {
                min = num1[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        
       /* 4. Write a Java program to revers the element of a one-dimensional array. */
       int[] num2 = {1, 2, 3, 4, 5, 6, 7};
       System.out.println("Original array:");
       for (int number : num2) {
           System.out.print(number + " ");
       }
       System.out.println();
       
       // Reverse the array
       int n = num2.length;
       for (int i = 0; i < n / 2; i++) {
           int temp = num2[i];
           num2[i] = num2[n - 1 - i];
           num2[n - 1 - i] = temp;
       }
       
       System.out.println("Reversed array:");
       for (int number : num2) {
           System.out.print(number + " ");
       }

   // Two Dimensional Array
   /* 1. Write a java program to Add two 2x3 matrices */
   int[][] matrix1 = {
    {1, 2, 3},
    {4, 5, 6}
    };
    int[][] matrix2 = {
    {7, 8, 9},
    {10, 11, 12}
    };
    int rows = 2;
    int columns = 3;
    int[][] result = new int[rows][columns];

    // Adding two matrices
    for (int k = 0; k < rows; k++) {
        for (int j = 0; j < columns; j++) {
            result[k][j] = matrix1[k][j] + matrix2[k][j];
        }
    }
    // Displaying the result
    System.out.println("\nSum of the two matrices is: ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
           System.out.print(result[i][j] + " ");
        }
    System.out.println();
    }

    /*2. Write a java program to print transpose 2X2 matrices*/
    int[][] matrix = {
        {1, 2},
        {3, 4}
    };

    System.out.println("Original Matrix:");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("Transposed Matrix:");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(matrix[j][i] + " ");
        }
        System.out.println();
    }

    /* 3. Write a java program to print mirror 2X2 matrices */
    int[][] matrix3 = {
        {1, 2},
        {3, 4}
    };

    System.out.println("Original Matrix:");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(matrix3[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("Mirror Image Matrix:");
    for (int i = 0; i < 2; i++) {
        for (int j = 1; j >= 0; j--) {
            System.out.print(matrix3[i][j] + " ");
        }
        System.out.println();
    }

    /* 4. Write a java program to Multiply two 2x3 matrices */
    // Define the first 2x3 matrix
    int[][] matrix10 = {
         {1, 2, 3},
         {4, 5, 6}
    };

    // Define the second 3x2 matrix
    int[][] matrix11 = {
        {7, 8},
        {9, 10},
        {11, 12}
    };

    // Initialize the result matrix with the dimensions 2x2
    int[][] result1 = new int[2][2];

    // Perform matrix multiplication
    for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 3; k++) {
                result1[i][j] += matrix10[i][k] * matrix11[k][j];
            }
         }
     }

    // Print the result matrix
    System.out.println("Resultant Matrix:");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(result1[i][j] + " ");
        }
        System.out.println();
    }

     // ArrayList
     /* 1. Write code that creates an ArrayList that can hold string objects. 
      * Add the names of three cars to the ArrayList, and then display the contents of the ArrayList. */
    // Create an ArrayList to hold string objects
    ArrayList<String> carList = new ArrayList<>();

    // Add the names of three cars to the ArrayList
    carList.add("Toyota");
    carList.add("Honda");
    carList.add("Ford");

    // Display the contents of the ArrayList
    System.out.println("Car List:");
    for (String car : carList) {
        System.out.println(car);
    }

    
    /* 2. WAP to sort the integer elements of array of size 10 in ascending and descending order using ArrayList. */
    // Initialize an array of size 10
    int[] array = {34, 7, 23, 32, 5, 62, 73, 3, 1, 45};

    // Convert the array to an ArrayList
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int element : array) {
        arrayList.add(element);
    }

    // Sort in ascending order
    Collections.sort(arrayList);
    System.out.println("Sorted in Ascending Order:");
    for (int element : arrayList) {
        System.out.print(element + " ");
    }
    System.out.println();

    // Sort in descending order
    Collections.sort(arrayList, Collections.reverseOrder());
    System.out.println("Sorted in Descending Order:");
    for (int element : arrayList) {
        System.out.print(element + " ");
    }
}
}


   












