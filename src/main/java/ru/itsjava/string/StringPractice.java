package ru.itsjava.string;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Oleg"; // создаем объект типа строка name и присваеваем ему значение "Oleg"
        String copyName = "Oleg"; // создаем объект типа строка copyName и присваеваем ему значение "Oleg"
        System.out.println("name == copyName = " + (name == copyName)); // сравниваем ссылки двух объектов. Объект один и находится в пуле строк

        String constructorName = new String("Oleg"); // создаем объект в куче, не в пкле строк
        System.out.println("(constructorName == name) = " + (constructorName == name)); // сравниваем ссылки. Поскольку ссылки разные false
        String internConstructorName = constructorName.intern(); // intern() присваевает ссылку от constructorName находящигося в куче к объекту в пуле строк
        System.out.println("(name == internConstructorName) = " + (name == internConstructorName)); // true по скольку ссылки равны

        String str = "Я строка"; // создаем объект типа строка str и присваеваем ему значение "Я строка"
        String strTemp = "";
        System.out.println("str.length() = " + str.length()); // выводим сколько символов в строке
        System.out.println("str.isEmpty() = " + str.isEmpty()); // проверяет является ли объект пустым false
        System.out.println("strTemp.isEmpty() = " + strTemp.isEmpty()); // для проверки true
        System.out.println("str.equals() = " + str.equals("Я строкА")); // сравниваем строку str c "Я строкА". По скольку содержания строк отлучаются false
        System.out.println("str.equals() = " + str.equalsIgnoreCase("Я строкА")); // сравнения строк игнорируя регистры
        String[] strs = str.split(" "); // split разделяет строку. Создаем массив srts от строки str разделенный " ". " " служит определяющим символом разделения
        System.out.println(strs[0]); // выводим 0 индекс строки
        System.out.println(strs[1]); // выводим 1 индекс строки

        for (int i = 0; i < 1_000; i++) { // создаем 1000 объектов. И это будут разные объекты
            str = str + "!";
        }
        System.out.println(str); // в видео уроке забыл указать. Выводим строку
        System.out.println();

        StringBuilder stringBuilderStr = new StringBuilder(); // создаем один объект с 1000000 восклицательных знаков. StringBuilder создает изменяймую строку
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilderStr.append('!');
        }
        System.out.println(stringBuilderStr.toString()); // выводим строку
    }
}
