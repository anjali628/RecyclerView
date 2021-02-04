package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       initData();
       initRecyclerView();




    }

    private void initData() {


        userList=new ArrayList<>();

        userList.add(new ModelClass(R.drawable.girl1,"Ruby","10:40 am","How are you?","______________________________________"));

        userList.add(new ModelClass(R.drawable.boy1,"Tom","1:08 pm","What about you?","______________________________________"));

        userList.add(new ModelClass(R.drawable.girl2,"Doll","6:20 pm","Are you okay?","______________________________________"));

        userList.add(new ModelClass(R.drawable.boy2,"Sam","9:39 am","Well done!! Congo!","______________________________________"));

        userList.add(new ModelClass(R.drawable.girl3,"Annu","11:48 pm","Hello","______________________________________"));

        userList.add(new ModelClass(R.drawable.boy3,"Amily","7:45 pm","Yes Or No","______________________________________"));

        userList.add(new ModelClass(R.drawable.girl3,"Lucas","12:10 am","What's your good name?","______________________________________"));

        userList.add(new ModelClass(R.drawable.girl4,"Lilly","3:23 am","Tell me the truth","______________________________________"));

        userList.add(new ModelClass(R.drawable.boy4,"William","2:05 pm","Are you sure about this?","______________________________________"));





    }

    private void initRecyclerView() {


        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
}