public interface CollegeRules {
    /**
     * Maximum number of courses a person can be associated with.
     */
    int MAX_COURSES = 5;

    /**
     * College motto
     */
    String MOTTO = "Carpe opportunitas – seize the opportunities";

    /**
     * Unique identifier for a community member (e.g., student id, faculty id).
     */
    String getID();

    /**
     * Calculate pay according to college rules given hours and rate.
     */
    double calculatePay(int hours, double rate);
}
