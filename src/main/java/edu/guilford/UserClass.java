package edu.guilford;

public class UserClass {
    //attributes
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String color;
    private String age;

    //constructor
    public UserClass(String firstname, String lastname, String email,  String color, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = generatePassword(firstname, lastname, color, age) ;
        this.color = color;
        this.age = age;
    }

    //getters and setters
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;

    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return this.age;

    }

    //create a method to generate a password based on the user's first name, last name, color, and age
    public String generatePassword(String firstname, String lastname, String color, String age) {
        String password = firstname.substring(0, 2) + lastname.substring(0, 2) + color.substring(0, 2) + age.substring(0, 2);
        return password;
    }


}
    

