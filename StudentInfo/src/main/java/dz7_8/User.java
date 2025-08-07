package dz7_8;

public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    // Абстрактний метод
    public abstract String getRole();

    // Геттер для імені
    public String getName() {
        return name;
    }

    // Загальний метод для всіх користувачів
    public void printInfo() {
        System.out.println("Ім’я: " + getName());
        System.out.println("Роль: " + getRole());
    }
}