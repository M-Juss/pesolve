package com.example.pesolve.helper;

import android.content.Context;
import android.content.Intent;

public class NavHelper {

    public static void navigate(Context context, Class<?> destination){
        context.startActivity(new Intent(context, destination));
    }

    public static void navigate(Context context, Class<?> destination, int id){
        context.startActivity(new Intent(context, destination).putExtra("id", id));
    }
}
