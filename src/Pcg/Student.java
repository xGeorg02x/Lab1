package Pcg;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    // Конструктор
    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    // Метод для расчёта среднего балла
    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
