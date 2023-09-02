/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.model;

/**
 *
 * @author johnc
 */
public class Email {

    private final String institution = "@cvsu.edu.ph";
    private final int defaultPasswordLength = 10;
    private String firstName;
    private String lastName;
    private String department;
    private String reserveEmail;

    @Override
    public String toString() {
        return "Email{" + "institution=" + institution + ", defaultPasswordLength=" + defaultPasswordLength + ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", reserveEmail=" + reserveEmail + ", email=" + email + ", password=" + password + '}';
    }
    
    private String email;
    private String password;

    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;

        this.email = firstName.toLowerCase().replaceAll("\\s+", "") + "." + lastName.toLowerCase().replaceAll("\\s+", "") + this.institution;
        this.password = randomPassword(this.defaultPasswordLength);
    }

    public String showInfo() {
        return """
               
               Welcome to Email Application
               Name: %s %s
               Institutional Email: %s
               Alternative Email: %s
               Password: %s
               
               CHANGE YOUR PASSWORD IMMEDIATELY UPON SUCCESSFULY LOGGING IN TO YOUR
               INSTITUTIONAL ACCOUNT.
               """.formatted(this.getFirstName(), this.getLastName(), this.getEmail(), this.reserveEmail, this.getPassword());
    }

    private String randomPassword(int length) {
        String[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*-".split("");

        String generatedPassword = "";

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) Math.floor(Math.random() * chars.length);
            generatedPassword += chars[randomIndex];
        }

        return generatedPassword;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the institution
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the reserveEmail
     */
    public String getReserveEmail() {
        return reserveEmail;
    }

    /**
     * @param reserveEmail the reserveEmail to set
     */
    public void setReserveEmail(String reserveEmail) {
        this.reserveEmail = reserveEmail;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the defaultPasswordLength
     */
    public int getDefaultPasswordLength() {
        return defaultPasswordLength;
    }
}
