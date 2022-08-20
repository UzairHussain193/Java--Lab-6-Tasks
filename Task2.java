
// 02.	Write a java program to demonstrate the concept of java runtime arguments. 
// Input your name and roll number and print it on the console.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String name, roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your roll no: ");
        roll = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}