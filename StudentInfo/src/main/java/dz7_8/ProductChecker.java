package dz7_8;

public class ProductChecker {
    public static void checkPrice (double price) throws InvalidPriceException{
        if (price <= 0){
            throw new InvalidPriceException("Ціна повинна бути більшою за 0!");
        } else {
            System.out.println("Ціна коректна: " + price);
        }
    }
}