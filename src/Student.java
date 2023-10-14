
public class Student {
    public String name;
    public int age;
    public int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String Name() {
        return name;
    }

    public void pName(String name) {
        this.name = name;
    }

    public int Age() {
        return age;
    }

    public void pAge(int age) {
        this.age = age;
    }

    public double Grade() {
        return grade;
    }

    public void pGrade(int grade) {
        this.grade = grade;
    }

    public String String() {
        return "name + grade + age";
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student("Isaac", 17, 11);
        student.printStudentDetails();

        ;
    }

}


