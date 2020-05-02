package lesson1Advanced;

///*
//Семантическое версионирование
//Реализовать метод который принимает на вход две строки
//с версиями программы ("1.0.1.2", "1.1.1.2")
//и возвращает версию более ранней
//Подсказка - для решения строки надо разбить на массивы
//Про семантическое версионирование почитать можно здесь https://semver.org/lang/ru/
//*/


import java.io.Console;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        String v1 = new String("2.0.0.1.2");
        String v2 = new String("2.0.0.1.3");
        String lowestVersion = minVersion(v1, v2);
        System.out.println("The lowest version is "+lowestVersion);
    }
    public static String minVersion(String v1, String v2) {
        //   return v1;
        String s3;
        String[] s1 = v1.split("\\.");
        String[] s2 = v2.split("\\.");

        if (Arrays.equals(s1, s2)){
            System.out.println("Versions are equal");
            return v1;
        }

        for (int i = 0; i <= 5; i++) {
            int numberV1 = Integer.parseInt(s1[i]);
            int numberV2 = Integer.parseInt(s2[i]);
            if (numberV1 > numberV2) {
                return v1;
            } else if (numberV2 > numberV1) {
                return v2;
            }
        }
        return v1;
    }
}