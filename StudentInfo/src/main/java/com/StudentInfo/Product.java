package com.StudentInfo;


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

    public boolean isAvailable() {
        return available;
    }

    // Сеттери
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Метод для виводу інформації
          public void printProductInfo(){
            System.out.println("Назва товару: " + name);
            System.out.println("Ціна: " + price);
            System.out.println("Наявність: " + (available ? "В наявності" : "Немає в наявності"));
        }
//
}








