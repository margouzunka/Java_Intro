package types_operations;

public class NestedIfDemo {
    public static void main(String[] args) {
        int i, j, k, a, b, c, d;
        i = 10;
        j = 19;
        k = 101;
        a = 1;
        b = 2;
        c = 3;
        d = 4;

        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        if (i == 10) {
            if (j < 20) a = b;
            if (k > 100) c = d;
            else a = c;

        }
        else a = d;

        System.out.println("Final values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
