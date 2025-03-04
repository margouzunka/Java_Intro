package l3_operators;

public class ContinueToLabel {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            System.out.print("\nOuter loop: run nr. " + i + "; inner loop");
            for (int j = 1; j < 10; j++) {
                if (j == 5)  continue ;

                System.out.print(j);
            }
        }
    }
}
