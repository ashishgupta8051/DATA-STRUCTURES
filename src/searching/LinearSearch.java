package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int array_size = scanner.nextInt();
        int[] ary = new int[array_size];
        System.out.print("How many number do you want to add in array : ");
        int array_input_size = scanner.nextInt();

        if (array_input_size > array_size ){
            System.out.println("Array size is less then your input size......");
        }else {
            for (int i = 0 ; i < array_input_size; i++){
                System.out.print("Enter the number "+i+" : ");
                int number = scanner.nextInt();
                ary[i] = number;
            }
            displayArray(ary,array_input_size);
            System.out.println("Enter the number which you want to search in array : ");
            int number = scanner.nextInt();
            search(ary,number,array_input_size);
        }
    }

    private static void search(int[] ary, int number, int array_input_size) {
        int flag = 0;
        for (int i = 0; i < array_input_size; i++){
            if (number == ary[i]){
                flag = i + 1;
                break;
            }else {
                flag = 0;
            }
        }
        if (flag != 0){
            System.out.print("Value found at location : "+flag);
        }else {
            System.out.print("Value not found");
        }
    }

    private static void displayArray(int[] ary, int array_input_size) {
        System.out.println("Array is ");
        for (int i = 0; i < array_input_size; i++){
            System.out.print(ary[i]+" ");
        }
        System.out.println();
    }
}
