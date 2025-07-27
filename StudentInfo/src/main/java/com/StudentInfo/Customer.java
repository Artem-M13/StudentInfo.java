package com.StudentInfo;

public class Customer extends User {

    public Customer(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Клієнт";
    }
}