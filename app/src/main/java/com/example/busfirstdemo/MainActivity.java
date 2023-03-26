package com.example.busfirstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button search_buses;
    private AutoCompleteTextView from,destination;
    private EditText date;
    private ImageView profile;
    DatePickerDialog datePickerDialog;
    Calendar calendar;

    String places[]=new String[] {"Dhaka","Chittagong","Comilla","Sylhet","Barisal","Khulna","Rangpur","Jessore","Bagura","Rajshahi","Chapai Nawabganj","Noakhali","Chandpur","Habiganj","Benapole","Cox's Bazar","Bandarban","Khagrachari","Lama","Ali kadam","Natore","Panchagarh","Thakurgaon","Kuakata","Teknaf","Tetulia","Dinajpur","kurigram"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        search_buses=findViewById(R.id.search_buses);
        from=findViewById(R.id.from);
        destination=findViewById(R.id.destination);
        date=findViewById(R.id.date);
        profile=findViewById(R.id.profile);
        calendar=Calendar.getInstance();
        from.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,places));
        destination.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,places));

        DatePickerDialog.OnDateSetListener Date=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,day);
                updateDate();
            }
        };

        date.setOnClickListener(view -> {
            new DatePickerDialog(MainActivity.this,Date,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
        });

        String email=getIntent().getExtras().getString("email");
        search_buses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String From=from.getText().toString().trim();
                String Destination=destination.getText().toString().trim();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("From",From);
                intent.putExtra("Destination",Destination);
                intent.putExtra("year", String.valueOf(calendar.get(Calendar.YEAR)));
                intent.putExtra("month", String.valueOf(calendar.get(Calendar.MONTH)+1));
                intent.putExtra("day", String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });
    }

    private void updateDate() {
        String mformat="dd/mm/yy EEEE";
        SimpleDateFormat dateFormat=new SimpleDateFormat(mformat, Locale.US);
        date.setText(dateFormat.format(calendar.getTime()));
    }
}