package chhaichivon.com.androidjavamvp.ui.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import chhaichivon.com.androidjavamvp.R;
import chhaichivon.com.androidjavamvp.User;
import chhaichivon.com.androidjavamvp.UserAdapter;


public class MainActivity extends AppCompatActivity {

    private User user;
    private List<User> users = new ArrayList<>();
    private UserAdapter userAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.my_recycler_view);
        userAdapter = new UserAdapter(users);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(userAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        data();
    }


    public void data(){
        for (int i = 0 ; i < 100 ; i++){
            user = new User("aa "+  i , "bb"+i+"@gmail.com",new Date());
            users.add(user);
        }
    }


}
