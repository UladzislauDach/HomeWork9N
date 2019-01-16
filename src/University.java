import java.io.Serializable;

public class University implements Serializable {
    String nameUniversity;
    int yearFoundation;

    public University(String nameUniversity, int yearFoundation) {
        this.nameUniversity = nameUniversity;
        this.yearFoundation = yearFoundation;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public int getYearFoundation() {
        return yearFoundation;
    }

    public void setYearFoundation(int yearFoundation) {
        this.yearFoundation = yearFoundation;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameUniversity='" + nameUniversity + '\'' +
                ", yearFoundation=" + yearFoundation +
                '}';
    }
}
