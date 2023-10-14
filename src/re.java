public class re {

        public static void main(String[] args) {
            String s = "Hello, world!";
            String r = rev(s);
            System.out.println(r);
        }

        public static String rev(String s) {
            String r = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                r += s.charAt(i);
            }

            return r;
        }
    }
