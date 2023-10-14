public class Person {

        private String name;
        private int age;
        private String address;

        private Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        private String pName() {
            return name;
        }

        private void pName(String name) {
            this.name = name;
        }

        private int pAge() {
            return age;
        }

        private void pAge(int age) {
            this.age = age;
        }

        private String pAddress() {
            return address;
        }

        private void pAddress(String address) {
            this.address = address;
        }
    }


