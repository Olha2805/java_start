package lesson1Advanced;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.*;

public class Task1 {
    /* Минимум n чисел
    Написать функцию, которая вычисляет минимум из массива чисел.
    */
    public static void main(String[] args) {

        int [] mass = new int[]{2, 4, 6, 3, 90, 2, 22};

      Arrays.sort(mass);

       System.out.println("Minimum number of array is : " + mass[0]);


         }


   /* public static int min(int[] a) {
        return 0;
    }
    */
}
