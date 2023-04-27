import java.util.Scanner;

public class Modules {

    String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    //    Задание 1
    float promptFloat(String inputPrompt) {
        float value = 0;
        boolean endInput = false;
        while (!endInput) {
            try {
                value = Float.parseFloat(prompt(inputPrompt));
                endInput = true;
            } catch (NumberFormatException nfe) {   // Попутно решает задачу 2.2 (запрет ввода пустой строки)
                System.out.println("Неверный формат ввода числа с плавающей точкой: " + nfe.getMessage());
            }
        }
        return value;
    }

    //    Задание 2
    public void task2() {
        try {
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};  // Объявить массив
            int d = 0;
            double catchedRes1 = intArray[8] / d;   // Не был объявлен массив. Деление на 0
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    //    Задание 3
    public void task3() { // throws Exception лишнее?
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;                     // Выход за границы массива
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {            // Перемещен после всех catch
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { // throws FileNotFoundException лишнее
        System.out.println(a + b);
    }

}
