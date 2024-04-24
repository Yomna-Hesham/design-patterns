package behavioral.simplefactory;

public class BasicProduct implements Product {
    @Override
    public void doAction() {
        System.out.println("Hello, I'm a Basic Product");
    }
}
