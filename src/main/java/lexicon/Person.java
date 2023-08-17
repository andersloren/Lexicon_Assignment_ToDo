package lexicon;

public class Person {

    // ******
    // Fields
    // ******

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    // **************
    // Constructor(s)
    // **************

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    // *******
    // Methods
    // *******

    public String getSummary() {
        return "id: " + getId() +
                ", name: " + getFirstName() + " " + getLastName() +
                ", email: " + getEmail();
    }


    // *****************
    // Getters & Setters
    // *****************

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
