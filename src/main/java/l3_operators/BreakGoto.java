package l3_operators;

public class BreakGoto {
    public static void main(String[] args) {

        int i;

        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is equal to " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        System.out.println("Won't be printed");
                    }
                    System.out.println("after code block three");
                }
                System.out.println("after code block two");
            }
            System.out.println("after code block one");
        }
        System.out.println("after loop for");
    }
}