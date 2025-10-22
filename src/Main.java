import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Создание классов и объектов
        System.out.println("=== Задание 1: Создание классов и объектов ===");

        java.util.List<Student> students = new java.util.ArrayList<>();

        // Создание двух объектов Student
        Student student1 = new Student();
        student1.name = "Иван Петров";
        student1.studentId = 1001;

        Student student2 = new Student();
        student2.name = "Мария Сидорова";
        student2.studentId = 1002;

        students.add(student1);
        students.add(student2);

        // Сохранение в файл
        Student.saveStudentsToFile(students, "students.txt");

        // Вывод в консоль
        System.out.println("Созданы студенты:");
        for (Student student : students) {
            student.printInfo();
        }

        // Задание 2: Конструкторы
        System.out.println("\n=== Задание 2: Конструкторы ===");

        java.util.List<Student> constructorStudents = new java.util.ArrayList<>();

        // Создание объектов с использованием конструктора с параметрами
        Student student3 = new Student("Алексей Козлов", 1003);
        Student student4 = new Student("Елена Новикова", 1004);

        // Создание объекта с конструктором по умолчанию
        Student student5 = new Student();
        student5.name = "Дмитрий Соколов";
        student5.studentId = 1005;

        constructorStudents.add(student3);
        constructorStudents.add(student4);
        constructorStudents.add(student5);

        // Сохранение в файл
        Student.saveStudentsToFile(constructorStudents, "constructors.txt");

        // Вывод в консоль
        System.out.println("Созданы студенты через конструкторы:");
        for (Student student : constructorStudents) {
            student.printInfo();
        }

        // Задание 3: Методы
        System.out.println("\n=== Задание 3: Методы ===");

        Student student6 = new Student("Ольга Иванова", 1006);

        // Вызов метода printInfo
        System.out.println("Вызов метода printInfo:");
        student6.printInfo();

        // Изменение имени с помощью метода updateName
        System.out.println("Изменение имени:");
        student6.updateName("Ольга Петрова");
        student6.printInfo();

        // Сохранение лога изменений
        try (PrintWriter writer = new PrintWriter("update_log.txt")) {
            writer.println("Исходное имя: Ольга Иванова");
            writer.println("Новое имя: Ольга Петрова");
            writer.println("ID студента: 1006");
            System.out.println("Лог изменений сохранен в update_log.txt");
        } catch (Exception e) {
            System.out.println("Ошибка при записи лога: " + e.getMessage());
        }

        // Задание 4: Параметры методов
        System.out.println("\n=== Задание 4: Параметры методов ===");

        Student student7 = new Student("Сергей Васильев", 1007);

        // Добавление курсов
        System.out.println("Добавление курсов:");
        student7.addCourse("Java Programming");
        student7.addCourse("Database Systems");

        // Вывод списка курсов
        System.out.println("Список курсов:");
        student7.listCourses("Java Programming", "Database Systems", "Algorithms", "Web Development");

        // Сохранение списка курсов в файл
        try (PrintWriter writer = new PrintWriter("courses.txt")) {
            writer.println("Студент: Сергей Васильев");
            writer.println("ID: 1007");
            writer.println("Курсы:");
            writer.println("- Java Programming");
            writer.println("- Database Systems");
            writer.println("- Algorithms");
            writer.println("- Web Development");
            System.out.println("Список курсов сохранен в courses.txt");
        } catch (Exception e) {
            System.out.println("Ошибка при записи курсов: " + e.getMessage());
        }
    }
}