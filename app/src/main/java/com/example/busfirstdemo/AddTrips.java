package com.example.busfirstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.Timer;

public class AddTrips extends AppCompatActivity {

    private Button add;
    private AutoCompleteTextView from,destination;
    private EditText date,time,coach,fare,arrival;
    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;
    Calendar calendar;
    Timer timer;
    DatabaseReference reference;
    String places[]=new String[] {"Dhaka","Chittagong","Comilla","Sylhet","Barisal","Khulna","Rangpur","Jessore","Bagura","Rajshahi","Chapai Nawabganj","Noakhali","Chandpur","Habiganj","Benapole","Cox's Bazar","Bandarban","Khagrachari","Lama","Ali kadam","Natore","Panchagarh","Thakurgaon","Kuakata","Teknaf","Tetulia","Dinajpur","kurigram"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_add_trips);

        add=findViewById(R.id.add);
        from=findViewById(R.id.from);
        destination=findViewById(R.id.destination);
        date=findViewById(R.id.date);
        time=findViewById(R.id.time);
        arrival=findViewById(R.id.arrival);
        coach=findViewById(R.id.coach);
        fare=findViewById(R.id.fare);
        calendar=Calendar.getInstance();
        from.setAdapter(new ArrayAdapter<>(AddTrips.this, android.R.layout.simple_list_item_1,places));
        destination.setAdapter(new ArrayAdapter<>(AddTrips.this, android.R.layout.simple_list_item_1,places));
        reference= FirebaseDatabase.getInstance().getReference();
        //datePickerDialog.getDatePicker().setMinDate(calendar.getTimeInMillis());
        DatePickerDialog.OnDateSetListener Date=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,day);
                updateDate();
            }
        };
       // datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis()-1000);
        TimePickerDialog.OnTimeSetListener Time=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int Hour, int minute) {
                calendar.set(Calendar.HOUR_OF_DAY,Hour);
                calendar.set(Calendar.MINUTE,minute);
                showTime();
            }
        };

        TimePickerDialog.OnTimeSetListener Time2=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int Hour, int minute) {
                calendar.set(Calendar.HOUR_OF_DAY,Hour);
                calendar.set(Calendar.MINUTE,minute);
                showTime2();
            }
        };

        date.setOnClickListener(view -> {
            new DatePickerDialog(AddTrips.this,Date,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
        });

        time.setOnClickListener(view -> {
            new TimePickerDialog(AddTrips.this,Time,calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),true).show();
        });
        arrival.setOnClickListener(view -> {
            new TimePickerDialog(AddTrips.this,Time2,calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),true).show();
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String From=from.getText().toString().trim();
                String Destination=destination.getText().toString().trim();
                String dates=date.getText().toString().trim();
                String times=time.getText().toString().trim();
                String Arrival=arrival.getText().toString().trim();
                String Coach=coach.getText().toString().trim();
                String f=fare.getText().toString().trim();
                TripAvailable tripAvailable=new TripAvailable();
                tripAvailable.setCoach(Coach);
                tripAvailable.setDate(dates);
                tripAvailable.setDestine(Destination);
                tripAvailable.setFrom(From);
                tripAvailable.setTimes(times);
                tripAvailable.setFare(f);
                tripAvailable.setArrival(Arrival);
                String datt= String.valueOf(calendar.get(Calendar.YEAR))+String.valueOf(calendar.get(Calendar.MONTH)+1)+String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
                datt.replace("","");
                reference.child("Trips").child(From+Destination).child(datt).child(Coach).setValue(tripAvailable);
                HashMap<String,String> seats=new HashMap<>();
                String nam="seat";
                for (int i=0;i<40;i++){
                    seats.put(nam+String.valueOf(i),"true");
                }
                reference.child("Seats").child(datt).child(From+Destination).child(Coach).child("seat").setValue(seats);
                Toast.makeText(AddTrips.this, "Trip Added", Toast.LENGTH_SHORT).show();
                time.setText("");
                arrival.setText("");
                coach.setText("");
            }
        });
    }

    private void updateDate() {
        String mformat="dd/mm/yy EEEE";
        SimpleDateFormat dateFormat=new SimpleDateFormat(mformat, Locale.US);
        date.setText(dateFormat.format(calendar.getTime()));
    }

    private void showTime(){
        String timeFormat="h:mm a";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(timeFormat,Locale.US);
        time.setText(simpleDateFormat.format((calendar.getTime())));
    }
    private void showTime2(){
        String timeFormat="h:mm a";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(timeFormat,Locale.US);
        arrival.setText(simpleDateFormat.format((calendar.getTime())));
    }
}