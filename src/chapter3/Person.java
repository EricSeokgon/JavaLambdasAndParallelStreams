package chapter3;

public class Person {
    String surname;
    String GivenName;
    int Age;

    enum Gender {
        Male,Female;
    }

    boolean IsVendor;

    String Buying;
    String Selling;

    public int getAge() {
        return Age;
    }
}
