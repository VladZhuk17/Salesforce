package model;

public class Contact{

    private String salutation;
    private String firstName;
    private String lastName;
    private String phone;
    private String mobile;

    public Contact(String salutation, String firstName, String lastName, String phone, String mobile) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mobile = mobile;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }
}
