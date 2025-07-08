


import java.util.Scanner;

public class StudentInfo {

    //   Змінні
    String name = "Artem";
    int age = 29;
    double averageScore = 10.5;
    boolean active = true;

    //   змінні з оцінками
    int number1 = 7;
    int number2 = 9;

    int sum = number1 + number2;
    int difference = number1 - number2;
    int product = number1 * number2;
    double share = (double) number1 / number2;

    public void getInfo() {
        System.out.println("Ім'я:" + name);
        System.out.println("Вік:" + age);
        System.out.println("Середній бал:" + averageScore);
        System.out.println("Актив:" + active);
    }

    public void calculator() {
        // Обчислення
        System.out.println("Сума:" + sum);
        System.out.println("Різниця:" + difference);
        System.out.println("Добуток:" + product);
        System.out.println("Чачтка:" + share);
    }

    // перевірка віку


    int age4 = 29;

//        if (age < 18) {
//        System.out.println("Доступ заборонено");
//    } else {
//        System.out.println("Доступ дозволено");
//
//
//        //   Цикл FOR
//
//
//        for (int a = 1; a <= 5; a++) {
//            System.out.println(a);
//        }
//
//// перевірка дня тижня
//
//        Scanner scan = new Scanner(System.in);
//
//
//        String Monday = scan.nextLine();
//
//        switch (Monday) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.print("Робочий деннь");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.print("Вихідний день");
//
//        }
//    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();

        studentInfo.getInfo();
    }
}

