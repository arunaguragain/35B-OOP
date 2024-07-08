package Week6;
import java.util.Scanner;
public class MenuDrivenApplication {
     /*1. Develop a simple menu-driven application in Java that operates on an array of elements. 
    The program will display a Menu with those options and prompt the user to choose his/her option.
    The program should provide the functionalities:
    1.    Add an element to the array
    2.    Display all the elements of the array
    3.    Reverse the elements of the array
    4.    Find the largest element of the array
    5.    Find the smallest element of the array
    6.    Exit the program
    Note: Based on the user's selection, the program will perform the corresponding 
    operation and display the result or carry out the desired action. 
    The program will continue to show the menu until the user chooses the option to exit. */
    private static int[] array = new int[0];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add an element to the array");
            System.out.println("2. Display all the elements of the array");
            System.out.println("3. Reverse the elements of the array");
            System.out.println("4. Find the largest element of the array");
            System.out.println("5. Find the smallest element of the array");
            System.out.println("6. Exit the program");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addElement(scanner);
                    break;
                case 2:
                    displayElements();
                    break;
                case 3:
                    reverseElements();
                    break;
                case 4:
                    findLargestElement();
                    break;
                case 5:
                    findSmallestElement();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addElement(Scanner scanner) {
        System.out.print("Enter the element to add: ");
        int element = scanner.nextInt();
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        array = newArray;
        System.out.println("Element added.");
    }

    private static void displayElements() {
        if (array.length == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Elements of the array:");
            for (int elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    private static void reverseElements() {
        if (array.length == 0) {
            System.out.println("Array is empty.");
        } else {
            int[] reversedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            array = reversedArray;
            System.out.println("Array reversed.");
        }
    }

    private static void findLargestElement() {
        if (array.length == 0) {
            System.out.println("Array is empty.");
        } else {
            int largest = array[0];
            for (int elem : array) {
                if (elem > largest) {
                    largest = elem;
                }
            }
            System.out.println("Largest element: " + largest);
        }
    }

    private static void findSmallestElement() {
        if (array.length == 0) {
            System.out.println("Array is empty.");
        } else {
            int smallest = array[0];
            for (int elem : array) {
                if (elem < smallest) {
                    smallest = elem;
                }
            }
            System.out.println("Smallest element: " + smallest);
        }
        
    }
    
}



    
    
















