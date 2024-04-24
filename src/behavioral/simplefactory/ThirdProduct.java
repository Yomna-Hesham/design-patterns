package behavioral.simplefactory;

public class ThirdProduct implements Product {
    @Override
    public void doAction() {
        System.out.println("Hello, I'm #3 Product");
    }
}
