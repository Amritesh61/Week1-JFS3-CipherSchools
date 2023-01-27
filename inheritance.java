public class inheritance {
    int width;
    int height;

    void display(String item) {
        System.err.println(item+" width "+width+" height "+height);
    }
    public static void main(String[] args) {
        Chair wow = new Chair();
        wow.foo();
    }

}
class Chair extends inheritance {
    void foo() {
        width=19;
        height=54;
        display("chair");
    }
}
class Table extends inheritance {
    void foo() {
        width=89;
        height=94;
        display("Table");
    }
}
class Almirah extends inheritance{
    void foo() {
        width=18;
        height=94;
        display("Almirah");
    }

}
