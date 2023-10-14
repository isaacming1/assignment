public class average {

    public int grade;

    public average(int grade) {

        this.grade = grade;
    }

    public static int cal(average[] ages) {
        int cul = 0;

        for (average age : ages) {
            cul += age.grade;
        }

        return cul / ages.length;
    }

    public static void main(String[] args) {
        average[] ages = {
                new average( 90),
                new average(85),
                new average(88)
        };

        int averageGrade = cal(ages);
        System.out.println("Average Grade: " + averageGrade);
    }
}

