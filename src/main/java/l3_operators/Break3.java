package l3_operators;

public class Break3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            System.out.println("\nDute loop counter: " + 1);
            System.out.print("Inner loop counter: ");
            int t = 0;
            while (t < 100) {
                if (t == 10) break;

                System.out.print(t + " ");
                t++;
            }
        }
    }
}
