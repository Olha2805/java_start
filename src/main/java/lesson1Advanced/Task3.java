package lesson1Advanced;

/* Мое имя
Вывести на экран любой символ пирамидкой в обратную сторону высотой в 10 строк.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом
*/

public class Task3 {



        public static void main(String[] args) {
            String s = "+";

            int spacesAmount = 0;
            int symbolsAmount = 0;
            int totalStringLength = 11;
                for (int i=1; i<totalStringLength; i++) {
                spacesAmount = totalStringLength-i;
                symbolsAmount = totalStringLength - spacesAmount;
                for (int m=0; m<spacesAmount; m++) {
                    System.out.print(" ");
                }
                    for (int j = 0; j < symbolsAmount; j++) {

                        System.out.print(s);
                    }


                System.out.println();


            }

           // System.out.println(s);
    }
}