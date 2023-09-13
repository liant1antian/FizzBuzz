public class Reduce {
    public static void main(String[] args) {
        int i = 0;
        int n = 100;
        while (n > 0) {
            boolean divisibleBy2 = n % 2 == 0;
            if (divisibleBy2) {
                n /= 2;
            } else {
                n = n - 1;

            }
            i++;


        }
        System.out.println(i);
    }
}
