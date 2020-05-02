package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        //System.out.println(reverse("Hello world!!!"));

        StringBuffer buffer = new StringBuffer("Hello world!!!");
        buffer.reverse();
        System.out.println(buffer);

    }
  /*  public static String reverse(String str) {
        return "";
    }

   */
}
