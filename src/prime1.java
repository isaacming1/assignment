public class prime1 {
        public static void main(String[] args) {
            int n = 11;
            boolean p = i(n);
            System.out.println(p);
        }

        public static boolean i(int x) {
            if (x < 2) return false;
            if (x < 4) return true;
            if (x % 2 == 0) return false;
            for (int d = 3; d * d <= x; d += 2)
                if (x % d == 0) return false;
            return true;
        }
    }

