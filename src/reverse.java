public class reverse {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String reversed = reverse(s);
        System.out.println(reversed);
    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }
}


