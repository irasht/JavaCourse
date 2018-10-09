public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Ball", 40, 10);
        Product product1 = new Product("Book", 100, 5);
        Product product2 = new Product("Scissors", 20, 2);
        Product product3 = new Product("Pen", 5, 50);

        if (product.getPrice() > product1.getPrice()) {
            System.out.println("Product: " + product.getName() + " it's amount " + product.getQuantity());
        } else if (product1.getPrice() > product2.getPrice()) {
            System.out.println("Product: " + product1.getName() + " it's amount " + product1.getQuantity());
        } else if (product2.getPrice() > product3.getPrice()) {
            System.out.println("Product: " + product2.getName() + " it's amount " + product2.getQuantity());
        } else {
            System.out.println("Product: " + product3.getName() + " it's amount " + product3.getQuantity());
        }

        if (product.getQuantity() > product1.getQuantity()) {
            System.out.println(product.getName() + " has the biggest quantity");
        } else if (product1.getQuantity() > product2.getQuantity()) {
            System.out.println(product1.getName() + " has the biggest quantity");
        } else if (product2.getQuantity() > product3.getQuantity()) {
            System.out.println(product2.getName() + " has the biggest quantity");
        } else {
            System.out.println(product3.getName() + " has the biggest quantity");
        }
    }
}