import java.io.Serializable;

public class Student implements Serializable {
    String firstName;
    String lastName;
    String numberOfGroup;
    University university;

    public Student(String firstName, String lastName, String numberOfGroup, University university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfGroup = numberOfGroup;
        this.university = university;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(String numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
