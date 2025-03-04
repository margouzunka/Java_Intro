package l2_operators;

import java.io.IOException;
public class kbIn {
    public static void main(String[] args) throws IOException {
        char ch;

        System.out.println("Press any key, then press [Enter]");

        ch = (char) System.in.read();

        System.out.println("You've pressed button " + ch);

    }
}