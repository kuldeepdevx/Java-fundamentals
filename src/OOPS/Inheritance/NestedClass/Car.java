package OOPS.Inheritance.NestedClass;

public class Car {
    int noOfTyres;

    void show() {}

    class Tyre {
        String variable;

        void test() {
            show();
            noOfTyres=2;
        }

    }
}
