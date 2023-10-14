public class bre110 {

    public static void main(String[] args) {
        int count = 0;

        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
                count++;

                if (count == 10) {
                    break;
                }
            }
        }
    }
}