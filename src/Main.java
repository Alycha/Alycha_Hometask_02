/**
 * Created by alyona on 10/12/2015.
 */
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /* 2. Create a method that will print the specified array to the screen.
        Using this method fill 5 arrays that have 10 elements
         */




        /* +3. Create a method, that will sort the specified array in ascending order */

        /*
        int[] IntArray = new int[10];
        System.out.println("Unsorted array: ");
        for (int i = 0; i < IntArray.length; i++) {
            IntArray[i] = new Random().nextInt(50);
            System.out.print(IntArray[i]+" ");
        }
        System.out.println();
        System.out.println("Array sorted in ascending order: ");
        for (int i = 0; i < IntArray.length; i++){
            for (int j = 0; j < IntArray.length; j++){
                if (IntArray[j] > IntArray[i]) {
                    int TempInt = IntArray[i];
                    IntArray[i] = IntArray[j];
                    IntArray [j] = TempInt;
                }
            }
        }
        for (int i = 0; i < IntArray.length; i++) {
            System.out.print(IntArray[i]+" ");
        }
        */



        /* +4. Array stores 7 text strings. Create a program that would sort the strings and print them to the screen
         in alphabetical order
          */

        /*
        String[] TextArray = {"Kaph Lamed", "Aleph Beth", "He Gimel", "Heth Yod", "Ayin Nun", "Teth Daleth", "Tsadi Mem"};
        for (int i = 0; i < TextArray.length; i++) {
            for (int j = i + 1; j < TextArray.length; j++) {
                if (TextArray[j].compareTo(TextArray[i]) < 0) {
                    String TempString = TextArray[i];
                    TextArray[i] = TextArray[j];
                    TextArray[j] = TempString;
                }
            }
            System.out.println(TextArray[i]);
        }
        */



        /* +5. Create an array for 4 random integer numbers [10;99]. Print this array to the screen.
        * Check and print a message if this array is sorted in the ascending order*/

        /*
        int[] IntArray = new int[4];
//        int[] IntArray = {5, 17, 20, 78};
        int IsSorted = 0;
        System.out.println("Unsorted array: ");
        for (int i = 0; i < IntArray.length; i++) {
            IntArray[i] = new Random().nextInt((99-10)+1)+10;
            System.out.print(IntArray[i]+" ");
        }
        for (int i = 0; i < IntArray.length-1; i++){
                if (IntArray[i] > IntArray[i+1]) {
                    IsSorted++;
                }
            }
        System.out.println();
//        System.out.println(IsSorted);
        if (IsSorted == 0) {System.out.println("Array is sorted in ascending order"); }
            else {System.out.println("Array is NOT sorted in ascending order");}
        */




        /* 6. Create a two-dimensional array consisting of 6 rows and 7 columns, containing random integer numbers [0;9].
        Print this array to the screen. Convert this array, so that on the first position of each row would be its
        largest element. You cannot change the content of the array, you can only change the elements in the row.
        Order of the rest elements is not important.
        Print the converted array to the screen.
         */

        int[][] TwoDimArray = new int[6][7];
//        System.out.println(TwoDimArray.length);
        for (int i = 0; i < TwoDimArray.length; i++) {
            for (int j = 0; j < 7; j++) {
                TwoDimArray[i][j] = new Random().nextInt((9-0)+1);
                System.out.print(TwoDimArray[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < TwoDimArray.length; i++) {
            for (int j = 0; j < 6; j++) {
                if (TwoDimArray[i][j] < TwoDimArray[i][j+1]) {int Max = TwoDimArray[i][j+1];}
                else

                System.out.print(TwoDimArray[i][j]+" ");
            }
            System.out.println("");
        }






    }
}
