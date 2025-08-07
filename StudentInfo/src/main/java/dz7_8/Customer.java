package dz7_8;

public class Customer extends User {

    public Customer(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Клієнт";
    }
}