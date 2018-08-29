package chapter5;

public interface InterfaceB {
    default void print() {
        System.out.println("InterfaceB");
    }
}
