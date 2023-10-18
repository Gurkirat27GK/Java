
public class StudentUse {
    public static void main(String args[]) {
        Student s1 = new Student("GK", 27); // creating a new student object where s1 is reference to that object
        // Student s2 = new Student();
        Student s2 = new Student("Gurkirat");

        s1.print();
        s2.print();

        // s1.name = "Gurkirat";
        // s1.rollNumber = 2110992442; (not possible)
        s1.setRollNumber(2110992442);

        System.out.println(s1.name + " " + s1.getRollNumber());
        System.out.println(Student.getNumStudent());
        System.out.println(s1.getNumStudent());
    }
}
