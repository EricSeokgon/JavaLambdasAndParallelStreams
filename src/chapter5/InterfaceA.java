package chapter5;

public interface InterfaceA {
    default void print() {
        System.out.println("InterfaceA");
    }
}
