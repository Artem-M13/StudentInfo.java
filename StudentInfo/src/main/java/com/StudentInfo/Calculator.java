package com.StudentInfo;

public class Calculator {
    public int add(int a, int b) {

        return a + b;

    }

    public static void main(String[] args){
            // Створення об'єкта калькулятора
            Calculator calculator = new Calculator();

            // Виклик методу add і збереження результату
            int result = calculator.add(5, 7);

            // Виведення результату
            System.out.println("Сума: " + result);

        }
public static void divide(int a, int b){

        try {
            int result = a / b;
            System.out.println("Результат: " + result);
        }catch (ArithmeticException e){
            System.out.println("На нуль ділити не можна");
        }
}
}































