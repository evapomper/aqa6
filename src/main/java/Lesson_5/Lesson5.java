package Lesson_5;


import java.util.Arrays;

public class Lesson5 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printThreeWords();
        System.out.println(checkSumSign(0, -1));
        System.out.println(printColor(101));
        System.out.println(compareNumbers(0, 1));
        System.out.println(isSumfrom10to20(10, 11));
        System.out.println(positiveOrNegative(101));
        System.out.println(isNegative(-101));
        printString("text", 2);
        System.out.println(isLeapYear(2024));
        System.out.println(Arrays.toString(replaceNumberInArray(arr)));
        System.out.println(Arrays.toString(fillArray()));
        System.out.println(Arrays.toString(multiplyDigitsLessSix(arr1)));
        System.out.println(Arrays.deepToString(createMatrix(5)));
        System.out.println(Arrays.toString(createArray(5, 2)));
    }

    /**
     * 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        /*String[] words = {"Orange", "Banana", "Apple"};
        for (String word : words) {
            System.out.println(word);
        }*/
    }

    /**
     * 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите.
     * Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
     * то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */
    public static String checkSumSign(int a, int b) {
        return (a + b >= 0) ? "Сумма положительная" : "Сумма отрицательная";
    }

    /**
     3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
     если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
     если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static String printColor(int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value <= 100) {
            return "Желтый";
        }
        return "Зеленый";
    }

    /**
     4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     и инициализируйте их любыми значениями, которыми захотите.
     Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
     в противном случае “a < b”;
     */
    public static String compareNumbers(int a, int b) {
        return (a >= b) ? "a >= b" : "a < b";
    }

    /**
     5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.
     */
    public static Boolean isSumfrom10to20(int a, int b) {
        return (a + b > 9 && a + b < 21);
    }

    /**
     6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static String positiveOrNegative(int a) {
        return (a >= 0) ? "Положительное" : "Отрицательное";
    }

    /**
     7. Напишите метод, которому в качестве параметра передается целое число.
     Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     Замечание: ноль считаем положительным числом.
     */
    public static Boolean isNegative(int a) {
        return a < 0;
    }

    /**
     8. Напишите метод, которому в качестве аргументов передается строка и число,
     метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    /**
     9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static Boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static int[] replaceNumberInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
            }
            else arr[i]--;
        }
        return arr;

/*        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        return arr;*/
    }

    /**
     11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /**
     12. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static int[] multiplyDigitsLessSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    /**
     13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     то есть [0][0], [1][1], [2][2], ..., [n][n];
     */
    public static int[][] createMatrix(int num) {
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            arr[i][i] = 1;  // Заполняем главную диагональ единицами
            arr[i][num - i - 1] = 1;  // Заполняем побочную диагональ единицами
        }
        return arr;
    }

    /**
     * 14. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
     */
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
