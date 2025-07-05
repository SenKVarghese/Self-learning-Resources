import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading different types
        System.out.print("Enter the problem No:");
        int problemNo = scanner.nextInt();

        switch (problemNo) {
            case 1:
                LargestOfThree();
                break;
            case 2:
                EvenorOdd();
            case 3:
                SumOfNNumbers();
            case 4:
                PrintAllTillN();
            case 5:
                DivisibleBy5();
            default:
                break;
        }

        scanner.close(); // Always close scanner
    }

    public static void LargestOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int firstNo = scanner.nextInt();
        System.out.println("Enter 2st number");
        int secondNo = scanner.nextInt();
        System.out.println("Enter 3rd number");
        int thridNo = scanner.nextInt();

        if (firstNo > secondNo && firstNo > thridNo) {
            System.out.printf("Greatest is %s", firstNo);

        } else if (secondNo > thridNo) {
            System.out.printf("Greates is second number  %s", secondNo);
        } else {
            System.out.printf("Greatest is third ", thridNo);
        }
        scanner.close();
    }

    public static void EvenorOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = scanner.nextInt();
        if (no % 2 == 0) {
            System.out.printf("Number %s is even", no);
        } else {
            System.out.printf("Number %s is odd", no);
        }
        scanner.close();
    }

    public static void SumOfNNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose sum till is to calculate:");
        int no = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= no; i++) {
            sum = sum + i;
        }
        System.out.printf("Sum until %s is %s", no, sum);
        sc.close();
    }

    public static void PrintAllTillN() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which u need print:");
        int no = sc.nextInt();
        for (int i = 14; i <= no; i++) {
            System.out.println(i);
        }
        sc.close();
    }

    public static void DivisibleBy5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check by 5 divisibility:");
        int no = sc.nextInt();
        if (no % 5 == 0) {
            System.out.printf("Number %s is divisible by 5", no);
        } else {
            System.out.printf("Number %s is not divisible by 5", no);
        }
        sc.close();
    }

}