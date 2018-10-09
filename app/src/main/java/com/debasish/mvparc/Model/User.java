package com.debasish.mvparc.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class User implements IUser {

    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int isValidated() {

        // 1. Check email is empty
        // 2. Check the email format matches the PATTERN
        // 3. Check the password length is > 6
       /* return !TextUtils.isEmpty(email) &&
            Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
    getPassword().length() > 6;*/

       if(TextUtils.isEmpty(getEmail()))
           return 1;
       else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
           return 2;
       else if (TextUtils.isEmpty(getPassword()))
           return 3;
       else if (getPassword().length() <= 6)
           return 4;
       else
           return -1;
    }

}
