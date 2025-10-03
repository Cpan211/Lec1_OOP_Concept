/**
 * Course is a simple value object used to demonstrate composition.
 */
public class Course  {

    private String name ;

    private String section;

    private double grades;

    public Course(String name, String section) {
        this.name = name;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + " (" + section + ")";
    }
}
