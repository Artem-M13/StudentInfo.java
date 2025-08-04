package dz7_8;


public class Product {
    // Поля класу
    public String name;
    public double price;
    public boolean available;

    // Конструктор
    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailable() {
        return available;
    }

    // Метод для виводу інформації
          public void printProductInfo() {
            System.out.println("Назва товару: " + getName());
            System.out.println("Ціна: " + getPrice());
            System.out.println("Наявність: " + (getAvailable() ? "В наявності" : "Немає в наявності"));
        }
}








