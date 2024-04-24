package behavioral.simplefactory;

public class SimpleFactory {
    private SimpleFactory() {
    }

    public static Product createProduct(ProductType type) {
        return switch (type) {
            case FIRST -> new FirstProduct();
            case SECOND -> new SecondProduct();
            case THIRD -> new ThirdProduct();

            default -> new BasicProduct();
        };
    }
}
