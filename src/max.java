public class max {

    public static void main(String[] args) {
        int number1 = 21;
        int number2 = 98;
        int max = max(number1, number2);
        System.out.println(max);
    }

    public static int max(int num1, int num2) {
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }
}
