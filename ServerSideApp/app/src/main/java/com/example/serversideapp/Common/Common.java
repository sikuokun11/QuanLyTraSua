package com.example.serversideapp.Common;

import com.example.serversideapp.Model.User;

public class Common {
    public static User currunent_User;

    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On My Way";
        else
            return "Shipped";
    }
    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
}
