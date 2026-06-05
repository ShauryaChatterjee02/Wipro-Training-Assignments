package com.sdet;

public class App {

    public int userLogin(String username, String password)
    {
        if(username.equals("abc") && password.equals("abc123"))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}