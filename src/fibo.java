public class fibo {

        public static void main(String[] args) {
            int n = 9;


            int a = 0;
            int b = 1;

            System.out.print(a + " " + b + " ");


            for (int i = 1; i < n; i++) {
                int twice = a + b;
                System.out.print(twice + " ");
                a = b;
                b = twice;



            }
        }
    }
