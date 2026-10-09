import java.util.*;

public class Student {
    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Method
    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

class TestVSCode {

    // Static Method
    static int square(int n) {
        return n * n;
    }

    // Recursive Method
    static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Array Method
    static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== VS Code Java Test =====");

        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // If-Else
        if (age >= 18)
            System.out.println("You are an Adult.");
        else
            System.out.println("You are a Minor.");

        // For Loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + square(i));
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count = " + count);
            count++;
        }

        // Switch
        System.out.print("\nEnter a number (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected One");
                break;
            case 2:
                System.out.println("You selected Two");
                break;
            case 3:
                System.out.println("You selected Three");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        // Array
        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);

        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("\nArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 95);
        map.put("Science", 88);
        map.put("English", 91);

        System.out.println("\nHashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Object Creation
        Student s = new Student(name, 90);

        System.out.println("\nStudent Object:");
        s.display();

        // Recursion
        System.out.println("\nFactorial of 5 = " + factorial(5));

        // Exception Handling
        try {
            int result = 100 / 5;
            System.out.println("100 / 5 = " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("\nProgram executed successfully!");
        sc.close();
    }
}