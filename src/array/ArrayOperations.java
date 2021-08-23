package array;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int array_size = scanner.nextInt();
        int[] ary = new int[array_size];
        System.out.print("How many number do you want to add in array : ");
        int array_input_size = scanner.nextInt();

        if (array_size < array_input_size){
            System.out.println("Array size is less then your input size......");
        }else {
            for (int i = 0 ; i < array_input_size; i++){
                System.out.print("Enter the number : ");
                int number = scanner.nextInt();
                ary[i] = number;
            }
            displayArray(ary,array_input_size);

            System.out.print("Enter the number which you want to add in array : ");
            int add_number = scanner.nextInt();
            System.out.print("Enter the index number which you want to add in array : ");
            int index_number = scanner.nextInt();
            if (index_number > array_input_size){
                System.out.println("Enter a correct index number max array input Size is : "+array_input_size);
            }else {
                insertElement(ary,array_input_size,add_number,index_number);
                System.out.print("Enter the index number which you want to delete in array : ");
                int delete_index_number = scanner.nextInt();
                if (delete_index_number > array_input_size){
                    System.out.print("Please enter correct index number array input size is : "+array_input_size);
                }else {
                    deleteArray(ary,delete_index_number,array_input_size);
                }
            }
        }
    }

    //Traversing
    private static void displayArray(int[] ary, int element_number) {
        System.out.println("Array is ");
        for (int i = 0 ; i < element_number; i++){
            System.out.print(ary[i]+" ");
        }
        System.out.println();
    }

    //Insertion
    static void
    insertElement(int[] ary, int array_input_size, int insert_element, int array_index) {
        for (int i = array_input_size - 1; i >= array_index; i--){
            ary[i+1] = ary[i];
        }
        ary[array_index] = insert_element;
        array_input_size = array_input_size + 1;
        displayArray(ary,array_input_size);
    }

    //Deletion
    private static void deleteArray(int[] ary, int delete_index_number, int array_input_size) {
        for (int i = delete_index_number; i < array_input_size; i++) {
            ary[i] = ary[i + 1];
        }
        displayArray(ary,array_input_size);
    }
}