import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serializeStudent();
        //deSerializeStudent();
        serializeListStudent();
    }

    public static void serializeStudent() throws IOException {
        Student student1 = new Student("Edward", "Protas", "30112114",
                new University("BGTU", 1992));
        FileOutputStream fos = new FileOutputStream("objectFile");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student1);
        oos.close();
    }

    public static void deSerializeStudent() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("objectFile");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student newStudent = (Student) ois.readObject();
        System.out.println(newStudent.getFirstName() + newStudent.getLastName()
                + newStudent.getNumberOfGroup() + newStudent.getUniversity());
    }

    public static void serializeListStudent() throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("A", "A", "1",
                new University("AA", 11)));
        students.add(new Student("B", "B", "2",
                new University("BB", 22)));
        students.add(new Student("C", "C", "3",
                new University("CC", 33)));

        FileOutputStream fos = new FileOutputStream("listObjectFile");
        ObjectOutputStream ois = new ObjectOutputStream(fos);
        ois.writeObject(students);

    }

}
