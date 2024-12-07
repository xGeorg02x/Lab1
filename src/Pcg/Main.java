package Pcg;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создание коллекции студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "A1", 1, Map.of("Math", 4, "History", 5, "Biology", 3)));
        students.add(new Student("Bob", "B1", 2, Map.of("Math", 5, "History", 3, "Biology", 2)));
        students.add(new Student("Charlie", "C1", 3, Map.of("Math", 5, "History", 4, "Biology", 4)));

        // Удаление студентов со средним баллом < 3 и перевод остальных
        processStudents(students);

        // Печать студентов на заданном курсе
        printStudents(students, 2); // Замените "2" на нужный номер курса
    }

    // Метод для обработки студентов
    public static void processStudents(List<Student> students) {
        // Используем итератор для удаления элементов из списка
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove(); // Удаляем студента
            } else {
                student.setCourse(student.getCourse() + 1); // Переводим на следующий курс
            }
        }
    }

    // Метод для вывода студентов определённого курса
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
