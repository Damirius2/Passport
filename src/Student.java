import java.io.*;
import java.util.*;

public class Student {
    public String name;
    public int studentId;

    // Конструктор по умолчанию
    public Student() {
    }

    // Конструктор с параметрами
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Метод для вывода информации
    public void printInfo() {
        System.out.println("Студент: " + name + ", ID: " + studentId);
    }

    // Метод для изменения имени
    public void updateName(String newName) {
        this.name = newName;
    }

    // Метод для добавления курса
    public void addCourse(String course) {
        System.out.println("Курс '" + course + "' добавлен для студента " + name);
    }

    // Метод для вывода списка курсов
    public void listCourses(String... courses) {
        System.out.println("Список курсов для " + name + ":");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }

    // Метод для сохранения в файл
    public static void saveStudentsToFile(List<Student> students, String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Student student : students) {
                writer.println("Имя: " + student.name + ", ID: " + student.studentId);
            }
            System.out.println("Данные сохранены в файл: " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}