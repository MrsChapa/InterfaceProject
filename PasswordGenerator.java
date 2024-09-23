/**
* @author Joaquin Galapon
*
*/
interface PasswordGenerator {

/**
* asks the user if they need a symbol for their password
* to be used in the generatePassword method
*/
public boolean symbolNeeded();

/**
* generates the password
* can be done with random char's
* password length is determined by either the user in the Custom class, or is automatically set at 8 in the 8Letter class
* to be saved in the password variable created in the class
*/
public void generatePassword(int length);

/**
* runs generatePassword again
* this was to reach the method limit tbh :D
*/
public void regeneratePassword();

/**
* returns the password variable defined in the class
*/
public String getPassword();

/**
* returns the length of the password variable
* again made to reach the method limit :)
public int getLength();

}