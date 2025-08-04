package dz7_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Створення першого продукту - Телефон
        Product phone = new Product("Телефон", 999.99, true);
        Product laptop = new Product("Ноутбук", 9339.99, false);
        Product monitor = new Product("Монітор", 323.43, true);
        Product phone1 = new Product("Смартфон", 12000.0, true);
        // Виведення інформації про обидва продукти
        phone.printProductInfo();
        System.out.println();  //Порожній рядок для розділення
        laptop.printProductInfo();


        //  товар зі знижкою
        DiscountedProduct discountedLaptop = new DiscountedProduct("Ноутбук", 30000.0, true, 10.0);

        // Вивід інформації про звичайний товар
        System.out.println("=== Інформація про товар ===");
        phone.printProductInfo();
        monitor.printProductInfo();
        // Вивід інформації про товар зі знижкою
        System.out.println("\n=== Інформація про товар зі знижкою ===");
        laptop.printProductInfo();


        User admin = new Admin("Олег");
        User customer = new Customer("Наталія");


// Створення списку продуктів
        ArrayList<Product> products = new ArrayList<>();
        products.add(phone);
        products.add(laptop);
        products.add(phone1);

// Вивід усіх продуктів зі списку
        System.out.println("\n=== Список усіх продуктів ===");
        for (Product product : products) {
            product.printProductInfo();
            System.out.println("-----------------------");
        }

        // Створення HashSet з унікальними категоріями
        HashSet<String> categories = new HashSet<>();

        // Додавання категорій
        categories.add("Електроніка");
        categories.add("Одяг");
        categories.add("Побутова техніка");
        categories.add("Книги");

        // Виведення всіх категорій
        System.out.println("Список категорій:");
        for (String category : categories) {
            System.out.println("- " + category);
        }

        // Перевірка, чи є категорія
        String searchCategory = "Електроніка";

        if (categories.contains(searchCategory)) {
            System.out.println("\nКатегорія \"" + searchCategory + "\" присутня у наборі.");
        } else {
            System.out.println("\nКатегорія \"" + searchCategory + "\" відсутня у наборі.");
        }
        HashMap<String, Double> productPrices = new HashMap<>();

        // Додавання продуктів і цін
        productPrices.put("Телефон", 999.99);
        productPrices.put("Ноутбук", 9339.99);
        productPrices.put("Монітор", 323.43);
        productPrices.put("Смартфон", 12000.0);

        // Вивід всіх пар ключ-значення
        System.out.println("=== Ціни на товари ===");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Назва: " + entry.getKey() + " — Ціна: " + entry.getValue() + " грн");
        }

            divideNumbers(10, 2);   // нормальний випадок
            divideNumbers(5, 0);    // ділення на нуль
        }

        public static void divideNumbers(int a, int b) {
            try {
                int result = a / b;
                System.out.println("-----------------------");
                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Помилка: не можна ділити на нуль!");

            } finally {
                System.out.println("Операція завершена");
                System.out.println("-----------------------");
            }
            try {
               ProductChecker.checkPrice(1200.0);  // коректна ціна
                ProductChecker.checkPrice(0);      // некоректна
            }  catch (InvalidPriceException e) {
                System.out.println("Виняток: " + e.getMessage());

            }
        }
    }





