public class positivenegative {
    public static void main(String[] args) {

        int num = 5;
        for (int i = 0; i < num; i++) {
            int number = (int) (Math.random() * 25) - 10;



            if (number < 0) {
                System.out.println(number + " negative");
            } else {
                System.out.println( number + " positive");



            }

        }


    }

}
