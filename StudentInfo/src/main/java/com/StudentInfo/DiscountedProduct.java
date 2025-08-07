package com.StudentInfo;

public class DiscountedProduct extends Product {


    private double discount;  // знижка у відсотках, наприклад: 10.0 = 10%

    public DiscountedProduct(String name, double price, boolean available, double discount) {
        super(name, price, available); // виклик конструктора батьківського класу
        this.discount = discount;
        System.out.println(super.getPrice());
    }

    // Метод, який розраховує нову ціну з урахуванням знижки
    public double getDiscountedPrice() {
        return getPrice() - (getPrice() * discount / 100);
    }

    // Перевизначений метод для виводу повної інформації
    @Override
    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("Знижка: " + discount + " %");
        System.out.println("Ціна зі знижкою: " + getDiscountedPrice() + " грн");
    }
}
