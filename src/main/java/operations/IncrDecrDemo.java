package operations;

public class IncrDecrDemo {
    public static void main(String[] args) {
        int x = 0;

        x = x + 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x++;

        System.out.println(x);
        ++x;
        System.out.println(x);

        int a = 0;
        System.out.println("prefix:" + ++a);
        System.out.println("a:" + a);
        System.out.println("postfix:" + a++);
        System.out.println("a:" + a);



    }
}
