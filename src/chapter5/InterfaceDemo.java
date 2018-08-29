package chapter5;

public class InterfaceDemo {
    private static class InterfaceImplementor implements InterfaceA{
    }

    public static void main(String[] args) {
        new InterfaceImplementor().print();
    }
}
