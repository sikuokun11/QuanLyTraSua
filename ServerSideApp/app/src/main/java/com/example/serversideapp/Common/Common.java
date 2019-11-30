package com.example.serversideapp.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;


import com.example.serversideapp.Model.User;

public class Common {
    public static User currunent_User;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static boolean isConnectedToInterner(Context context)
    {

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if(connectivityManager != null)
        {
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if(info != null)
            {
                for(int i = 0; i<info.length;i++)
                {
                    if(info[i].getState() == NetworkInfo.State.CONNECTED)
                        return true;
                }

            }

        }

        return false;
    }
}


