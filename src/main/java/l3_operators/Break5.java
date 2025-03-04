package l3_operators;

public class Break5 {
    public static void main(String[] args) {
        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++) {
                    System.out.print(k + " ");
                    if (k == 5) break done;
                }
            System.out.println("after loop with counter k");
        }
        System.out.println("after loop with counter j");
    }
    System.out.println("after loop with counter i");
}
}

