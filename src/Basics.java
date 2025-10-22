import java.util.Scanner;
import java.io.*;

public class Basics {
    public static void main(String[] args) {
        // Задание 1: Объявление и вывод переменных
        int age = 20;
        double height = 175.5;
        String name = "Damir";
        boolean isStudent = true;

        System.out.println("=== Задание 1: Переменные ===");
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Статус студента: " + isStudent);

        // Задание 2: Арифметические операции
        System.out.println("\n=== Задание 2: Арифметические операции ===");
        int a = 15;
        double b = 4.0;

        int sumInt = a + (int)b;
        double sumDouble = a + b;
        int diffInt = a - (int)b;
        double diffDouble = a - b;
        int multInt = a * (int)b;
        double multDouble = a * b;
        double divDouble = a / b;

        System.out.println("Сложение (int): " + sumInt);
        System.out.println("Сложение (double): " + sumDouble);
        System.out.println("Вычитание (int): " + diffInt);
        System.out.println("Вычитание (double): " + diffDouble);
        System.out.println("Умножение (int): " + multInt);
        System.out.println("Умножение (double): " + multDouble);
        System.out.println("Деление: " + divDouble);

        // Задание 3: Работа со строками
        System.out.println("\n=== Задание 3: Работа со строками ===");
        String firstName = "Damir";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName;
        String java1 = "Java";
        String java2 = "java";

        System.out.println("Конкатенация: " + fullName);
        System.out.println("Длина строки: " + fullName.length());
        System.out.println("equals (Java vs java): " + java1.equals(java2));
        System.out.println("equalsIgnoreCase (Java vs java): " + java1.equalsIgnoreCase(java2));

        // Задание 4: Ввод данных с консоли
        System.out.println("\n=== Задание 4: Ввод данных с консоли ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double add = num1 + num2;
            double sub = num1 - num2;
            double mul = num1 * num2;
            double div = (num2 != 0) ? num1 / num2 : Double.NaN;

            // Запись результатов в файл
            try (PrintWriter writer = new PrintWriter("basics_output.txt")) {
                writer.println("Результат сложения: " + add);
                writer.println("Результат вычитания: " + sub);
                writer.println("Результат умножения: " + mul);
                writer.println("Результат деления: " + (num2 != 0 ? div : "Ошибка: деление на ноль"));
                System.out.println("Результаты записаны в файл basics_output.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ошибка ввода: введите корректное число!");
        } finally {
            scanner.close();
        }
    }
}