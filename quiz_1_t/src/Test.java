import java.net.StandardSocketOptions;

class Vars {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;
}

class Foo extends Vars {
    public Foo() { ++a;  }
}

class Bar extends Foo {
    public Bar() { int tmp = c; c = a; a = b; b = tmp; }
}
public class Test {
    static Foo x = new Bar();

    public static void main(String[] args) {
        Foo y = new Foo();
        //my code
        new Bar();
        new Bar();
        new Foo();
        new Foo();
        new Bar();
        new Foo();
        new Bar();
    }
}