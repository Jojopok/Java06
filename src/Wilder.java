public class Wilder {
    private String firstname;
    private boolean present;

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String setFirstname(String firstname) {
        return this.firstname;
    }

    public boolean isPresent() {
        return this.present;
    }

    public boolean setPresent(boolean present) {
        return this.present;
    }

    public String whoAmI() {
        return "Je m'appelle " + this.firstname + " et je suis " + (this.present ? "" : "pas ") + "present.";
    }

}
