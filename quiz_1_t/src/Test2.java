class A {
    int a = 1;
    void set(int a) { this.a = a; }
    int get() { return a; }
}

class B extends A {
    void set(int a) { this.a += a; }
}

class C extends B {
    int get() { return a * 2; }
}
class Test2 {
    //print out the number 10.
    public static void main(String[] args) {
        A[] arr = {new A(), new B(), new B(), new B(), new C(),new A()};

        for (int i = 1; i < arr.length; ++i) {
            arr[i].set(arr[i-1].get());
        }

        System.out.println(arr[arr.length - 1].get());
    }
}