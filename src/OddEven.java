public class OddEven {
    public static void main(String[] args) {

        int num = 5;
        for (int i = 0; i < num; i++) {
            int number = (int) (Math.random() * 10);


            if (number % 2 == 0) {
                System.out.println(number + " even");
            } else {
                System.out.println( number + " odd");
            }

        }

    }

}