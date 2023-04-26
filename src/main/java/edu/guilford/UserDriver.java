package edu.guilford;

import java.util.Scanner;


public class UserDriver 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

   // String password = "password";

        System.out.println("Please enter your first name: ");
        String firstname = input.nextLine();

        System.out.println("Please enter your last name: ");
        String lastname = input.nextLine();

        System.out.println("Please enter your email: ");
        String email = input.nextLine();

        // System.out.println("Please enter your password: ");
        // String password = input.nextLine();

        System.out.println("Please enter your favorite color: ");
        String color = input.nextLine();

        System.out.println("Please enter your age: ");
        String age = input.nextLine();

        UserClass user = new UserClass(firstname, lastname, email, color, age);

        //print out the user password
        System.out.println("Your password is: " + user.generatePassword(firstname, lastname, color, age));
        //print  the encrypted password
        System.out.println("Your encrypted password is: " + AES.encryptPassword(user.generatePassword(firstname, lastname, color, age)));
        //print the decrypted password
        System.out.println("Your decrypted password is: " + AES.decryptPassword(AES.encryptPassword(user.generatePassword(firstname, lastname, color, age))));

        //create a new user object
        UserClass user2 = new UserClass(firstname, lastname, email, color, age);

        //get the new user's information
        System.out.println("Please enter your first name: ");
        String firstname2 = input.nextLine();

        System.out.println("Please enter your last name: ");
        String lastname2 = input.nextLine();

        System.out.println("Please enter your email: ");
        String email2 = input.nextLine();

        //get the user color 
        System.out.println("Please enter your favorite color: ");
        String color2 = input.nextLine();

        System.out.println("Please enter your age: ");
        String age2 = input.nextLine();

        //print the user's password
        System.out.println("Your password is: " + user2.generatePassword(firstname2, lastname2, color2, age2));

        //print the encrypted password
        System.out.println("Your encrypted password is: " + AES.encryptPassword(user2.generatePassword(firstname2, lastname2, color2, age2)));

        //print the decrypted password

        System.out.println("Your decrypted password is: " + AES.decryptPassword(AES.encryptPassword(user2.generatePassword(firstname2, lastname2, color2, age2))));



        





    }
}
