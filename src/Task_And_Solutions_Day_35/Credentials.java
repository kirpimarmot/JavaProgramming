package Task_And_Solutions_Day_35;

public class Credentials {
    private String userName, password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password)){
            System.err.println("Password\""+password+"\" is not a strong password");
        }
        this.password = password;
    }

    public boolean isStrongPassword( String password){
        boolean r1= password.length()>=8 ||! password.contains(" ");
        boolean r2= false; // has uppercase
        boolean r3= false; // has lowercase
        boolean r4= false; //has digit
        boolean r5= false; //has special character

        for ( char each: password.toCharArray()) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            }else if (Character.isDigit(each)){
                r4=true;
            }else{
                r5=true;
            }
        }
        return r1 && r2 && r3 && r4 && r5;
    }
}
/*
2. create a class named Credentials
            Variables:
                username, password
            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit
                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password
                toString():
            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */