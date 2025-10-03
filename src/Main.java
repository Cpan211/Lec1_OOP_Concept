// Entry point demonstrating core OOP concepts with this codebase.
public class Main {
    public static void main(String[] args) {
        // Interface constant
        System.out.println("Motto: " + CollegeRules.MOTTO);

        // Abstraction + Inheritance + Encapsulation
        Person alice = new Student("Alice", 20, "alice@email.com","green","Computer Science","n000001");
        Person bob   = new Professor("Bob", 50, "bob@email.com","blue","Computer Programming","FAC-12345");

        // Polymorphism (virtual dispatch)
        alice.introduce();
        bob.introduce();

        // Casting to access subtype behaviors
        Student aliceStudent = (Student) alice;
        aliceStudent.takeExam(false);

        // Composition: Student has Courses
        aliceStudent.enroll(new Course("OOP", "CP101-01"));
        aliceStudent.enroll(new Course("Data Structures", "CP201-02"));
        aliceStudent.listCourses();

        // Interface usage (CollegeRules)
        CollegeRules studentRules = aliceStudent;
        CollegeRules professorRules = (Professor) bob;
        System.out.println("Student pay (10h@$20): " + studentRules.calculatePay(10,20));
        System.out.println("Professor pay (14h@$20): " + professorRules.calculatePay(14,20));

        // Party planning behaviors via Person's contract
        aliceStudent.canDj(true);
        ((Professor) bob).sendInvitation();
        System.out.println("Can professor bring alcohol? " + ((Professor) bob).canBringAlcohol());

        // Polymorphism over an array of base type
        Person [] people = new Person[]{
                alice,
                new Student("Carol", 19, "carol@email.com","brown","CS","n000002"),
                new Student("Dan", 21, "dan@email.com","hazel","IT","n000003"),
                bob,
                new Professor("Eve", 44, "eve@email.com","gray","Mathematics","FAC-99999")
        };

        for(Person p : people){
            p.introduce();
        }
    }
}