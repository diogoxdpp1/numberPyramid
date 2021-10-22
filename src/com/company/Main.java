package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number below");
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int userInput = input.nextInt();
        int count = 0;
        for(int i = 1; i < userInput+1; i++) {
            myArray.add(i);
            String printArray = myArray.toString().toString().substring(1).replaceFirst("]", "").replace(", ", "");
            System.out.println(printArray);

        }
        for(int i2 = userInput-1; i2 >= 1; i2--) {
            myArray.remove(i2);
            String printArray1 = myArray.toString().toString().substring(1).replaceFirst("]", "").replace(", ", "");
            System.out.println(printArray1);
        }
    }
}