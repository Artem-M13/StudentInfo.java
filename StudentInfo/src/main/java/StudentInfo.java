


import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        //   Змінні
        String name = "Artem";
        int age = 29;
        double AverageBal = 10.5;
        boolean Acyive = true;

        System.out.println("Ім'я:" + name);
        System.out.println("Вік:" + age);
        System.out.println("Середній бал:" + AverageBal);
        System.out.println("Актив:" + Acyive);

        //   змінні з оцінками
        int Number1 = 7;
        int Number2 = 9;


        int sum = Number1 + Number2;
        int difference = Number1 - Number2;
        int product = Number1 * Number2;
        double share = (double) Number1 / Number2;

        // Обчислення
        System.out.println("Сума:" + sum);
        System.out.println("Різниця:" + difference);
        System.out.println("Добуток:" + product);
        System.out.println("Чачтка:" + share);


           // перевірка віку


        int age3 = 29;

        if (age < 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");


            //   Цикл FOR


            for (int a = 1; a <= 5; a++) {
                System.out.println(a);
            }

// перевірка дня тижня

            Scanner scan = new Scanner(System.in);


            String Monday = scan.nextLine();

            switch (Monday) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.print("Робочий деннь");
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.print("Вихідний день");

            }
        }
    }
        }

