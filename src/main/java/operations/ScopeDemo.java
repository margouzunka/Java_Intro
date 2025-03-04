package operations;

public class ScopeDemo {
    public static void main(String[] args) {
        int x;
//        x is accessible from everywhere within main

        x = 10;

        if (x == 10); {
            int y = 20;
            System.out.println(x);
        }

//        System.out.println(x +y);
//        y is NOT accsessible ouside the code block it ws created
    }
}
