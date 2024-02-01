package org.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Апельсины", 100.0, 4);
        Product product2 = new Product("Яблоки", 36.5, 3);
        Product product3 = new Product("Персики", 76.8, 5);

        Category fruitsCategory = new Category("Фрукты", product1, product2, product3);

        User user1 = new User("Николай", "12345");
        User user2 = new User("Иван", "54321");

        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product2);

        user2.getBasket().addProduct(product3);

        System.out.println("Список товаров:");
        System.out.println(fruitsCategory.getName() + ":");
        for (Product product : fruitsCategory.getProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
        }

        System.out.println("\nСписок покупок Николая:");
        user1.getBasket().printBasket();

        System.out.println("\nСписок покупок Ивана:");
        user2.getBasket().printBasket();
    }
}