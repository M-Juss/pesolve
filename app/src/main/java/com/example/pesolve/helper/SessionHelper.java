package com.example.pesolve.helper;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.pesolve.model.UserModel;

import org.json.JSONException;
import org.json.JSONObject;

public class SessionHelper {
    public static final String USER_SESSION = "user_session";

    public static void setUserSession(Context context, UserModel user){
        try{
            JSONObject json = new JSONObject();
            json.put("id", user.getId());
            json.put("image_path", user.getImage_path());
            json.put("fullname", user.getFullname());
            json.put("email", user.getImage_path());
            json.put("password", user.getImage_path());

            SharedPreferences sharedPreferences = context.getSharedPreferences(USER_SESSION, Context.MODE_PRIVATE);
            sharedPreferences.edit().putString(USER_SESSION, json.toString());
        } catch (JSONException e ){
            throw new RuntimeException(e);
        }
    }

    public static UserModel getUserSession(Context context){
        try{
            SharedPreferences sharedPreferences = context.getSharedPreferences(USER_SESSION, Context.MODE_PRIVATE);
            String jsonString = sharedPreferences.getString(USER_SESSION, null);

            JSONObject jsonObject = new JSONObject(jsonString);
            return  new UserModel(
                    jsonObject.getInt("id"),
                    jsonObject.getString("image_path"),
                    jsonObject.getString("fullname"),
                    jsonObject.getString("email"),
                    jsonObject.getString("password")
            );

        } catch (JSONException e ){
            throw new RuntimeException(e);
        }
    }
}
