import behavioral.simplefactory.Product;
import behavioral.simplefactory.ProductType;
import behavioral.simplefactory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (ProductType type : ProductType.values()) {
            Product product = SimpleFactory.createProduct(type);
            product.doAction();
        }
    }
}