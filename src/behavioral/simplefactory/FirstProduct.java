package behavioral.simplefactory;

public class FirstProduct implements Product {
    @Override
    public void doAction() {
        System.out.println("Hello, I'm #1 Product");
    }
}
