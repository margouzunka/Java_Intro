package l2_operators;

public class NestedSwitchDemo {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 'A';
        ch2 = 'B';

        switch (ch1) {
            case 'A':
                System.out.println("It is outer switch");
                switch (ch2) {
                    case 'B':
                        System.out.println("It is inner switch");
                        break;
                }
        }
    }
}
