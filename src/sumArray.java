public class sumArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int control = 0;

        for (int counter = 0; counter < a.length; counter++) {
            control += a[counter];
        }

        System.out.println(control);
    }
}