package com.example.busfirstdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class Payment extends AppCompatActivity {

    Button confirm;
    DatabaseReference databaseReference;
    HashMap<String ,String>update;
    long count=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ArrayList<String>seats=getIntent().getExtras().getStringArrayList("Seats");
        int fare=getIntent().getExtras().getInt("fare");
        String from=getIntent().getExtras().getString("from");
        String to=getIntent().getExtras().getString("to");
        String mail=getIntent().getExtras().getString("mail");
        String coach=getIntent().getExtras().getString("coach");
        String date=getIntent().getExtras().getString("date");
        confirm=findViewById(R.id.button);
        databaseReference=FirebaseDatabase.getInstance().getReference().child("Seats").child(date).child(from+to).child(coach).child("seat");
        confirm.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               for (int i=0;i<seats.size();i++){
                   String val=seats.get(i);
                   databaseReference.child(val).setValue("false");
               }
               Toast.makeText(Payment.this, "Payment Done", Toast.LENGTH_SHORT).show();
               Intent intent=new Intent(Payment.this,Welcome.class);
               startActivity(intent);
           }
       });
    }
}