package com.example.busfirstdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<TripAvailable>list;
    TripAdapter tripAdapter;
    TextView textView;
    DatabaseReference databaseReference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.recycle);
        textView=findViewById(R.id.textView);
        String from=getIntent().getExtras().getString("From").trim();
        String to=getIntent().getExtras().getString("Destination").trim();
        String year=getIntent().getExtras().getString("year").trim();
        String month=getIntent().getExtras().getString("month").trim();
        String day=getIntent().getExtras().getString("day").trim();
        String mail=getIntent().getExtras().getString("email").trim();
        String date=year+month+day;
        textView.setText(date);
        String s1=from+to;
        databaseReference= FirebaseDatabase.getInstance().getReference().child("Trips").child(s1).child(date);
        list=new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tripAdapter=new TripAdapter(this,list,date,mail);
        recyclerView.setAdapter(tripAdapter);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot:snapshot.getChildren()){
                    TripAvailable tripAvailable=dataSnapshot.getValue(TripAvailable.class);
                    list.add(tripAvailable);
                }
                tripAdapter.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}