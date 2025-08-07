package com.StudentInfo;

import java.util.ArrayList;

public class StudentInfo {

    // Змінні
    String name = "Artem";
    int age = 29;
    double averageScore = 10.5;
    boolean active = true;

    // Змінні з оцінками
    int number1 = 7;
    int number2 = 9;

    int sum = number1 + number2;
    int difference = number1 - number2;
    int product = number1 * number2;
    double share = (double) number1 / number2;

    public void getInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Середній бал: " + averageScore);
        System.out.println("Актив: " + active);
    }
    public void calculator() {
        // Обчислення
        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + difference);
        System.out.println("Добуток: " + product);
        System.out.println("Частка: " + share);
    }
    public static void main(String[] args) {

        int age = 18;

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.getInfo();
        studentInfo.calculator();

        String day = "Tuesday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Робочий день");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
        }
        if (age > 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");
        }

        for (int a = 1; a <= 5; a++) {
            System.out.println(a);
        }
            // Створюємо масив з 5 студентів
        {
            String[] students = {"Артем", "Богдан", "Анна", "Руслан", "Павло"};

            // Прохдимося по масиву циклом for
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);
            }
            // Створення списку з трьома містами
            ArrayList<String> cities = new ArrayList<>();
            cities.add("Київ");
            cities.add("Львів");
            cities.add("Одеса");

            // Додавання ще одного міста
            cities.add("Харків");

            // Виведення всього списку
            for (int i = 0; i < cities.size(); i++) {
                System.out.println(cities.get(i));
            }
        }
            // Ділення
        Calculator.divide(10, 2);
        Calculator.divide(10, 0);

            // Перевірка  очікуваного і фактичного значення
         TestCheck.check();
    }
}