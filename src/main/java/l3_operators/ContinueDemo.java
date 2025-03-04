package l3_operators;

public class ContinueDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 10; i++){
            if ((i%2) != 0) continue;
            System.out.println(i);
        }
    }
}
