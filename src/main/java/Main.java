import Lesson_6.Employee;
import Lesson_6.Park;

import static Lesson_5.Lesson5.*;
import static Lesson_6.Employee.*;
import static Lesson_6.Lesson6Task2.createEmployees;
import static Lesson_6.Park.printParkInfo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Lesson_5
/*        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
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
        System.out.println(Arrays.toString(createArray(5, 2)));*/

        //Lesson_6_1
        Employee emp1 = createRandomEmployee();
        Employee emp2 = createFakeEmployee();
        printEmployee(emp1);
        printEmployee(emp2);

        //Lesson_6_2
        Employee[] employees = createEmployees(5);
        for (Employee employee : employees) {
            System.out.println("***************");
            printEmployee(employee);
        }

        //Lesson_6_3
        List<Park.Attraction> attractions = new ArrayList<>();
        attractions.add(new Park.Attraction("attraction1", new BigDecimal(100), "10:00-20:00"));
        attractions.add(new Park.Attraction("attraction2", new BigDecimal(200), "11:00-21:00"));

        Park park = new Park("Park1", attractions);
        printParkInfo(park);
    }
}
