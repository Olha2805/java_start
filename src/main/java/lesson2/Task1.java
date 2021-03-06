package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 * - не должно быть возможности напрямую устанваливать или читать значение age/name
 * - нельзя установить значение age меньше нуля
 * - максимальныое значение для возраста - 100
 * - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 * - name не может состоять из одних только пробелов
 * - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 * оно должно быть записано в переменную name с большой буквы
 * - ageGroup должен устанавливаться автоматически при установке возраста
 * - child если age до 15 лет
 * - student  - если age от 15 до 25 лет
 * - worker - если age от 26 до 65 лет
 * - pensioner - если age старше 66 лет
 * - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {
    private String person;
    private int age;
    private String name;
    private String nameUpper;
    private String ageGroup;

    public static void main(String[] args) {
        int age = 55;
        String name = "    ivanicH";
        person personX = new person();

        personX.setName(name);
        personX.setAge(age);

        System.out.println("Name of person " + personX.getName());

        if (!personX.checkAge(age)) {
            System.out.println("Your age is incorrect");
        } else {
            System.out.println("Age of person " + personX.getAge());
            System.out.println("Age group of person is " + personX.getAgeGroup());
        }

    }

}
