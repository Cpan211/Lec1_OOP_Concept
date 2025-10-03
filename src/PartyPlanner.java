public interface PartyPlanner {
    /**
     * Describe whether a person can DJ.
     */
    void canDj(boolean canPersonDJ);

    /**
     * Send invitations to a party.
     */
    void sendInvitation();

    /**
     * Indicates whether the person can bring alcohol.
     */
    boolean canBringAlcohol();
}
