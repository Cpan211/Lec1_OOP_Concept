/**
 * Base abstract class demonstrating encapsulation and inheritance.
 */
public abstract class Person implements PartyPlanner {

    private String name;
    protected int age;
    private String eyeColor;
    private String email;


    public Person(String name, int age, String email, String eyeColor) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.eyeColor = eyeColor;
    }

    /**
     * Demonstrates polymorphic behavior for subclasses.
     */
    public abstract void introduce();

    public void sleep(boolean wasSleepGreat){
        if(wasSleepGreat){
            System.out.println("I slept like a baby today :)");
        }else
            System.out.println("I could use some more sleep :(" );

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getEyeColor() {
        return eyeColor;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
