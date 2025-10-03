/**
 * Student demonstrates inheritance, interface implementation, encapsulation, and composition.
 */
public class Student extends Person implements CollegeRules{
    private String program;
    private String studentID;
    private Course [] courses;

    public Student(String name, int age, String email, String eyeColor, String program, String studentID) {
        super(name, age, email, eyeColor);
        this.program = program;
        this.studentID = studentID;
        this.courses = new Course[MAX_COURSES];
    }

    @Override
    public void introduce() {
            System.out.println("Hello my name is : " +  super.getName() + " My age is: " + age + " my student id is " + studentID + ", program: " + program);
    }

    public void takeExam(boolean hasTakenExam){
        if(hasTakenExam)
            System.out.println("Yes, the exam was quite easy");
        else
            System.out.println("No, I don't know what to expect!");
    }

    @Override
    public String getID() {
        return this.studentID;
    }

    @Override
    public double calculatePay(int hours, double rate) {
        double maxHours = MAX_COURSES * 2.5;
        if(hours <= maxHours){
            return hours * rate;
        }else
            return maxHours * rate;
    }

    // PartyPlanner behaviors inherited from Person are implemented here for Student context
    @Override
    public void canDj(boolean canPersonDJ) {
        if(canPersonDJ)
            System.out.println("Yes they can DJ");
        else
            System.out.println("We'd rather have a playlist made ");
    }

    @Override
    public void sendInvitation() {
        System.out.println("My name is : " + getName() + " I have sent all of the invites ");
    }

    @Override
    public boolean canBringAlcohol() {
        return false;
    }

    // Composition: Student has Courses
    public boolean enroll(Course course){
        for (int i = 0; i < courses.length; i++){
            if(courses[i] == null){
                courses[i] = course;
                return true;
            }
        }
        System.out.println("Cannot enroll: reached max courses (" + MAX_COURSES + ")");
        return false;
    }

    public void listCourses(){
        System.out.println(getName() + " enrolled courses:");
        for (Course c : courses){
            if(c != null)
                System.out.println(" - " + c);
        }
    }

    public boolean drop(String courseName){
        for (int i = 0; i < courses.length; i++){
            if(courses[i] != null && courseName.equals(courses[i].getName())){
                courses[i] = null;
                return true;
            }
        }
        return false;
    }
}
