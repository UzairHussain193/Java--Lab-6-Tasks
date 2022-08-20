//03.	Develop a java program that takes 5 floating numbers as runtime arguments and 
// print their total sum and average.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        float[] num = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextFloat();
        }
        float sum = num[0] + num[1] + num[2] + num[3] + num[4];
        float avg = sum / 5;

        System.out.println("\nTheir Sum is :  " + sum);
        System.out.println("Their Average is :  " + avg);

    }
}
