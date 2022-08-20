//01.	Write java code that takes a value at runtime and searches it in the array. If the value 
// appears in the array then it prints the position of the value or else prints a message that value 
// is not found.

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int search;
        Scanner nam = new Scanner(System.in);
        System.out.println("Enter numbers to sort in array = ");
        for (int i = 0; i < 5; i++) {
            num[i] = nam.nextInt();
        }
        System.out.println("Enter number to search from array= ");
        search = nam.nextInt();
        for (int i = 0; i < 5; i++) {
            if (num[i] == search) {
                System.out.println(num[i] + " = Found");
                break;
            } else {
                System.out.println(num[i] + " = Not Found");
            }
        }
    }
}