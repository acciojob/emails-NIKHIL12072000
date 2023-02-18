package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        boolean c1=false,c2=false,c3=false,c4=false,c5=false;
        if(oldPassword.equals(password)){
            if(newPassword.length()>=8){
                c1=true;
                for(int i=0;i<newPassword.length();i++){
                    int x=(int)newPassword.charAt(i);
                    if(x>=65 && x<=90) c2=true;
                    else if(x>=97 && x<=122) c3=true;
                    else if(x>=48 && x<=57) c4=true;
                    else c5=true;
                }
            }
            if(c1 && c2 && c3 && c4 && c5) password=newPassword;
        }
    }
}
