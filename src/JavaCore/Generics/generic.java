package JavaCore.Generics;


class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}

public class generic {
    public static void main(String[] args) {
        Gen<Integer> iob;
        iob = new Gen<>(100);
        iob.showType();
        int v = iob.getOb();
        System.out.println("value: " + v);

        Gen<String> sob;
        sob = new Gen<>("Deepanshu");
        sob.showType();
        String v1 = sob.getOb();
        System.out.println("value: " + v1);
    }

}
