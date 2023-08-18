package lexicon.model;

public class Person {

    // ******
    // Fields
    // ******

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    // **************d
    // Constructor(s)
    // **************

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }


    // *******
    // Methods
    // *******

    public String getSummary() {
        return "id: " + getId() +
                ", name: " + getFirstName() + " " + getLastName() +
                ", email: " + getEmail();
    }

    // ******************************************
    // Overridden methods from 'java.lang.Object'
    // ******************************************

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
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
        if (firstName == null) throw new IllegalArgumentException("First name cannot be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Last name cannot be null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email cannot be null");
        this.email = email;
    }
}
