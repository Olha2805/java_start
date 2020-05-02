package lesson1;

import org.omg.CORBA.Object;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    *///System.out.println(min(5,2,3));

    public static void main(String[] args)
    {
        int k = 5, n = 2, m = 3;
        System.out.println("Min is " + min(k, n, m));
    }
    public static int min(int a, int b, int c)
    {
        int res;
        if(a <= b && a <= c){
            res = a;
        }else if(c <= b && c <= a){
            res = c;
        }else if(b <= c && b <= a){
            res = b;
        }else{
            res = 0;
            System.out.println("Use different numbers!");
        }
        return res;
    }

   /* public static int min(int a, int b, int c) {
        return 0;
    }
    */
}
