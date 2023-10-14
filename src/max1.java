public class max1 {

    public static void main(String[] args) {
        int a = 25, b = 42, m = f(a, b);
        System.out.println(m);
    }

    public static int f(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}

