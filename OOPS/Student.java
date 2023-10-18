
public class Student {

    public String name;
    private int rollNumber;
    // final int cgpa;
    private static int numStudents;

    // Constructor
    public Student(String n, int num) {
        this.name = n;
        this.rollNumber = num;
        numStudents++;
    }

    public Student(String n) {
        this.name = n;
        this.rollNumber = numStudents;
    }

    public Student() {
        this.name = "abc";
        this.rollNumber = 11;
    }

    public static int getNumStudent() {
        // System.out.println(rollNumber);
        // static functions cannot use non static variables, non static functions and
        // cannot use this or super keyword
        return numStudents;
    }

    public void print() {
        System.out.println(name + " " + rollNumber);
    }

    // Getter
    public int getRollNumber() {
        return this.rollNumber;
    }

    // Setter
    public void setRollNumber(int rollNumber) {
        if (rollNumber <= 0) {
            return;
        }
        this.rollNumber = rollNumber;
    }
}
