package behavioral.simplefactory;

public class SecondProduct implements Product {
    @Override
    public void doAction() {
        System.out.println("Hello, I'm #2 Product");
    }
}
