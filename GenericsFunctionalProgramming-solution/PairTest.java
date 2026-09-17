public class PairTest {
    public static void main(String[] args) {
        System.out.println("--- Testing Pair Class ---");
        
        // TODO: สร้าง Pair<String, Integer> และทดลองใช้งาน
        // Pair<String, Integer> wordCount = new Pair<>("hello", 5);
        // System.out.println("Key: " + wordCount.getKey());   // ควรจะได้ "hello"
        // System.out.println("Value: " + wordCount.getValue()); // ควรจะได้ 5
        Pair<String, Integer> itemStock = new Pair<>("Keyboard", 15);
        System.out.println("Key: " + itemStock.getKey() + ", Value: " + itemStock.getValue());
        // TODO: สร้าง Pair<Product, Boolean> และทดลองใช้งาน
        // Product apple = new Product("p1", "Apple", "Fruit", 10.0, 50);
        // Pair<Product, Boolean> productStatus = new Pair<>(apple, true);
        // System.out.println("Product: " + productStatus.getKey().name()); // ควรจะได้ "Apple"
        // System.out.println("Is Available: " + productStatus.getValue()); // ควรจะได้ true
        Product laptop = new Product("P01", "Laptop", "Electronics", 25000.0, 5);
        Pair<Product, Boolean> productStatus = new Pair<>(laptop, true);
        System.out.println("Product: " + productStatus.getKey().name() + ", Available: " + productStatus.getValue());
    }
}