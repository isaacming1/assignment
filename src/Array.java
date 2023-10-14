public class Array {

        public static void main(String[] args) {
            java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

            numbers.add(5);
            numbers.add(7);
            numbers.add(9);
            numbers.add(2);
            numbers.add(10);

            numbers.remove(Integer.valueOf(7));

            int size = numbers.size();


            System.out.println(size);
            System.out.println(numbers.contains(10));

            java.util.Collections.sort(numbers);
            System.out.println( numbers);
        }
    }

