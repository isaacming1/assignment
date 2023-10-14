public class large {


        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5};
            int large = a[0];

            for (int counter = 1; counter < a.length; counter++) {
                if (a[counter] > large) {
                    large = a[counter];
                }
            }

            System.out.println(large);
        }
    }
