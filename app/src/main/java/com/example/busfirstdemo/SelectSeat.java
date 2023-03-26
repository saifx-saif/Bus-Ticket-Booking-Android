package com.example.busfirstdemo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectSeat extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    seatSelectAdapter selectAdapter;
    ArrayList<Seats> list;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_select_seat);
        recyclerView=findViewById(R.id.recycle);
        textView=findViewById(R.id.textView);
        String date=getIntent().getExtras().getString("Date").trim();
        String mail=getIntent().getExtras().getString("mail").trim();
        String coach=getIntent().getExtras().getString("coach").trim();
        String from=getIntent().getExtras().getString("from").trim();
        String to=getIntent().getExtras().getString("to").trim();
        int fare=Integer.parseInt(getIntent().getExtras().getString("fare").trim());
        String dates=String.valueOf(date);
        String froms=String.valueOf(from)+String.valueOf(to);
        String coaches=String.valueOf(coach);
        textView.setText(dates+" "+froms+" "+coaches);
        databaseReference=FirebaseDatabase.getInstance().getReference().child("Seats").child(dates).child(froms).child(coaches);
        list=new ArrayList<>();
        selectAdapter=new seatSelectAdapter(this,list,fare,from,to,mail,coach,dates);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(selectAdapter);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snapshot1:snapshot.getChildren()){
                    Seats seats=snapshot1.getValue(Seats.class);
                    list.add(seats);
                }
                selectAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}