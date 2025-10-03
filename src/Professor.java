/**
 * Professor demonstrates inheritance, interface implementation, and polymorphism.
 */
public class Professor extends Person implements CollegeRules{

    private String department;
    private String facultyNummber;

    public Professor(String name, int age, String email, String eyeColor, String department, String facultyNummber) {
        super(name,age,email,eyeColor);
        this.department = department;
        this.facultyNummber = facultyNummber;
    }

    @Override
    public void introduce() {
        System.out.println("Hello my name is : " +  super.getName() + " My age is: " + age + " my faculty id is " + facultyNummber + ", department: " + department);
    }

    @Override
    public String getID() {
        return this.facultyNummber;
    }

    @Override
    public double calculatePay(int hours, double rate) {
        int maxHours = 12;
        if(hours <= maxHours){
            return hours * rate;
        }else
            return maxHours * rate;
    }

    @Override
    public void canDj(boolean canPersonDJ) {
        System.out.println("It doesn't matter if is " + canPersonDJ + " or " + !canPersonDJ + " " + super.getName() + " cannot dj to save their life");
    }

    @Override
    public void sendInvitation() {
        System.out.println(getName() + " sent all the invites ");
    }

    @Override
    public boolean canBringAlcohol() {
        return true;
    }
}
