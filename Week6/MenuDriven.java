package Week6;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuDriven {
    private static ArrayList<Integer> grades = new ArrayList<>();
    /*2. Develop a simple menu-driven student grading system program in Java that operates on an array of student grades. 
    The program will display a Menu with those options and prompt the user to choose his/her option.
    The program should provide the functionalities:
    1.    Add a grade to the system
    2.    Display all grades
    3.    Calculate the average grade
    4.    Find the highest grade
    5.    Find the lowest grade
    6.    Exit the program
    Note: Based on the user's selection, the program will perform the corresponding operation 
    and display the result or carry out the desired action. 
    The program will continue to show the menu until the user chooses the option to exit.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a grade to the system");
            System.out.println("2. Display all grades");
            System.out.println("3. Calculate the average grade");
            System.out.println("4. Find the highest grade");
            System.out.println("5. Find the lowest grade");
            System.out.println("6. Exit the program");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addGrade(scanner);
                    break;
                case 2:
                    displayGrades();
                    break;
                case 3:
                    calculateAverageGrade();
                    break;
                case 4:
                    findHighestGrade();
                    break;
                case 5:
                    findLowestGrade();
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

    private static void addGrade(Scanner scanner) {
        System.out.print("Enter the grade to add: ");
        int grade = scanner.nextInt();
        grades.add(grade);
        System.out.println("Grade added.");
    }

    private static void displayGrades() {
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
        } else {
            System.out.println("Grades:");
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }

    private static void calculateAverageGrade() {
        if (grades.isEmpty()) {
            System.out.println("No grades available to calculate average.");
        } else {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = (double) sum / grades.size();
            System.out.println("Average grade: " + average);
        }
    }

    private static void findHighestGrade() {
        if (grades.isEmpty()) {
            System.out.println("No grades available to find highest grade.");
        } else {
            int highest = grades.get(0);
            for (int grade : grades) {
                if (grade > highest) {
                    highest = grade;
                }
            }
            System.out.println("Highest grade: " + highest);
        }
    } 
    private static void findLowestGrade() {
        if (grades.isEmpty()) {
            System.out.println("No grades available to find lowest grade.");
        } else {
            int lowest = grades.get(0);
            for (int grade : grades) {
                if (grade < lowest) {
                    lowest = grade;
                }
            }
            System.out.println("Lowest grade: " + lowest);
        }
    }
    
}
