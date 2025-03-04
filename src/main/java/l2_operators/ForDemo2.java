package l2_operators;

import java.io.IOException;

public class ForDemo2 {
    public static void main(String[] args) throws IOException {
        int i = 0;

        for (; ;) {
            System.out.println("Loop nr." + i);
            i++;
            if (i == 10) break;
        }
        int sum = 0;
        for (int x = 1; x <= 5; sum += x++);
        System.out.println(sum);

    }
}
