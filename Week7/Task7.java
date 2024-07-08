package Week7;

public class Task7 {
    public static void main(String[] args) {
        /*1. Write a Java program to create a class called "Circle" with a radius attribute. 
        You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.*/
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        circle.setRadius(10.0);
        System.out.println("New Radius: " + circle.getRadius());
        System.out.println("New Area: " + circle.calculateArea());
        System.out.println("New Circumference: " + circle.calculateCircumference());

        /*2. Write a Java program to create a class called “Simple Interest” with a data fields principle,
         time and rate, using setter getter method and print the values.*/
        SimpleInterest simpleInterest = new SimpleInterest();
        simpleInterest.setPrinciple(1000.0);
        simpleInterest.setTime(2.0);
        simpleInterest.setRate(5.0);
        System.out.println("Principle: " + simpleInterest.getPrinciple());
        System.out.println("Time: " + simpleInterest.getTime());
        System.out.println("Rate: " + simpleInterest.getRate());
        System.out.println("Simple Interest: " + simpleInterest.calculateInterest());

        /* 3. Write a Java program to create a class called "Dog" with a name and breed attribute. 
        Create two instances of the "Dog" class, set their attributes using the constructor and 
        modify the attributes using the setter methods and print the updated values. */
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");
        System.out.println("Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
        // Modify the attributes using the setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");
        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");
        System.out.println("Updated Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Updated Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        
        /* 4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, 
        and methods to calculate and update salary. */
        Employee employee1 = new Employee("John Doe", "Software Engineer", 75000.0);
        System.out.println("Name: " + employee1.getName() + ", Job Title: " + employee1.getJobTitle() + ", Salary: " + employee1.getSalary());
        employee1.updateSalary(10); 
        System.out.println("Updated details ,Name: " + employee1.getName() + ", Job Title: " + employee1.getJobTitle() + ", Salary: " + employee1.getSalary());
    }
}



class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    // Getter method for principle
    public double getPrinciple() {
        return principle;
    }

    // Setter method for principle
    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    // Getter method for time
    public double getTime() {
        return time;
    }

    // Setter method for time
    public void setTime(double time) {
        this.time = time;
    }

    // Getter method for rate
    public double getRate() {
        return rate;
    }

    // Setter method for rate
    public void setRate(double rate) {
        this.rate = rate;
    }

    // Method to calculate simple interest
    public double calculateInterest() {
        return (principle * time * rate) / 100;
    }
}

class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for breed
    public String getBreed() {
        return breed;
    }

    // Setter method for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Setter method for job title
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to update salary by a percentage
    public void updateSalary(double percentage) {
        this.salary += this.salary * percentage / 100;
    }
}

      
    

