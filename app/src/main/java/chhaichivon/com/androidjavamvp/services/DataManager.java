package chhaichivon.com.androidjavamvp.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import chhaichivon.com.androidjavamvp.User;

/**
 * Created by chhaichivon on 2/10/18.
 */

public class DataManager {

    private static DataManager  dataManager;

    private static DataManager sInstance(){
        if(dataManager == null){
             dataManager = new DataManager();
        }
        return dataManager;
    }


    User  user;
    List<User> users = new ArrayList<>();

    public List<User> getUser(){
        user = new User("aa","aa@gmail.com", Calendar.getInstance().getTime());
        users.add(user);



        return users;
    }
}
