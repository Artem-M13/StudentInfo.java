package dz7_8;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Адміністратор";
    }
}